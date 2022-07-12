package com.github.greengerong.juice.V2;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;

public class FortuneApplication {
  public static void main(String[] args) {
    // Injector i = Guice.createInjector(new ChefModuleV2());
    // Injector injector = Guice.createInjector(new CommonSenseModule());
    // Injector injector = Guice.createInjector(new ScopedModule());
    Injector injector = Guice.createInjector(new EagerSingletonModule());
    // injector.getInstance(Key.get(FortuneService.class, Mega.class));
    Chef chef = injector.getInstance(Chef.class);
    // Chef chef = injector.getInstance(Key.get(Chef.class));
    chef.makeFortuneCookie();
  }
}
