/*
    Faça um programa usando a estrutura "faça enquanto" que leia a idade 
    de várias pessoas. 
    A cada laço, você deverá perguntar para o usuário se ele quer ou não 
    continuar a digitar dados. 
    No final, quando o usuário decidir parar, mostre na tela:
        a) Quantas idades foram digitadas
        b) Qual é a média entre as idades digitadas
        c) Quantas pessoas tem 21 anos ou mais.
 */
package passo06_RepeticaoComFacaEnquanto;

import java.util.Scanner;

public class ex062 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char answer;
		int i, age, olderTwetyOne;
		float average;

		// Inicializador
		answer = 'S';
		i = 0;
		olderTwetyOne = 0;
		average = 0;

		do {
			System.out.print("Digite a idade: ");
			age = sc.nextInt();

			average += age;
			i++;

			if (age >= 21) {
				olderTwetyOne++;
			}

			System.out.print("Gostaria de continuar? (S/N)");
			answer = sc.next().charAt(0);
		} while (answer == 'S' || answer == 's');

		average /= i;

		System.out.printf("Idades digitadas: %d\n", i);
		System.out.printf("Média das idades digitadas: %.2f\n", average);
		System.out.printf("Pessoas com 21 anos ou mais: %d\n", olderTwetyOne);
		
		sc.close();
	}
}
