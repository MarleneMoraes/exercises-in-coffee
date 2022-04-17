/*
	Crie um programa que leia 6 n�meros inteiros e no final 
	mostre quantos deles são pares e quantos s�o �mpares.
 */

package passo04_RepeticoesEnquanto;

import java.util.Scanner;

public class ex049 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int even = 0;
		int odd = 0;
		int count = 1;

		while (count <= 6) {
			System.out.print("Digite um n�mero inteiro: ");
			int value = sc.nextInt();

			if (value % 2 == 0) {
				even++;
			} else {
				odd++;
			}

			count++;
		}

		System.out.printf("Quantidade de pares: %d\n", even);
		System.out.printf("Quantidade de �mpares: %d\n", odd);

		sc.close();
	}

}
