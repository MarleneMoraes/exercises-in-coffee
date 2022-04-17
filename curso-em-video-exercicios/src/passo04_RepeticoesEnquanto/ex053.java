/*
    Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
        a) Quantos homens foram cadastrados
        b) Quantas mulheres foram cadastradas
        c) A média de idade do grupo
        d) A média de idade dos homens
        e) Quantas mulheres tem mais de 20 anos
 */

package passo04_RepeticoesEnquanto;

import java.util.Scanner;

public class ex053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 1, men = 0, women = 0, womenBiggerTwenty = 0;
		float average = 0, averageMen = 0;

		System.out.println("Controle de Idade");

		while (count <= 5) {
			System.out.printf("Digite a idade da %dª pessoa: ", count);
			int age = sc.nextInt();

			average += age;

			System.out.print("Digite o sexo(F/M): ");
			char sex = sc.next().charAt(0);

			switch (sex) {
			case 'M':
				men++;
				averageMen += age;
				break;
			case 'F':
				women++;

				if (age > 20) {
					womenBiggerTwenty++;
				}

				break;
			default:
				System.out.println("Erro. Tente novamente.");
				break;
			}

			count++;
		}

		average /= 5;
		averageMen /= men;

		System.out.printf("Homens cadastrados: %d\n", men);
		System.out.printf("Mulheres cadastradas: %d\n", women);
		System.out.printf("Média de idade do grupo: %.2f\n", average);
		System.out.printf("Média de idade dos homens: %.2f\n", averageMen);
		System.out.printf("Mulheres com mais de 20 anos: %d\n", womenBiggerTwenty);

		sc.close();
	}
}
