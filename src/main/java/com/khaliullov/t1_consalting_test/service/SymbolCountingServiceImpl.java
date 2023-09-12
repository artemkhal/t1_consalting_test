package com.khaliullov.t1_consalting_test.service;

import lombok.val;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class SymbolCountingServiceImpl implements SymbolCountingService {


    @Override
    public Map<String, Long> calculateSymbols(String text) {
        val map = Arrays.stream(text.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return sortByValue(map);
    }


    @Override
    public Map<String, Long> calculateLetters(String text) {
        val map = Arrays.stream(text.replaceAll("[^A-Za-zА-Яа-я]", "").split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return sortByValue(map);
    }


    public Map<String, Long> sortByValue( Map<String, Long> map )
    {
        Map<String,Long> result = new LinkedHashMap<>();
        Stream<Map.Entry<String,Long>> st = map.entrySet().stream();

        st.sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(e ->result.put(e.getKey(),e.getValue()));

        return result;
    }
}
