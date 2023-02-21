package com.github.greengerong.juice.V2;

import com.google.inject.Inject;
import com.google.inject.Provider;

import java.util.Arrays;
import java.util.List;

public class FortuneServiceListProvider implements Provider<List<FortuneService>> {
  @Inject @Quote FortuneService quoteService;
  @Inject @Funny FortuneService funnyService;

  @Override
  public List<FortuneService> get() {
    return Arrays.asList(quoteService, funnyService);
  }
}
