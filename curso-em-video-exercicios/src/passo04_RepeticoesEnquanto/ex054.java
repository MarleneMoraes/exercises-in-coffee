/*
    Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando no final:
        a) Qual foi a média de altura do grupo
        b) Quantas pessoas pesam mais de 90Kg
        c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
        d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
 */

package passo04_RepeticoesEnquanto;

import java.util.Scanner;

public class ex054 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 1, moreNinty = 0, smallerFifty = 0, biggerOneHundred = 0;
		float average = 0;

		System.out.println("Controle de Idade e Peso");

		while (count <= 7) {
			System.out.printf("Digite o peso da %dª pessoa: ", count);
			float weight = sc.nextFloat();

			System.out.print("Digite sua altura: ");
			float height = sc.nextFloat();

			average += height;

			if (weight < 50) {
				if (height < 1.60) {
					smallerFifty++;
				}
			} else if (weight > 90) {
				moreNinty++;

				if (weight > 100) {
					if (height > 1.90) {
						biggerOneHundred++;
					}
				}
			}

			count++;
		}

		average /= 7;

		System.out.printf("Média de altura do grupo: %.2f\n", average);
		System.out.printf("Pessoas pesam mais de 90Kg: %d\n", moreNinty);
		System.out.printf("Pessoas que pesam menos de 50Kg tem menos de 1.60m: %d\n", smallerFifty);
		System.out.printf("Pessoas que medem mais de 1.90m pesam mais de 100Kg: %d\n", biggerOneHundred);

		sc.close();
	}
}
