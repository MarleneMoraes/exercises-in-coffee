/*
	Faça um algoritmo que leia quanto dinheiro uma pessoa 
	tem na carteira (em R$) e mostre quantos dólares ela 
	pode comprar. Considere US$1,00 = R$3,45.
 */

package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float valor, dolar;
        
        System.out.print("Qual valor em reais (R$) tem na carteira? ");
        valor = sc.nextFloat();
        
        dolar = (float) (valor * 3.45);
        
        System.out.printf("Você pode comprar US$%.2f.", dolar);
        
        sc.close();
    }
}
