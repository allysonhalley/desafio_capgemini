package com.capgemini.directSolution.question02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePasswordHelper {
    
    static Pattern rule;
    static Matcher matcher;

    public static boolean validate(String validation, String password ){

        if (validation.isEmpty()) {
            boolean lowerSix = (password.length() < 6);
            return lowerSix;

        } else {
            rule = Pattern.compile("["+validation+"]");
            matcher = rule.matcher(password);
            
            return matcher.matches();                
        }
    }


    
}
