package com.khaliullov.t1_consalting_test.service;

import java.util.Map;

public interface SymbolCountingService {

    Map<String, Long> calculateSymbols(String text);

    Map<String, Long> calculateLetters(String text);
}
