package com.github.greengerong.juice.V1;

public class FortuneServiceFactory {

  private static FortuneService fortuneService = new FortuneServiceImpl();

  public FortuneServiceFactory() {
  }

  public static FortuneService getFortuneService() {
    return fortuneService;
  }

  public static void setFortuneService(FortuneService mockFortuneService) {
    fortuneService = mockFortuneService;
  }
}
