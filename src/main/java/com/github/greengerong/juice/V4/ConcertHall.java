package com.github.greengerong.juice.V4;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ConcertHall {
  @Inject
  @Named("capacity")
  private Integer capacity;

  public String toString() {
    return String.format("%s[capacity=%s]", getClass().getName(), capacity);
  }
}
