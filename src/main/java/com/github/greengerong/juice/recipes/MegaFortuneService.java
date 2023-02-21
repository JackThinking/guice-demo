package com.github.greengerong.juice.recipes;

import com.github.greengerong.juice.V2.FunnyFortuneService;
import com.github.greengerong.juice.V2.QuoteFortuneService;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MegaFortuneService implements FortuneService {
  private static final List<com.github.greengerong.juice.V2.FortuneService> SERVICES =
      Arrays.<com.github.greengerong.juice.V2.FortuneService>asList(
          new FunnyFortuneService(), new QuoteFortuneService());

  public String randomFortune() {
    int index = new Random().nextInt(SERVICES.size());
    return SERVICES.get(index).randomFortune();
  }
}
