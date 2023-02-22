package com.github.greengerong.juice.V4;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ActionMovie {

  @Inject
  @Named("stallone")
  private Actor actor;
}
