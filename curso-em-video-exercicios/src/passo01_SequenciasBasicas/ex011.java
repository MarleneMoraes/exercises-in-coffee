/*
	Desenvolva uma lógica que leia os valores de A, B e C 
	de uma equação do segundo grau e mostre o valor de Delta.
 */

package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex011 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      float A, B, C;
      double delta;
      
      //delta = -B +- (raiz de B² - 4 A C)/2A
      
        System.out.println("Valor de A: ");
        A = sc.nextFloat();
        
        System.out.println("Valor de B: ");
        B = sc.nextFloat(); 
        
        System.out.println("Valor de C: ");
        C = sc.nextFloat();
        
        delta = (-B + (Math.sqrt(Math.pow(B, 2))) - (4*A*C))/(2*A);
        System.out.printf("O valor positivo de delta é %2f", delta);
        
        delta = (-B - (Math.sqrt(Math.pow(B, 2))) - (4*A*C))/(2*A);
        System.out.printf("O valor negativo de delta é %2f", delta);
        
        sc.close();
    }
    
}
