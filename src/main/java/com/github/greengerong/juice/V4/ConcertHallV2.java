package com.github.greengerong.juice.V4;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ConcertHallV2 {
  private int capacity;

  @Inject
  @Named("stage")
  private Class<?> stageType;

  @Inject
  @Named("setting")
  private Setting setting;

  public String toString() {
    return String.format(
        "%s[capacity=%s, stageType=%s, setting=%s]",
        getClass().getName(), capacity, stageType, setting);
  }
}
