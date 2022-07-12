package br.pucminas.aed.listarepeticaoa;

import java.util.Locale;
import java.util.Scanner;

/**
 @author: Marlene Moraes
 since: 04/10/2020
*/

public class Main {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
        
        int ex = -1;

        System.out.println("LISTA III - EXERCÍCIOS REPETIÇÃO");

        while (ex != 0){
            System.out.print("Digite o número do exercício (1-10) ou 0 para sair: ");
            ex = sc.nextInt();
            
            switch (ex){
                case 0:
                    break;        
                case 1:
                    Exercises.ex001();
                    break;
                case 2:
                	Exercises.ex002();
                    break;    
                case 3:
                	Exercises.ex003();
                    break;
                case 4:
                	Exercises.ex004();
                    break;
                case 5:
                	Exercises.ex005();
                    break;    
                case 6:
                	Exercises.ex006();
                    break;    
                case 7:
                	Exercises.ex007();
                    break;
                case 8:
                	Exercises.ex008();
                    break;
                case 9:
                	Exercises.ex009();
                    break;    
                case 10:
                	Exercises.ex010();
                    break;
            }        
        }  
        
        sc.close();
    }
}