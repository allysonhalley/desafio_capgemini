package com.capgemini.directSolution.question03;

import java.util.ArrayList;
import java.util.List;

public class Question03 {

    public static int countAnagrams(String word){

        StringBuilder chars = new StringBuilder(word);
        List<String> anagrams = new ArrayList<>();
        
        for (int i = 0; i < word.length(); i++) {
            chars.setCharAt(i, word.charAt(i));
        }


        return mountAnagramList(word, anagrams).size();
    }

    private static List<String> mountAnagramList(String word, List<String> anagrams){

        // if (word) {
            
        // }

        return anagrams;
    }
    
}
