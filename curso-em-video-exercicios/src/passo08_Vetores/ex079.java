/*
    Desenvolva um programa que leia 10 números inteiros 
    e guarde-os em um vetor. No final, mostre quais são 
    os números pares que foram digitados e em que posições 
    eles estão armazenados.
 */
package passo08_Vetores;

import java.util.Scanner;

public class ex079 {
  public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int vetor[];
        vetor = new int[10];
        
        for(int i = 1; i<= 10; i++){
            System.out.printf("Digite o %dº número: ", i);
            vetor[(i-1)] = sc.nextInt();
        }
        
        System.out.println("\n---------------------------------");
        System.out.println("Listagem valores que são pares");
        System.out.println("-----------------------------------");
        
        for(int i = 1; i <= 10; i++){
            if (vetor[(i-1)] % 2 == 0){
                System.out.printf("%d (Posição %d)\n", vetor[(i-1)], i-1);
            }
        }
        
        sc.close();
    }  
}
