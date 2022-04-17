/*
    Fa�a um programa usando a estrutura "fa�a enquanto" que leia a idade 
    de v�rias pessoas. 
    A cada la�o, voc� dever� perguntar para o usu�rio se ele quer ou n�o 
    continuar a digitar dados. 
    No final, quando o usu�rio decidir parar, mostre na tela:
        a) Quantas idades foram digitadas
        b) Qual � a m�dia entre as idades digitadas
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
		System.out.printf("M�dia das idades digitadas: %.2f\n", average);
		System.out.printf("Pessoas com 21 anos ou mais: %d\n", olderTwetyOne);
		
		sc.close();
	}
}
