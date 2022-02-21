package com.capgemini;

import java.util.List;
import java.util.Scanner;

import com.capgemini.directSolution.question01.DirectAnswer01;
import com.capgemini.directSolution.question02.DirectAnswer02;
import com.capgemini.directSolution.question03.DirectAnswer03;


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

            //Acesso a solução 01
            if (option == 1) {
                
                int stairSize = 10;
                DirectAnswer01.showStair(stairSize);                
                

            }

            // Acesso a solução 02
            if (option == 2) {
                Scanner readPassword = new Scanner(System.in);
                
                List<String> requirements = DirectAnswer02.showStrongPasswordRequirements();
                for (String string : requirements) {
                    System.out.println(string);
                }

                System.out.println("Digite uma senha forte");
                String password = readPassword.nextLine();                

                System.out.println(DirectAnswer02.validatePassword(password));
                
                
            }

            // Acesso a solução 03
            if (option == 3) {                
                Scanner readWord = new Scanner(System.in);
                String word;

                System.out.println("Digite uma palavra: ");
                word = readWord.nextLine();

                int countAnagrams = DirectAnswer03.countAnagrams(word);

                System.out.println(countAnagrams);

            }

            // Sai do loop e finaliza aplicação
            if (option == 0) {

                endProgram = false;

            }
            
            
        }

        
        


    }
}
