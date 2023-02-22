package com.github.greengerong.juice.V3;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class BlueGumProvider implements Provider<Gum> {

  @Inject
  Color color;

  public Gum get() {
    return new Gum(color);
  }
}
