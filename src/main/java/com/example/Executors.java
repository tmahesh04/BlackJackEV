package com.example;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/**
 * A utility class providing executors.
 *
 * @author aps@rice.edu, Alexei Stolboushkin
 */
public class Executors {
  private static final int NUM_THREADS = 8;

  private static final ScheduledExecutorService SCHEDULER =
      java.util.concurrent.Executors.newScheduledThreadPool(
          NUM_THREADS,
          new ThreadFactoryBuilder()
              .setDaemon(true)
              .setNameFormat("worker-%d")
              .build());

  public static ScheduledExecutorService scheduler() {
    return SCHEDULER;
  }

  public static Executor executor() {
    return SCHEDULER;
  }
}
