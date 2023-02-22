package com.github.greengerong.juice.recipes;

import com.google.inject.Provider;

import java.util.Arrays;
import java.util.List;

public class FortuneListProvider implements Provider<List<String>> {
    @Override
    public List<String> get() {
        return Arrays.asList("Today you will have some refreshing juice.", "Larry just bought your company.");
    }
}
