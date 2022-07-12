package br.pucminas.aed.listarepeticaoa;

import java.util.Random;
import java.util.Scanner;

public class Exercises {
	static Scanner sc = new Scanner(System.in);
	static Random rand = new Random();

	protected static void ex001() {

		/*
		 * Faça um algoritmo que leia um conjunto de números (X) e imprima a quantidade
		 * de números pares (QPares) e a quantidade de números impares (QImpares) lidos.
		 * Admita que o valor 9999 é utilizado como sentinela (FLAG) para fim de
		 * leitura.
		 * 
		 * Ex.:1, 2, 3, 4, 5, 9999 =>Pares=2 Impares=3
		 */

		int QPar = 0, QImpar = 0;

		System.out.println("Quantidade de Pares e Ímpares");

		int numero = 0;

		while (numero != 9999) {

			System.out.println("Digite o número: ");
			numero = sc.nextInt();

			if (numero % 2 == 0)
				QPar++;
			else
				QImpar++;
		}

		System.out.printf("\n Pares = %d Impares = %d ", QPar, QImpar);
	}

	protected static void ex002() {
		/*
		 * Faça um programa que leia um conjunto indeterminado de números inteiros
		 * positivos e imprima o maior, o menor e a média aritmética desse conjunto de
		 * dados. (Flag-1). Execute este programa para os seguintes valores: 1. 1,2,3,-1
		 * 2. 3,2,1,-1 3. 1,3,2,-1
		 */

		System.out.println("Maior, Menor e a Média de um conjunto de números");
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();

		int count = 1;
		int maior = numero;
		int menor = numero;
		double media = (double) numero;

		while (numero != -1) {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			media += numero;

			if (numero > maior)
				maior = numero;

			if (numero < menor && numero != -1)
				menor = numero;

			count++;
		}

		media /= count;

		System.out.printf("Maior: %d\n", maior);
		System.out.printf("Menor: %d\n", menor);
		System.out.printf("Média: %.2f", media);
	}

	protected static void ex003() {
		/*
		 * Escrever um algoritmo para calcular e imprimir o fatorial de um número lido
		 * do teclado. Ex. Fatorial de 5! = 5x4x3x2x1 = 120
		 */
		int fatorial;

		System.out.println("Cálculo de Fatoriais");
		System.out.print("Digite o número desejado para saber o fatorial: ");
		int numero = sc.nextInt();

		if (numero > 0) {
			for (fatorial = 1; numero > 1; numero--) {
				fatorial *= numero;
			}
			System.out.printf("\nFatorial calculado: %d\n", fatorial);
		} else {
			System.out.println("Não existem fatoriais negativos.");
		}
	}

	protected static void ex004() {
		/*
		 * Calcule o valor da seguinte série lido a quantidade de termos:
		 * 
		 * S = 1-(1/(3^3)) + (1/(5^3)) - (1/(7^3))+(1/(9^3)) ....
		 */

		float denominador;
		float S = 1;

		System.out.println("Cálculo do valor de S");
		System.out.print("Quantidade de termos: ");
		int termos = sc.nextInt();

		for (int count = 0; count <= termos; count++) {
			denominador = (float) Math.pow((3 + (2 * count)), 3);

			if (count % 2 == 0)
				S -= (1 / denominador);
			else
				S += (1 / denominador);

		}

		System.out.printf("%.2f", S);
	}

	protected static void ex005() {
		/*
		 * A série de Fibonacci é formada pela sequência: 1, 1, 2, 3, 5, 8, 13, 21, 34,
		 * ... Escreva um algoritmo que peça um número N maior que 2. Gere e imprima a
		 * série até este n-ésimo termo.
		 */
		int a1 = 0;
		int a2 = 1;
		int an = 1;

		System.out.println("Sequência de Fibonacci");
		System.out.print("Digite o número de termos: ");
		int termos = sc.nextInt();

		if (termos > 2) {
			System.out.printf("%d %d ", a1, a2);

			for (int i = 1; i <= termos; i++) {
				an = a2 + a1;
				a1 = a2;
				a2 = an;
				System.out.printf("%d ", an);
			}
		} else {
			System.out.println("Não é possível calcular.");
		}
	}

	protected static void ex006() {
		/*
		 * Fazer um algoritmo para calcular o valor de s, dado por, sendo o valor de N
		 * deverá se lido do teclado S = +(1/N) - (2/(N-1)) + (3/(N-2)) - (4/(N-3)) +
		 * ... N/1
		 */

		System.out.println("Cálculo do valor de S");
		System.out.print("Digite um número: ");
		double N = sc.nextDouble();

		int count = 1;
		double numerador = 1;
		double denominador = N;

		double S = numerador;

		while (denominador >= 1) {
			if (count % 2 == 1)
				S += numerador / denominador;
			else
				S -= numerador / denominador;

			numerador++;
			denominador--;
			count++;
		}

		System.out.printf("%.2f", S);
	}

	protected static void ex007() {
		/*
		 * Números palíndromos são aqueles que escritos da direita para esquerda ou da
		 * esquerda para direita tem o mesmo valor. Exemplo:929, 44, 97379. Fazer um
		 * algoritmo que imprima todos os números palíndromos de 10000 a 99999.
		 */
		int numero1, numero2, numero3, numero4, numero5, numero, A, inverter;

		int count = 0;

		for (int i = 10000; i <= 99999; i++) {
			numero = i;

			numero1 = numero / 10000;
			A = numero % 10000;

			numero2 = A / 1000;
			A = A % 1000;

			numero3 = A / 100;
			A = A % 100;

			numero4 = A / 10;

			numero5 = A % 10;

			inverter = (numero5 * 10000) + (numero4 * 1000) + (numero3 * 100) + (numero2 * 10) + numero1;

			if (numero == inverter) {
				System.out.printf("%d", numero);
				count++;
			}
		}

		System.out.printf("Quantidade de números palídromos: %d", count);
	}

	protected static void ex008() {
		/*
		 * O numero 3025 possui a seguinte característica: 30 + 25 = 55 55^2 = 3025
		 * Quantos e quais são os números de 4 dígitos possuem essa característica?
		 */

		int numero, parte1, parte2, parte3, parte4, auxiliar, primeiraParte, segundaParte, soma, calculo, count;

		System.out.println("Característica 3025");

		count = 0;

		for (int i = 1000; i <= 9999; i++) {
			numero = i;

			parte1 = numero / 1000;
			auxiliar = numero % 1000;

			parte2 = auxiliar / 100;
			auxiliar = auxiliar % 100;

			parte3 = auxiliar / 10;
			parte4 = auxiliar % 10;

			primeiraParte = (parte1 * 10) + parte2;
			segundaParte = (parte3 * 10) + parte4;

			soma = primeiraParte + segundaParte;
			calculo = (int) Math.pow(soma, 2);

			if (calculo == numero) {
				System.out.printf("%d ", numero);
				count++;
			}

		}

		System.out.printf("\nQuantidade de números com a característica: %d", count);
	}

	protected static void ex009() {
		/*
		 * Faça um programa para jogo de cara ou coroa. Neste caso, o jogador escolhe
		 * coroa (0 - cara e 1 - coroa) mostre ao final de 10 tentativas, quantas foram
		 * certas e quantas erradas.
		 */

		int jogo;
		int certas = 0;
		int erradas = 0;

		System.out.println("Cara ou Coroa?");
		System.out.print("Escolha 0 - cara ou 1 - coroa que direi quantas foram certas e quantas erradas.\n");

		for (int i = 0; i < 10; i++) {
			jogo = rand.nextInt(1);

			System.out.print("Digite o valor: ");
			int tentativa = sc.nextInt();

			if (jogo == tentativa) {
				certas++;
			} else {
				erradas++;
			}
		}

		System.out.printf("Acertos: %d\n", certas);
		System.out.printf("Erros: %d", erradas);
	}

	protected static void ex010() {
		/*
		 * Faça um programa para adivinhar um número escolhido pelo usuário, entre 1 e
		 * 1023. Indique ao final quantas tentativas foram necessárias. O programa
		 * deverá localizar o número escolhido pelo usuário em no máximo 10 tentativas!
		 * Utilize a seguinte proposta. Pegue o valor intermediário e pergunte ao
		 * usuário se o número é igual(=), maior(>) ou menor(<) que o que foi escolhido.
		 * Se for (=) implica que acertou! Se for maior escolha agora o número
		 * intermediário entre o que foi perguntado e o último, caso contrário escolha o
		 * intermediário entre o primeiro e o que foi perguntado, seguindo assim até
		 * acertar! Verifique que você conseguirá acertar qualquer número em no máximo
		 * 10 tentativas!!!
		 */

		int tentativa = 0;

		System.out.print("Adivinhe o valor");
		int chute = rand.nextInt(1024);
		int menor = chute;
		int maior = chute;

		while (tentativa < 10) {
			System.out.printf("\n%d. Ele é igual (=), maior (>) ou menor (<)?", chute);
			char resposta = sc.next().charAt(0);

			if (resposta == '=') {
				System.out.print("Acertei!");
			} else if (resposta == '>') {
				chute = maior;
				chute = rand.nextInt(maior);
			} else if (resposta == '<') {
				chute = menor;
				chute = rand.nextInt(menor);
			}
		}

		System.out.print("Fim de Jogo");
	}

}
