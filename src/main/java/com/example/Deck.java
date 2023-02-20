package com.example;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.example.Randoms;

import javax.annotation.concurrent.ThreadSafe;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * The class implements a 52-card deck of French-suited playing cards, see {@link
 * <a href="https://en.wikipedia.org/wiki/Standard_52-card_deck">...</a>}.<p/>
 * <p>
 * The class implements {@link Iterator<Card>}.
 *
 * @author aps@rice.edu, Alexei Stolboushkin
 */
@ThreadSafe
public final class Deck implements Iterator<Card> {
  private final List<Card> shuffled;
  private final AtomicInteger firstUndispensed;

  private Deck() {
    firstUndispensed = new AtomicInteger();
    List<Card> shuffled = Lists.newArrayList(Card.values());
    Collections.shuffle(shuffled, Randoms.random());
    this.shuffled = ImmutableList.copyOf(shuffled);
  }

  private Deck(Deck deck) {
    Preconditions.checkNotNull((deck));
    shuffled = deck.shuffled;
    firstUndispensed = new AtomicInteger(deck.firstUndispensed.get());
  }

  /**
   * Returns a new shuffled deck with no cards dispensed yet.
   */
  public static Deck newDeck() {
    return new Deck();
  }

  public final Deck copyOf() {
    return new Deck(this);
  }

  @Override
  public boolean hasNext() {
    return firstUndispensed.get() < 52;
  }

  @Override
  public Card next() {
    int index = firstUndispensed.getAndIncrement();
    if (index >= 52) {
      firstUndispensed.decrementAndGet();
      throw new NoSuchElementException();
    }
    return shuffled.get(index);
  }
}
