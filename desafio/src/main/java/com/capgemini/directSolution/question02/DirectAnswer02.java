package com.capgemini.directSolution.question02;

import java.util.ArrayList;
import java.util.List;

public class DirectAnswer02 {

    // Bloco de constants que representam as regras
    //TODO INSERIR OS REGEX, problemas na insersão do regex
    final static int LENGTH = 6;

    /**
     * Mostra os prerequisitos necessários para uma senha forte
     * @return
     */
    public static List<String> showStrongPasswordRequirements(){
        
        List<String> requirements = new ArrayList<String>();
        
        requirements.add("###Requisistos para senha forte###");
        requirements.add(">> Possui no mínimo 6 caracteres;");
        requirements.add(">> Contém no mínimo 1 digito;");
        requirements.add(">> Contém no mínimo 1 letra em minúsculo;");
        requirements.add(">> Contém no mínimo 1 letra em maiúsculo;");
        requirements.add(">> Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+");
        
        return requirements;

    }
    
    /**
     * Validados de password
     * @param password
     * @return
     */
    public static int validatePassword(String password){
        
        if (ValidatePasswordHelper.validateLength(password)) {
            System.out.println(6-password.length());
        }
        
        //TODO Bloco de validação de requisitos com regex
        
        return 6-password.length();
        
    }
}
