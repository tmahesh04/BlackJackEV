package com.example;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

/**
 * Provides common utilities for working with {@link String}s.
 *
 * @author aps@rice.edu, Alexei Stolboushkin
 */
public final class StringUtil {
  private StringUtil() {}

  public static final Joiner ON_COMMA_SPACE_JOINER = Joiner.on(", ");
  public static final Joiner ON_COMMA_JOINER = Joiner.on(',');
  public static final Splitter ON_COMMA_SPLITTER = Splitter.on(',');
  public static final Splitter ON_PLUS_SPLITTER = Splitter.on('+');
  public static final Splitter ON_SLASH_SPLITTER = Splitter.on('/');
}


