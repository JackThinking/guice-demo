package com.github.greengerong.juice.recipes;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.TypeLiteral;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Injector i = Guice.createInjector(new AbstractModule() {
      protected void configure() {
        bind(new TypeLiteral<List<String>>() {
        }).toProvider(new FortuneListProvider()).in(Singleton.class);
        bind(FortuneService.class).to(FortuneServiceImpl.class);
      }
    });
    FortuneService fortuneService = i.getInstance(FortuneService.class);
    System.out.println(fortuneService.randomFortune());
  }
}
