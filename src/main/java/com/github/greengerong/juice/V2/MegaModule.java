package com.github.greengerong.juice.V2;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.TypeLiteral;

import java.util.ArrayList;
import java.util.List;

public class MegaModule extends AbstractModule {
  @Override
  protected void configure() {
    //    bind(FortuneService.class).annotatedWith(Funny.class).to(FunnyFortuneService.class);
    //    bind(FortuneService.class).annotatedWith(Quote.class).to(QuoteFortuneService.class);
    //    // MegaFortuneService that contains a list of the other two.
    //    bind(FortuneService.class).annotatedWith(Mega.class).to(MegaFortuneService.class);
    //    bind(new TypeLiteral<List<FortuneService>>() {})
    //        .toProvider(new FortuneServiceListProvider())
    //        .in(Singleton.class);
    bind(FunnyFortuneService.class).asEagerSingleton();
    bind(QuoteFortuneService.class).asEagerSingleton();

    bind(new TypeLiteral<List<FortuneService>>() {})
        .to(new TypeLiteral<ArrayList<FortuneService>>() {})
        .in(Singleton.class);
  }
}
