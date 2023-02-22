package com.github.greengerong.juice.V4;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ConcertExampleV2 {

  public static void main(String[] args) {
    Injector i = Guice.createInjector(new ConcertModuleV2());
    ConcertHallV2 hall = i.getInstance(ConcertHallV2.class);
    System.out.println(hall);
  }
}
