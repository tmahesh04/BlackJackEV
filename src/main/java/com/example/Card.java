package com.example;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Preconditions;
import com.google.common.collect.BiMap;
import com.google.common.collect.EnumHashBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.example.StringUtil;

import javax.annotation.concurrent.ThreadSafe;
import java.util.Arrays;
import java.util.Set;

/**
 * The class implements cards from a 52-card deck of French-suited playing cards, see {@link
 * <a href="https://en.wikipedia.org/wiki/Standard_52-card_deck">...</a>}.
 *
 * @author aps@rice.edu, Alexei Stolboushkin
 */
@ThreadSafe
public enum Card {
  SPADES_A, SPADES_2, SPADES_3, SPADES_4, SPADES_5, SPADES_6, SPADES_7, SPADES_8, SPADES_9,
  SPADES_10, SPADES_J, SPADES_Q, SPADES_K,
  HEARTS_A, HEARTS_2, HEARTS_3, HEARTS_4, HEARTS_5, HEARTS_6, HEARTS_7, HEARTS_8, HEARTS_9,
  HEARTS_10, HEARTS_J, HEARTS_Q, HEARTS_K,
  DIAMONDS_A, DIAMONDS_2, DIAMONDS_3, DIAMONDS_4, DIAMONDS_5, DIAMONDS_6, DIAMONDS_7, DIAMONDS_8,
  DIAMONDS_9, DIAMONDS_10, DIAMONDS_J, DIAMONDS_Q, DIAMONDS_K,
  CLUBS_A, CLUBS_2, CLUBS_3, CLUBS_4, CLUBS_5, CLUBS_6, CLUBS_7, CLUBS_8, CLUBS_9, CLUBS_10,
  CLUBS_J, CLUBS_Q, CLUBS_K;

  private static final int UNICODE_BASE = 0x1F0 * (16 * 16);
  public static final Function<String, Card> STRING_TO_CARD = Functions.compose(
      Card::fromUnicode,
      (String s) -> {
        Preconditions.checkNotNull(s);
        Preconditions.checkArgument(!s.isEmpty());
        return Integer.parseInt(s, 16);
      });
  public static final Ordering<Card> BY_RANK_THEN_SUIT_ORDERING =
      new Ordering<Card>() {
        @Override
        public int compare(Card left, Card right) {
          Preconditions.checkNotNull(left);
          Preconditions.checkNotNull(right);
          int byRankComparisonResult = Rank.BY_ORDINAL_NATURAL_ORDERING.compare(
              left.rank(), right.rank());
          return (byRankComparisonResult == 0)
              ? Suit.BY_ORDINAL_NATURAL_ORDERING.compare(
                  left.suit(), right.suit())
              : byRankComparisonResult;
        }};

  public enum Suit {
    SPADES,
    HEARTS,
    DIAMONDS,
    CLUBS;

    private static final BiMap<Suit, Integer> SUIT_TO_UNICODE = Maps.unmodifiableBiMap(
        EnumHashBiMap.create(ImmutableMap.of(
            // 0x2660, // SPADES
            // 0x2665, // HEARTS
            // 0x2666, // DIAMONDS
            SPADES, 0x2660,
            HEARTS, 0x2661,
            DIAMONDS, 0x2662,
            CLUBS, 0x2663)));
            // CLUBS, 0x2667)));
    public static final Ordering<Suit> BY_ORDINAL_NATURAL_ORDERING =
        Ordering.natural().onResultOf(
            (Suit suit) -> {
              return Preconditions.checkNotNull(suit).ordinal();
            });

    private Suit() {}

    /**
     * @return unicodeBase is the suit component in the Card unicode, see
     * {@link <a href="https://en.wikipedia.org/wiki/Standard_52-card_deck#Unicode">...</a>}.
     * The values are 0xA, 0xB, 0xC, 0xD for, resp., SPADES, HEARTS, DIAMONDS, and CLUBS.<p/>
     *
     * Do not confuse this value with the unicode value of the suit's character, which is
     * returned by {@link #unicode()}.
     */
    final int unicodeBaseElement() {
      return 10 + ordinal();
    }

    final static Suit fromUnicodeBaseElement(int unicodeBaseElement) {
      return Preconditions.checkNotNull(
          values()[unicodeBaseElement - 10],
          "The supplied value [" + unicodeBaseElement + "] is not valid. Valid values are 0xA," +
              " 0xB," +
              " 0xC, and 0xD.");
    }

    /**
     * For String name in uppercase, e.g., "SPADES".
     */
    public final Suit forName(String name) {
      Preconditions.checkNotNull(name);
      Preconditions.checkArgument(name.equals(name.toUpperCase()));
      return Suit.valueOf(name);
    }

    /**
     * @return the unicode value for this suit, as {@code char}.
     */
    public final char unicode() {
      return (char)(int) SUIT_TO_UNICODE.get(this);
    }

    /**
     * @return Suit for its unicode
     */
    public static final Suit forUnicode(char unicode) {
      return SUIT_TO_UNICODE.inverse().get((int) unicode);
    }

    /**
     * @return The Unicode of the suit (i.e., 0x2660 for SPADES, 0x2665 for HEARTS, 0x2666, for
     *    DIAMONDS, and 0x2663 for CLUBS).<p/>
     *
     * To obtain the suit's name, i.e., SPADES, HEARTS, DIAMONDS, or CLUBS, use {@link #name()}
     * instead.
     */
    @Override
    public final String toString() {
      return "" + unicode();
    }
  }

  private static final Set<String> HEAD_RANK_SYMBOLS = ImmutableSet.of("J", "Q", "K");
  private static final Set<String> VALUE_TEN_RANK_SYMBOLS = ImmutableSet.<String>builder()
      .addAll(HEAD_RANK_SYMBOLS)
      .add("10")
      .build();

  public enum Rank {
    ACE,
    TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
    JACK, QUEEN, KING;

    public static final Ordering<Rank> BY_ORDINAL_NATURAL_ORDERING =
        Ordering.natural().onResultOf(
            (Rank rank) -> {
              return Preconditions.checkNotNull(rank).ordinal();
            });

    private static final Function<String, Rank> BY_SYMBOL = Functions.forMap(
        ImmutableMap.<String, Rank>builder().putAll(Iterables.transform(
            Arrays.asList(values()),
            rank -> {
              Preconditions.checkNotNull(rank);
              return Maps.immutableEntry(rank.symbol, rank);
            })).build());

    private final String symbol;

    private Rank() {
      int ordinal = ordinal();
      if ((ordinal == 0) || (ordinal > 9)) {
        symbol = name().substring(0, 1);
        return;
      }
      symbol = "" + (ordinal + 1);
    }

    /**
     * @return @code true} if the card is a "head", i.e., a KING, QUEEN, or JACK.
     */
    public final boolean isHead() {
      return HEAD_RANK_SYMBOLS.contains(symbol);
    }

    /**
     * @return @code true} if the card is a "head", i.e., a KING, QUEEN, or JACK, or is a 10.
     */
    public final boolean isTenCard() {
      return VALUE_TEN_RANK_SYMBOLS.contains(symbol);
    }

    // The KNIGHT rank is excluded from 52-cards decks.
    private static final int KNIGHT_CARD_RANK_UNICODE_SUFFIX = 0xC;
    private static final String MESSAGE_FOR_KNIGHT_DISCOVERED =
        "Unicode suffix " + Integer.toString(KNIGHT_CARD_RANK_UNICODE_SUFFIX)
        + " is reserved for the rank of KNIGHT. 52-cards deck contains no KNIGHTs";

    /**
     * @return the Unicode character reflecting the rank as used in the playing cards Unicode
     *    representation, see {@link <a href=
     *        "https://en.wikipedia.org/wiki/Playing_cards_in_Unicode#Playing_Cards_block_chart"
     *    >...</a>}.<p/>
     *
     *    Please note that 52-deck cards contain no Knights, soo the returned ranks are in the
     *    following range: [1..0xB] + [0xD..0xE].
     */
    final int getUnicodeSuffix() {
      // Unicode suffixes start with 1 for ACE,
      int unicodeSuffixCandidate = ordinal() + 1;
      return (unicodeSuffixCandidate >= KNIGHT_CARD_RANK_UNICODE_SUFFIX)
          ? (unicodeSuffixCandidate + 1)
          : unicodeSuffixCandidate;
    }

    /**
     * Given the Unicode character to use is assembling the card's Unicode representation, see
     * {@link <a href=
     *     "https://en.wikipedia.org/wiki/Playing_cards_in_Unicode#Playing_Cards_block_chart"
     *     >...</a>}.<p/>
     *    Please note that 52-deck cards contain no Knights, soo the value 0xC reserved for KNIGHT
     *    is never returned.
     */
    static final Rank fromUnicodeSuffix(int unicodeSuffix) {
      Preconditions.checkArgument(unicodeSuffix <= 0xE);
      Preconditions.checkArgument(unicodeSuffix >= 1);
      Preconditions.checkArgument(
          unicodeSuffix != KNIGHT_CARD_RANK_UNICODE_SUFFIX,
          MESSAGE_FOR_KNIGHT_DISCOVERED);
      int ordinal = ((unicodeSuffix > KNIGHT_CARD_RANK_UNICODE_SUFFIX)
          ? (unicodeSuffix - 1)
          : unicodeSuffix) - 1;
      return values()[ordinal];
    }

    /**
     * @return The "symbolic" representation of the rank, see {@link #symbol()}.<p/>
     *
     * Instead, use {@link #name()} to obtain the full rank's name, i.e. ACE, TWO, ..., TEN,
     * JACK, QUEEN, or KING.
     */
    @Override
    public final String toString() {
      return symbol();
    }

    /**
     * @return The "symbolic" representation of the rank (i.e., A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J,
     *    Q, or K).
     */
    public final String symbol() {
      return symbol;
    }

    /**
     * @return the rank from its "symbolic" representation, see {@link #symbol()}.
     */
    public static Rank fromSymbol(String symbol) {
      Preconditions.checkNotNull(symbol);
      Rank rank = BY_SYMBOL.apply(symbol);
      if (null == rank) {
        throw new IllegalArgumentException(
            "The supplied rank symbol, '" + symbol + "' is not valid. Valid rank symbols are ["
            + StringUtil.ON_COMMA_SPACE_JOINER.join(
                Iterables.transform(
                    ImmutableList.copyOf(Rank.values()),
                    r -> r.symbol()))
            + ']');
      }
      return rank;
    }
  }

  /**
   * @return the rank of the card.
   */
  public final Rank rank() {
    return Rank.values()[ordinal() % Rank.values().length];
  }

  /**
   * @return the suit of the card.
   */
  public final Suit suit() {
    return Suit.values()[ordinal() / Rank.values().length];
  }

  /**
   * @return the card of the supplied rank and suit.
   */
  public static Card fromRankAndSuit(Rank rank, Suit suit) {
    Preconditions.checkNotNull(rank);
    Preconditions.checkNotNull(suit);
    Card card = values()[(Rank.values().length * suit.ordinal()) + rank.ordinal()];
    return card;
  }

  /**
   * @return the card identified by its Unicode, see {@link <a href=
   *     "https://en.wikipedia.org/wiki/Playing_cards_in_Unicode#Playing_Cards_block_chart"
   *    >...</a>}.
   */
  public static Card fromUnicode(int unicode) {
    int unicodeSansBase = unicode - UNICODE_BASE;
    int unicodeSuitElement = unicodeSansBase / 16;
    int unicodeRankSuffix = unicodeSansBase - (unicodeSuitElement * 16);
    Suit suit = Suit.fromUnicodeBaseElement(unicodeSuitElement);
    Rank rank = Rank.fromUnicodeSuffix(unicodeRankSuffix);
    return fromRankAndSuit(rank, suit);
  }

  /**
   * @return the Unicode representation of the card, see {@link <a href=
   *     "https://en.wikipedia.org/wiki/Playing_cards_in_Unicode#Playing_Cards_block_chart"
   *    >...</a>}.
   */
  public final int unicode() {
    return UNICODE_BASE
        + (16 * suit().unicodeBaseElement())
        + rank().getUnicodeSuffix();
  }

  /**
   * @return The "symbolic" representation of the card, comprised from the card's rank symbol
   *    (i.e., A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, or K) followed by the unicode character for the
   *    card's suit (i.e., 0x2660 for SPADES, 0x2665 for HEARTS, 0x2666, for DIAMONDS, and 0x2663
   *    for CLUBS).<p/>
   */
  @Override
  public final String toString() {
    return rank().toString() + suit().toString();
  }
}
