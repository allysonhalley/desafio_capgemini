package com.capgemini.directSolution.question02;

public class Question02 {

    // Bloco de constants que representam as regras
    //TODO INSERIR OS REGEX
    static int LENGTH = 6;
    static String ONE_DIGITI = "0-9";
    static String ONE_DOWN_LETTER = "a-z";
    static String ONE_UPPER_LETTER = "A-Z";
    static String ONE_SPECIAL_CHAR = "\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\-\\+";
    
    public static int validatePassword(String password){
        
        // Quantidade de dígitos faltantes para completar o password
        int addChar = 0;

        ValidatePasswordHelper.validate(null, password);
        ValidatePasswordHelper.validate(ONE_DIGITI, password);
        ValidatePasswordHelper.validate(ONE_DOWN_LETTER, password);
        ValidatePasswordHelper.validate(ONE_UPPER_LETTER, password);
        ValidatePasswordHelper.validate(ONE_SPECIAL_CHAR, password);

        if (password.length() < 6 && password.length() >= 0) {
            addChar = 6 - password.length();
        }

        return addChar;
        
    }



}
