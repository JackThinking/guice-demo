package com.github.greengerong.juice.recipes;

import com.google.inject.Inject;
import java.util.List;
import java.util.Random;

public class FortuneServiceImpl implements FortuneService {
  //  private static final List<String> MESSAGES =
  //      Arrays.asList(
  //          "Today you will have some refreshing juice.", "Larry just bought your company.");

  private final List<String> messages;

  @Inject
  public FortuneServiceImpl(List<String> messages) {
    this.messages = messages;
  }

  @Override
  public String randomFortune() {
    return messages.get(new Random().nextInt(messages.size()));
  }
}
