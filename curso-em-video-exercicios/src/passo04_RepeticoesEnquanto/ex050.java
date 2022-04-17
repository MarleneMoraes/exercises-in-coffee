/*
    Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e mostre na tela:
        a) Quais foram os números sorteados
        b) Quantos números estão acima de 5
        c) Quantos números são divisíveis por 3
 */

package passo04_RepeticoesEnquanto;

import java.util.Random;

public class ex050 {
	public static void main(String[] args) {
		Random random = new Random();

		int count = 0;
		int biggerFive = 0;
		int divisibleThree = 0;

		while (count < 20) {
			int shuffle = random.nextInt(10);
			System.out.printf("%d ", shuffle);

			if (shuffle > 5) {
				biggerFive++;
			}

			if (shuffle % 3 == 0) {
				divisibleThree++;
			}

			count++;
		}

		System.out.printf("\nQuantidade de números acima de 5: %d\n", biggerFive);
		System.out.printf("Quantidade de números divisíveis por 3: %d\n", divisibleThree);
	}

}
