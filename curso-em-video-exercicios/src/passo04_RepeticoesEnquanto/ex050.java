/*
    Desenvolva um programa que fa�a o sorteio de 20 n�meros entre 0 e 10 e mostre na tela:
        a) Quais foram os n�meros sorteados
        b) Quantos n�meros est�o acima de 5
        c) Quantos n�meros s�o divis�veis por 3
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

		System.out.printf("\nQuantidade de n�meros acima de 5: %d\n", biggerFive);
		System.out.printf("Quantidade de n�meros divis�veis por 3: %d\n", divisibleThree);
	}

}
