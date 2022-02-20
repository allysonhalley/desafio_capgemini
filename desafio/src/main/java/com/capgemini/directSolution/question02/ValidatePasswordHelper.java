package com.capgemini.directSolution.question02;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePasswordHelper {

    public static boolean validateLength(String password ){
        
        if (password.isEmpty()) {
            return false;
        }else{            
            return (password.length() >= 6);
        }
    }

    public static boolean validateCharacteres(final String regex, String password ){
        
        boolean contain = true;        

        for (String sub : password.split("")) {
            final Pattern patter = Pattern.compile(sub);
            final Matcher matcher = patter.matcher(regex);            
            if (matcher.matches()) {
                return false;
            }
        }

        return contain;
        
    }
    
}
