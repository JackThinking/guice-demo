package com.github.greengerong.juice.V1;

public class Chef {

  private FortuneService fortuneService;

  public Chef() {
    this.fortuneService = FortuneServiceFactory.getFortuneService();
  }

  public void makeFortuneCookie() {
    new FortuneCookie(fortuneService.randomFortune());
  }
}
