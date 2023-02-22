package com.github.greengerong.juice.V2;

import com.google.inject.Inject;
import java.util.List;

public class FunnyFortuneService implements FortuneService {

  @Inject
  public void register(List<FortuneService> services) {
    services.add(this);
  }

  @Override
  public String randomFortune() {
    return "FunnyFortuneService";
  }
}
