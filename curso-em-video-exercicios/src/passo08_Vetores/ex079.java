/*
    Desenvolva um programa que leia 10 n�meros inteiros 
    e guarde-os em um vetor. No final, mostre quais s�o 
    os n�meros pares que foram digitados e em que posi��es 
    eles est�o armazenados.
 */
package passo08_Vetores;

import java.util.Scanner;

public class ex079 {
  public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int vetor[];
        vetor = new int[10];
        
        for(int i = 1; i<= 10; i++){
            System.out.printf("Digite o %d� n�mero: ", i);
            vetor[(i-1)] = sc.nextInt();
        }
        
        System.out.println("\n---------------------------------");
        System.out.println("Listagem valores que s�o pares");
        System.out.println("-----------------------------------");
        
        for(int i = 1; i <= 10; i++){
            if (vetor[(i-1)] % 2 == 0){
                System.out.printf("%d (Posi��o %d)\n", vetor[(i-1)], i-1);
            }
        }
        
        sc.close();
    }  
}
