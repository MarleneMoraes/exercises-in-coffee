/*
	Crie um programa que leia o preço de um produto, 
	calcule e mostre o seu PREÇO PROMOCIONAL, com 5% 
	de desconto.
 */

package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float preco;

		System.out.println("Preço do produto: ");
		preco = sc.nextFloat();

		preco -= (preco * 0.05);

		System.out.printf("PREÇO PROMOCIONAL: %.2f", preco);
		sc.close();
	}
}
