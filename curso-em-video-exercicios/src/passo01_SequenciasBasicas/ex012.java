/*
	Crie um programa que leia o pre�o de um produto, 
	calcule e mostre o seu PRE�O PROMOCIONAL, com 5% 
	de desconto.
 */

package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float preco;

		System.out.println("Pre�o do produto: ");
		preco = sc.nextFloat();

		preco -= (preco * 0.05);

		System.out.printf("PRE�O PROMOCIONAL: %.2f", preco);
		sc.close();
	}
}
