package com.github.greengerong.juice.V3;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GumballExample {

  public static void main(String[] args) {
    // Injector injector = Guice.createInjector(new GumModule());
    Injector injector = Guice.createInjector();
    GumballMachine m = injector.getInstance(GumballMachine.class);
    System.out.println(m.dispense());
    System.out.println(m.dispense());
  }
}
