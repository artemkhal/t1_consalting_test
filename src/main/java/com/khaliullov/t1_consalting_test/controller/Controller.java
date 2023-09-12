package com.khaliullov.t1_consalting_test.controller;

import com.khaliullov.t1_consalting_test.service.SymbolCountingService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @Autowired
    SymbolCountingService symbolCountingService;


    @PostMapping("/calculate_symbols")
    public ResponseEntity<?> calculateSymbolCount(@RequestParam String text){
        val result = symbolCountingService.calculateSymbols(text);
        return ResponseEntity.ok(result);
    }


    @PostMapping("/calculate_letters")
    public ResponseEntity<?> calculateLetterCount(@RequestParam String text){
        val result = symbolCountingService.calculateLetters(text);
        return ResponseEntity.ok(result);
    }
}
