package com.github.greengerong.juice.V2;

import com.google.inject.ImplementedBy;

@ImplementedBy(FortuneServiceImpl.class)
public interface FortuneService {
  String randomFortune();
}
