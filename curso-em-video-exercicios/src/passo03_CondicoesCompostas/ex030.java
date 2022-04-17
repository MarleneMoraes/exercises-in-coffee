/*
    [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar 
    que tipo de triângulo será formado:
    
    - EQUILÁTERO: todos os lados iguais
    - ISÓSCELES: dois lados iguais
    - ESCALENO: todos os lados diferentes
 */
package passo03_CondicoesCompostas;

import java.util.Scanner;

public class ex030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float lado1, lado2, lado3;

        System.out.println("Triângulo ou não?");
        System.out.println("Reta 1: ");
        lado1 = sc.nextFloat();

        System.out.println("Reta 2: ");
        lado2 = sc.nextFloat();
        
        System.out.println("Reta 3: ");
        lado3 = sc.nextFloat();
          
        if (lado1 < lado2 + lado3){
            if (lado2 < lado1 + lado3){
                if (lado3 < lado1 + lado2){
                    System.out.print("É possível formar um triângulo,");
                    
                    if (lado1 == lado2 && lado2 == lado3){
                        System.out.print("e é um triângulo equilátero.");
                    } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                        System.out.println("e é um triângulo isósceles.");
                    } else {
                        System.out.println("e é um triângulo escaleno.");
                    }
                }
                else{
                    System.out.println("NÃ£o é possível formar um triângulo.");
                }
            }
            else{
                System.out.println("Não é possível formar um triângulo.");
            }
        } else{
            System.out.println("Não é possível formar um triângulo.");
        }
        
        sc.close();
    }
}
