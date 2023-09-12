package com.khaliullov.t1_consalting_test;

import com.khaliullov.t1_consalting_test.service.SymbolCountingService;
import lombok.val;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ServiceTest {

    @Autowired
    private SymbolCountingService service;

    private String text;


    {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 700; i++) {
            builder.append("T1 Консалтинг!\"\n");
        }
        text = builder.toString();
    }


    @Test
    public void calculateSymbolsTest(){
        val map = service.calculateSymbols(text);
        assertEquals(700, map.get("T"));
        assertEquals(700, map.get("1"));
        assertEquals(700, map.get(" "));
        assertEquals(700, map.get("К"));
        assertEquals(700, map.get("о"));
        assertTrue(map.containsKey("!"));
    }

    @Test
    public void calculateLettersTest(){
        val map = service.calculateLetters(text);
        System.out.println(map);
        assertEquals(700, map.get("T"));
        assertEquals(700, map.get("К"));
        assertFalse(map.containsKey("1"));
        assertFalse(map.containsKey(" "));
        assertFalse(map.containsKey("!"));
    }
}
