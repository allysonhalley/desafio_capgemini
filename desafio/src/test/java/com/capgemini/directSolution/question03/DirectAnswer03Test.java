package com.capgemini.directSolution.question03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DirectAnswer03Test {
    @Test
    public void testCountAnagrams() {

        String word = "ifailuhkqq";
        int expected = 3;
        int actual = DirectAnswer03.countAnagrams(word);

        assertEquals(expected, actual);
    }
    
    @Test
    public void testIsAnagram() {
        
        String word01 = "ov";
        String word02 = "vo";
        
        assertTrue(DirectAnswer03.isAnagram(word01, word02));

    }

    @Test
    public void testMountAnagramList() {

        String word = "ifailuhkqq";
        List<String[]> anagrams = new ArrayList<String[]>();
        int sizeWord = 1;

        anagrams = DirectAnswer03.mountAnagramList(word, anagrams, sizeWord);

        for (String[] strings : anagrams) {
            System.out.println(strings[0]);
            System.out.println(strings[1]);
        }
        

    }
}
