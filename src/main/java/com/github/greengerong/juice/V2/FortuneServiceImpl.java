package com.github.greengerong.juice.V2;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FortuneServiceImpl implements FortuneService {

  private static final List<String> MESSAGE =
      Arrays.asList(
          "Today you will have some refreshing juice.", "Larry just bought your company.");

  @Override
  public String randomFortune() {
    return MESSAGE.get(new Random().nextInt(MESSAGE.size()));
  }
}
