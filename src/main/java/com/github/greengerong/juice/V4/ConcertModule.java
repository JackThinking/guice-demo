package com.github.greengerong.juice.V4;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class ConcertModule extends AbstractModule {
    protected void configure() {
        // bindConstant().annotatedWith(Names.named("capacity")).to(322);
        bindConstant().annotatedWith(Names.named("capacity")).to("322");
    }
}
