package com.github.greengerong.juice.recipes;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;

interface Drinkable {

}

interface Carbonated {

}

class Water implements Drinkable, Carbonated {

}

public class SharingSingletons {

  public static void main(String[] args) {
    Injector i =
        Guice.createInjector(
            new AbstractModule() {
              protected void configure() {
                // bind(Drinkable.class).to(Water.class).in(Singleton.class);
                // bind(Carbonated.class).to(Water.class).in(Singleton.class);

                bind(Water.class).in(Singleton.class);
                bind(Drinkable.class).to(Water.class);
                bind(Carbonated.class).to(Water.class);
              }
            });
    Drinkable drinkable = i.getInstance(Drinkable.class);
    Carbonated carbonated = i.getInstance(Carbonated.class);
    System.out.println(drinkable == carbonated);
  }
}
