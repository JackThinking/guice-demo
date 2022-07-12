package com.github.greengerong.juice.V3;

import com.google.inject.AbstractModule;

public class GumModule extends AbstractModule {
  protected void configure() {
    bind(Gum.class).toProvider(GumProvider.class);
  }
}
