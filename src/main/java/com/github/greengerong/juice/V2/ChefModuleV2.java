package com.github.greengerong.juice.V2;

import com.google.inject.AbstractModule;

public class ChefModuleV2 extends AbstractModule {
  protected void configure() {
    bind(FortuneService.class).to(FortuneServiceImpl.class);
  }
}
