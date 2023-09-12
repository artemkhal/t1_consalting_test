package com.khaliullov.t1_consalting_test;

import com.khaliullov.t1_consalting_test.service.SymbolCountingService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;


import java.util.LinkedHashMap;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SymbolCountingService service;


    @Test
    public void calculateSymbolCountTest() throws Exception {
        Mockito.when(service.calculateSymbols(Mockito.anyString())).thenReturn(new LinkedHashMap<>());
        mockMvc.perform(
                        post("/calculate_symbols")
                                .contentType(MediaType.APPLICATION_JSON)
                                .param("text", Mockito.anyString())
                )
                .andExpect(status().isOk());
    }

    @Test
    public void calculateLettersCountTest() throws Exception {
        Mockito.when(service.calculateLetters(Mockito.anyString())).thenReturn(new LinkedHashMap<>());
        mockMvc.perform(
                        post("/calculate_letters")
                                .contentType(MediaType.APPLICATION_JSON)
                                .param("text", Mockito.anyString())
                )
                .andExpect(status().isOk());
    }
}
