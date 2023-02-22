package com.github.greengerong.juice.V4;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ConcertExample {

  public static void main(String[] args) {
    Injector i = Guice.createInjector(new ConcertModule());
    ConcertHall hall = i.getInstance(ConcertHall.class);
    System.out.println(hall);
  }
}
