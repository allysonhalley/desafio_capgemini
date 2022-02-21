package com.capgemini.directSolution.question01;

import java.util.ArrayList;
import java.util.List;

public class DirectAnswer01 {
    
    public static void showStair(int stairSize){

        String firstStep = makeFirstStep(stairSize);
        List<String> stair = makeStair(firstStep);
        for (String string : stair) {
            System.out.println(string);
        }
        
    }    
    
    private static String makeFirstStep(int stairSize){
        String stepStair = "";
        for (int i = 0; i < stairSize; i++) {
            stepStair = stepStair+" ";
        }
        return stepStair;
    }
    
    public static List<String> makeStair(String stepStair){
        
        ArrayList<String> stair = new ArrayList<>();
        StringBuilder stairBuilder = new StringBuilder(stepStair);
        
        for (int i = stepStair.length(); i > 0; i--) {
            stairBuilder.setCharAt(i-1, '*');
            stair.add(stairBuilder.toString());
        }
        return stair;
    }




    
    
}
