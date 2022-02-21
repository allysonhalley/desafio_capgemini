package com.capgemini.directSolution.question02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePasswordHelper {

    /**
     * Retorna a quantidade de caracteres necessários para chegar nos 6 digitos
     * @param password
     * @return
     */
    public static boolean validateLength(String password ){
        
        if (password.isEmpty()) {
            return false;
        }else{            
            return (password.length() >= 6);
        }
    }

    /**
     * Valida de acordo com o regex passado como parâmetro
     * @param regex
     * @param password
     * @return
     */
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
