package com.capgemini;

import java.util.List;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

import com.capgemini.directSolution.question01.DirecetAnswer01;
// import com.capgemini.directSolution.question02.DirecetAnswer02;
import com.capgemini.directSolution.question02.DirecetAnswer02;
import com.capgemini.directSolution.question03.Question03;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        boolean endProgram = true;
        
        while(endProgram){
            int option = 0;
            Scanner readOption = new Scanner(System.in);

            System.out.println("Digite a opção:");
            System.out.println("Questão 01: digite 1");
            System.out.println("Questao 02: digite 2");
            System.out.println("Questão 03: digite 3");
            System.out.println("Finalizar aplicação: 0");
            option = readOption.nextInt();

            if (option == 1) {
                
                int stairSize = 10;
                DirecetAnswer01.showStair(stairSize);                
                

            }

            if (option == 2) {
                Scanner readPassword = new Scanner(System.in);
                
                List<String> requirements = DirecetAnswer02.showStrongPasswordRequirements();
                for (String string : requirements) {
                    System.out.println(string);
                }

                System.out.println("Digite uma senha forte");
                String password = readPassword.nextLine();                

                System.out.println(DirecetAnswer02.validatePassword(password));
                
                
            }

            if (option == 3) {
                Scanner readAnagram = new Scanner(System.in);

                

            }
            if (option == 0) {

                endProgram = false;

            }
            
            
        }

        
        


    }
}
