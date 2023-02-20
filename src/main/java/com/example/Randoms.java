package com.example;

import com.google.common.base.Preconditions;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author aps@rice.edu, Alexei Stolboushkin
 */
public class Randoms {
  private static final AtomicReference<byte[]> SEED = new AtomicReference<>();

  private static final class Holder {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static final Random RANDOM;

    static {
      Preconditions.checkState(INITIALIZED.compareAndSet(false, true));
      SEED.compareAndSet(
          null,
          (Randoms.class.getName() + System.currentTimeMillis())
              .getBytes(StandardCharsets.UTF_8));
      RANDOM = new SecureRandom(SEED.get());
    }
  }

  public static final void setSeed(byte[] seed) {
    Preconditions.checkNotNull(seed);
    Preconditions.checkArgument(seed.length > 0);
    Preconditions.checkState(SEED.compareAndSet(null, seed));
  }

  public static final Random random() {
    Random random = Holder.RANDOM;
    return random;
  }
}
