package com.github.greengerong.juice.V2;

import com.google.inject.Inject;
import java.util.List;
import java.util.Random;

public class MegaFortuneService implements FortuneService {
  //  private static final List<FortuneService> SERVICES =
  //      Arrays.<FortuneService>asList(new FunnyFortuneService(), new QuoteFortuneService());

  private final List<FortuneService> services;

  @Inject
  public MegaFortuneService(List<FortuneService> services) {
    this.services = services;
  }

  public String randomFortune() {
    int index = new Random().nextInt(services.size());
    return services.get(index).randomFortune();
  }
}
