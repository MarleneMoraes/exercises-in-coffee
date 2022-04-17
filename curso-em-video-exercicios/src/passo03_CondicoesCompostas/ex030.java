/*
    [DESAFIO] Refa�a o algoritmo 25, acrescentando o recurso de mostrar 
    que tipo de tri�ngulo ser� formado:
    
    - EQUIL�TERO: todos os lados iguais
    - IS�SCELES: dois lados iguais
    - ESCALENO: todos os lados diferentes
 */
package passo03_CondicoesCompostas;

import java.util.Scanner;

public class ex030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float lado1, lado2, lado3;

        System.out.println("Tri�ngulo ou n�o?");
        System.out.println("Reta 1: ");
        lado1 = sc.nextFloat();

        System.out.println("Reta 2: ");
        lado2 = sc.nextFloat();
        
        System.out.println("Reta 3: ");
        lado3 = sc.nextFloat();
          
        if (lado1 < lado2 + lado3){
            if (lado2 < lado1 + lado3){
                if (lado3 < lado1 + lado2){
                    System.out.print("� poss�vel formar um tri�ngulo,");
                    
                    if (lado1 == lado2 && lado2 == lado3){
                        System.out.print("e � um tri�ngulo equil�tero.");
                    } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                        System.out.println("e � um tri�ngulo is�sceles.");
                    } else {
                        System.out.println("e � um tri�ngulo escaleno.");
                    }
                }
                else{
                    System.out.println("Não � poss�vel formar um tri�ngulo.");
                }
            }
            else{
                System.out.println("N�o � poss�vel formar um tri�ngulo.");
            }
        } else{
            System.out.println("N�o � poss�vel formar um tri�ngulo.");
        }
        
        sc.close();
    }
}
