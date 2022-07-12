package br.pucminas.aed.listarepeticaob;

import java.util.Scanner;

public class Exercises {
	static Scanner sc = new Scanner(System.in);

	protected static void ex001() {
		/* Faça o sprite pedir um número e depois imprimir seu triplo. Faça isto acontecer 5 vezes.*/
        double numero, triplo;    
        System.out.println("Triplo de um número");
        
        
       for (int i = 0; i < 5; i++) {
           System.out.print("Digite o número desejado: ");
           numero = sc.nextDouble();
           
           triplo = numero * 3; 
           
           System.out.printf("O triplo deste número é %.2f.\n", triplo);
       }
	}

	protected static void ex002() {
		/* Fazer um programa para escrever os 10 primeiros números ímpares */

		for (int i = 0; i < 20; i++) {
			if (i % 2 != 0)
				System.out.printf("%d ", i);
		}

	}

	protected static void ex003() {
		/*
		 * Fazer um programa utilizando o Scratch para mostrar os números de 100 até 200
		 * variando de 10 em 10.
		 */

		for (int i = 100; i <= 200; i += 10)
			System.out.printf("%d ", i);

	}

	protected static void ex004() {
		/*
		 * Escreva um programa para ler um número e imprimir a soma dos números de 1 até
		 * ele.
		 */

		System.out.println("Digite um valor:");
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++)
			System.out.printf("%d ", i);

	}

	protected static void ex005() {
		/* Escreva um programa para ler um número e imprimir o seu fatorial. */

		int fatorial;

		System.out.println("Cálculo de Fatoriais");
		System.out.print("Digite o número desejado para saber o fatorial: ");
		int numero = sc.nextInt();

		if (numero > 0) {
			for (fatorial = 1; numero > 1; numero--) {
				fatorial *= numero;
			}

			System.out.printf("\nFatorial calculado: %d", fatorial);
		} else {
			System.out.println("Não existem fatoriais negativos.");
		}
	}

	protected static void ex006() {
		/*
		 * Escreva um programa para ler um conjunto de números e imprimir a soma desses
		 * números
		 */

		char resposta;
		int soma = 0, numero;

		System.out.println("Soma de um conjunto de números");

		do {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();

			soma += numero;

			System.out.println("Gostaria de somar mais algum? (s/n)");
			resposta = sc.next().charAt(0);

		} while (resposta != 'n');

		System.out.printf("Soma: %d", soma);

	}

	protected static void ex007() {
		/*
		 * Escreva um programa para ler um conjunto de números e imprimir a média desses
		 * números
		 */

		char resposta;
		int numero, i = 1, media = 0;

		System.out.println("Média de um conjunto de números");

		do {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();

			media += numero;

			System.out.println("Gostaria de somar mais algum? (s/n)");
			resposta = sc.next().charAt(0);

			i++;
		} while (resposta != 'n');

		media /= i;

		System.out.printf("Média: %d", media);
	}

	protected static void ex008() {
		/*
		 * A série de Fibonacci é formada pela sequência: 
		 * 1, 1, 2, 3, 5, 8, 13, 21, 34, ... 
		 * Escreva um programa que peça um número N maior 
		 * que 2. Gere e mostre a série do primeiro termo 
		 * até este enésimo termo.
		 */

		int a1 = 0, a2 = 1, an = 1;

		System.out.println("Sequência de Fibonacci");
		System.out.print("Digite o número de termos: ");
		int termos = sc.nextInt();

		if (termos > 2) {
			System.out.printf("%d %d ", a1, a2);

			for (int i = 0; i < termos; i++) {
				an = a1 + a2;
				a1 = a2;
				a2 = an;

				System.out.printf("%d ", an);
			}

		} else {
			System.out.println("Não é possível calcular.");
		}

	}

}
