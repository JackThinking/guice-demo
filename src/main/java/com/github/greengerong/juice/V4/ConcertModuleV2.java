package com.github.greengerong.juice.V4;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class ConcertModuleV2 extends AbstractModule {
  protected void configure() {
    bindConstant().annotatedWith(Names.named("capacity")).to("322");
    bindConstant().annotatedWith(Names.named("stage")).to("com.github.greengerong.juice.V4.Actor");
    bindConstant().annotatedWith(Names.named("setting")).to("INDOOR");
  }
}
