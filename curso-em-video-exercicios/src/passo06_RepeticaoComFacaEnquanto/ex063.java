/*
   Crie um programa usando a estrutura "faça enquanto" que leia vários números.
    A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre 
    na tela:
        a) O somatório entre todos os valores
        b) Qual foi o menor valor digitado
        c) A média entre todos os valores
        d) Quantos valores são pares
 */
package passo06_RepeticaoComFacaEnquanto;

import java.util.Scanner;

public class ex063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Initialize
		char answer = 'S';
		int i = 0;
		int sum = 0;
		int even = 0;
		int lowerValue = 0;
		float average = 0;

		do {
			System.out.print("Digite um nÃºmero: ");
			int number = sc.nextInt();

			sum += number;

			if (lowerValue == 0 || lowerValue > number) {
				lowerValue = number;
			}

			if (number % 2 == 0) {
				even++;
			}

			average += number;
			i++;

			System.out.print("Gostaria de continuar? (S/N)");
			answer = sc.next().charAt(0);
		} while (answer == 'S' || answer == 's');

		average /= i;

		System.out.printf("Soma dos valores: %d\n", sum);
		System.out.printf("Menor valor digitado: %d\n", lowerValue);
		System.out.printf("MÃ©dia entre todos os valores: %.2f\n", average);
		System.out.printf("Valores Pares: %d\n", even);

		sc.close();
	}
}
