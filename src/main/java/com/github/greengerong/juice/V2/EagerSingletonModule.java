package com.github.greengerong.juice.V2;

import com.google.inject.AbstractModule;

public class EagerSingletonModule extends AbstractModule {

  protected void configure() {
    bind(FortuneService.class).to(FortuneServiceImpl.class).asEagerSingleton();
    bind(FortuneService.class)
        .annotatedWith(Mega.class)
        .to(MegaFortuneService.class)
        .asEagerSingleton();
  }
}
