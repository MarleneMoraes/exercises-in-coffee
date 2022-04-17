/*
    Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura "para" 
    No final, mostre na tela:
        a) Quantas mulheres foram cadastradas
        b) Quantos homens pesam mais de 100Kg
        c) A média de peso entre as mulheres
        d) O maior peso entre os homens
 */
package passo07_RepeticaoComPara;

import java.util.Scanner;

public class ex068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int women = 0, menMoreOneHundred = 0;
		float averageWomen = 0, menGreater = 0;

		System.out.println("Controle de Sexo e Peso");

		for (int i = 1; i <= 8; i++) {
			System.out.print("Digite seu sexo(F/M): ");
			char sex = sc.next().charAt(0);

			System.out.print("Digite seu peso: ");
			float weight = sc.nextFloat();

			if (sex == 'F' || sex == 'f') {
				women++;
				averageWomen += weight;
			} else if (sex == 'M' || sex == 'm') {

				if (menGreater == 0 || menGreater < weight) {
					menGreater = weight;
				}

				if (weight > 100) {
					menMoreOneHundred++;
				}
			} else {
				System.out.println("ERRO. Tente novamente.");
			}
		}

		averageWomen /= women;

		System.out.printf("Mulheres cadastradas: %d\n", women);
		System.out.printf("Homens que pesam mais de 100Kg: %d\n", menMoreOneHundred);
		System.out.printf("Média de peso entre as mulheres: %.2f kg\n", averageWomen);
		System.out.printf("Maior peso entre os homens: %.2f kg\n", menGreater);
		
		sc.close();
	}
}
