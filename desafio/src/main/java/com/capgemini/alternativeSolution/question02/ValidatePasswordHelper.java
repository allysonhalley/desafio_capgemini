package com.capgemini.alternativeSolution.question02;

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
        
        boolean contain = false;        

        for (String sub : password.split("")) {
            final Pattern patter = Pattern.compile(regex);
            final Matcher matcher = patter.matcher(sub);            
            if (matcher.matches()) {
                return true;
            }
        }

        return contain;
        
    }

    public static boolean validateSpecialCharacteres(final CharSequence specialRegex, String password ){
        
        CharSequence passwordCharSequence = password;
        
        boolean contain = false;
        for (int i = 1; i < specialRegex.length(); i++) {
            for (int j = 1; j < passwordCharSequence.length(); j++) {
                
                final Pattern patter = Pattern.compile("\\"+String.valueOf(specialRegex.charAt(i)));
                final Matcher matcher = patter.matcher("\\"+String.valueOf(passwordCharSequence.charAt(i)));            
                
                if (matcher.matches()) {
                    return true;
                }
            }
        }

        return contain;
        
    }




    
}
