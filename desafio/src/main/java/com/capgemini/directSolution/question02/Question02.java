package com.capgemini.directSolution.question02;

public class Question02 {

    // Bloco de constants que representam as regras
    //TODO INSERIR OS REGEX
    final static int LENGTH = 6;
    final static String ONE_DIGITI = "[\\d]";
    final static String ONE_LOWER_LETTER = "[a-z]";
    final static String ONE_UPPER_LETTER = "[A-Z]";
    final static String ONE_SPECIAL_CHAR = "\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\-\\+";
    
    public static int validatePassword(String password){
        
        // Quantidade de dígitos faltantes para completar o password        

        if (ValidatePasswordHelper.validateLength(password)) {
            System.out.println(6-password.length());
        }
        if (ValidatePasswordHelper.validateCharacteres(ONE_DIGITI, password)) {
            System.out.println("Insira ao menos um dígito (número)");
        }
        if (ValidatePasswordHelper.validateCharacteres(ONE_LOWER_LETTER, password)) {
            System.out.println("Insira letra minúsculas");
        }
        if (ValidatePasswordHelper.validateCharacteres(ONE_UPPER_LETTER, password)) {
            System.out.println("Insira letras maiúsculas");
        }
        if (ValidatePasswordHelper.validateCharacteres(ONE_SPECIAL_CHAR, password)) {
            System.out.println("Insira caracteres especial");
        }

        return 6-password.length();
        
    }



}
