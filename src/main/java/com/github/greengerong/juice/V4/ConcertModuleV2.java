package com.github.greengerong.juice.V4;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class ConcertModuleV2 extends AbstractModule {
    protected void configure() {
        bindConstant().annotatedWith(Names.named("capacity")).to("322");
        // 通过类路径绑定类名
        bindConstant().annotatedWith(Names.named("stage")).to("com.github.greengerong.juice.V4.Actor");
        // 枚举 name 绑定某个枚举值
        bindConstant().annotatedWith(Names.named("setting")).to("INDOOR");
    }
}
