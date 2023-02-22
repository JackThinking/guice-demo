package com.github.greengerong.juice.V2;

import javax.inject.Inject;

public class Chef {

  private final FortuneService fortuneService;

  @Inject
  public Chef(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  public void makeFortuneCookie() {
    new FortuneCookie(fortuneService.randomFortune());
  }
}
