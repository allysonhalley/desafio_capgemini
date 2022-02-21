package com.capgemini.directSolution.question01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DirecetAnswer01Test {
    int stairSize = 6;
    String stepStair = "";    
    
    @Test
    public void testMakeStair() {        
        
        for (int i = 0; i < stairSize; i++) {
            stepStair = stepStair+" ";
        }
        List<String> actual = DirectAnswer01.makeStair(stepStair);
        assertEquals("É ArrayList!", ArrayList.class, actual.getClass());
        assertEquals("Tem tamanho "+stairSize, stairSize, actual.size());
        System.out.println("Contém *");
        for (String string : actual) {
            assertTrue(string.contains("*"));
        }
    }

    @Test
    public void testShowStair() {
        

    }
}
