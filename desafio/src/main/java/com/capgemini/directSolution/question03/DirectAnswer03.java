package com.capgemini.directSolution.question03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectAnswer03 {

    /**
     * Retorna a quantidade de anagramas válidos
     * @param word
     * @return
     */
    public static int countAnagrams(String word){

        List<String[]> anagrams = new ArrayList<String[]>();
        int sizeWord = 1;
        
        return mountAnagramList(word, anagrams, sizeWord).size();
    }
    
    /**
     * Monta os anagramas válidos
     * @param word
     * @param anagrams
     * @param sizeWord
     * @return
     */
    public static List<String[]> mountAnagramList(String word, List<String[]> anagrams, int sizeWord){
        
        /**
         * 
         */
        List<String> wordMounted = new ArrayList<String>();
        for (int i = 0; i < word.length()-1; i++) {
            if (i < word.length()-1 && sizeWord < word.length()-1) {
                String subword; 
                if (sizeWord == 1) {
                    subword = String.valueOf(word.charAt(i));
                }else{
                    subword = word.substring(i, i+sizeWord); 
                }
                wordMounted.add(subword);
            }
        }

        for (int i = 0; i < wordMounted.size()-1; i++) {            
            if (isAnagram(wordMounted.get(i), wordMounted.get(i+1))) {
                String[] anagram = {wordMounted.get(i), wordMounted.get(i+1)};
                anagrams.add(anagram);
            }
        }
       
        sizeWord++;

        if (sizeWord <= word.length()-1) {
            anagrams = mountAnagramList(word, anagrams, sizeWord);            
        }
        
        return anagrams;
    }
    
    /**
     * Valida se o par de palavras são anagramas entre si
     * @param word01
     * @param word02
     * @return
     */
    public static boolean isAnagram(String word01, String word02){
        String string01 = word01.replaceAll("\\s", "");
        String string02 = word02.replaceAll("\\s", "");
        
        boolean isAnag = false;

        if (string01.length() == string02.length()) {
            char[] charString01 = string01.toLowerCase().toCharArray();
            char[] charString02 = string02.toLowerCase().toCharArray();
            Arrays.sort(charString01);
            Arrays.sort(charString02);
            isAnag = Arrays.equals(charString01, charString02);
        }

        return isAnag;
    }



    
}
