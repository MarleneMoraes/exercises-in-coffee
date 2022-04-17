/*
	Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela 
	qual foi o maior e qual foi o menor preço digitados.
 */

package passo04_RepeticoesEnquanto;

import java.util.Scanner;
public class ex051 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 1;
		float bigger = 0;
		float smaller = 0;

		System.out.println("Preço do produto");

		while (count < 8) {
			System.out.print("Digite o preço: ");
			float price = sc.nextFloat();

			if (count == 1) {
				bigger = price;
				smaller = price;
			} else if (price > bigger) {
				bigger = price;
			} else if (price < smaller) {
				smaller = price;
			}

			count++;
		}

		System.out.printf("Maior valor: %.2f\n", bigger);
		System.out.printf("Menor valor: %.2f\n", smaller);

		sc.close();
	}
}
