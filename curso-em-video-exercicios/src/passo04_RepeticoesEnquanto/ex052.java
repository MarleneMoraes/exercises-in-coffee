/*
    Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
        a) Qual é a média de idade do grupo
        b) Quantas pessoas tem mais de 18 anos
        c) Quantas pessoas tem menos de 5 anos
        d) Qual foi a maior idade lida
 */

package passo04_RepeticoesEnquanto;

import java.util.Scanner;

public class ex052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float average = 0;
		int count = 1;
		int bigger = 0;
		int smallerFive = 0;
		int biggerEighteen = 0;

		System.out.println("Controle de Idade");

		while (count <= 10) {
			System.out.printf("Digite a idade da %dª pessoa: ", count);
			int age = sc.nextInt();

			average += age;

			if (count == 1) {
				bigger = (int) age;
			} else if (age > 18) {
				biggerEighteen++;
			} else if (age < 5) {
				smallerFive++;
			}

			count++;
		}

		average /= 10;

		System.out.printf("MÃ©dia de idade: %.2f\n", average);
		System.out.printf("Maiores de 18 anos: %d\n", biggerEighteen);
		System.out.printf("Menores de 5 anos: %d\n", smallerFive);
		System.out.printf("Maior idade lida: %d\n", bigger);

		sc.close();
	}
}
