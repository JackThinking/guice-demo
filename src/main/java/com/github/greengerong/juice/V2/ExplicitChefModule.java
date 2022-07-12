package com.github.greengerong.juice.V2;

import com.google.inject.AbstractModule;

public class ExplicitChefModule extends AbstractModule {
  protected void configure() {
    // no to(...) because you can't bind to the same class
    bind(Chef.class);
  }
}
