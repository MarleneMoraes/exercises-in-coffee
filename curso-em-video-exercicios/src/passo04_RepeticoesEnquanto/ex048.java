/*
	Fa�a um programa que leia 7 n�meros inteiros e no final mostre o somat�rio entre eles.
 */

package passo04_RepeticoesEnquanto;

import java.util.Scanner;

public class ex048 {
   public static void main(String[] args) {
       Scanner sc = new Scanner (System.in); 
        
        int sum = 0;
        int count = 1;
        
        while (count <= 7){
            System.out.print("Digite um número inteiro: ");
            int value = sc.nextInt(); 
            
            sum += value;
            count++;
        }
        
        System.out.printf("A soma dos valores é %d\n", sum);
        
        sc.close();
    }
     
}
