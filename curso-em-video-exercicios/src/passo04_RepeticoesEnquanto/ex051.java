/*
	Fa�a um aplicativo que leia o pre�o de 8 produtos. No final, mostre na tela 
	qual foi o maior e qual foi o menor pre�o digitados.
 */

package passo04_RepeticoesEnquanto;

import java.util.Scanner;
public class ex051 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 1;
		float bigger = 0;
		float smaller = 0;

		System.out.println("Pre�o do produto");

		while (count < 8) {
			System.out.print("Digite o pre�o: ");
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
