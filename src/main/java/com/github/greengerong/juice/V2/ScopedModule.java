package com.github.greengerong.juice.V2;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.Singleton;

public class ScopedModule extends AbstractModule {

  protected void configure() {
    bind(FortuneService.class).to(FortuneServiceImpl.class).in(Singleton.class);
    bind(FortuneService.class)
        .annotatedWith(Mega.class)
        .to(MegaFortuneService.class)
        .in(Scopes.SINGLETON);
  }
}
