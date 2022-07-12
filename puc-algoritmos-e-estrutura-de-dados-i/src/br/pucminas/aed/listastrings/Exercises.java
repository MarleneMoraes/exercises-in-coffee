package br.pucminas.aed.listastrings;

import java.util.Scanner;

public class Exercises {

	static Scanner sc = new Scanner(System.in);

	protected static void ex001() {
		/*
		 * Leia um conjunto indeterminado de palavras e ao final (estipule você um flag)
		 * informe qual foi a maior palavra e a menor palavra digitada, em tamanho e
		 * lexicograficamente.
		 */

		String palavra, maiorPalavra, menorPalavra, lexicoMaior, lexicoMenor;

		System.out.println("MAIOR E MENOR PALAVRA");
		System.out.print("Digite uma palavra:");
		palavra = sc.nextLine();

		maiorPalavra = palavra;
		menorPalavra = palavra;
		lexicoMaior = palavra;
		lexicoMenor = palavra;

		do {
			if (palavra.length() > maiorPalavra.length())
				maiorPalavra = palavra;

			if (palavra.length() < menorPalavra.length())
				menorPalavra = palavra;

			if (palavra.compareTo(lexicoMenor) < 0)
				palavra = lexicoMenor;

			if (palavra.compareTo(lexicoMaior) > 0)
				palavra = lexicoMaior;

			palavra = sc.nextLine();

		} while (palavra.compareTo("parar") != 0);

		System.out.printf("Maior lexicografimente: %s\nMenor lexicograficamente: %s\n", lexicoMaior, lexicoMenor);

		System.out.printf("Maior palavra: %s\nMenor palavra: %s", maiorPalavra, menorPalavra);
	}

	protected static void ex002() {
		/*
		 * Ler um string de no máximo 50 caracteres e contar quantas letras A essa
		 * palavra possui.
		 */

		int count = 0;
		String string;
		char letra;

		System.out.print("Digite uma palavra: ");
		string = sc.nextLine();

		if (string.length() <= 50) {
			for (int i = 0; i < string.length(); i++) {
				letra = string.charAt(i);

				if (letra == 'a')
					count++;
			}

			System.out.printf("Quantidade de 'a' na palavra digitada: %i", count);
		} else {
			System.out.println("Palavra acima dos 50 caracteres. Tente novamente.");
		}
	}

	protected static void ex003() {
		/*
		 * Ler uma string de no máximo 50 caracteres e indicar quais as posições da
		 * letra A nessa palavra.
		 */

		String string;

		System.out.print("Digite uma palavra: ");
		string = sc.nextLine();

		char scanString[] = new char[string.length()];

		if (string.length() <= 50) {
			for (int i = 0; i < string.length(); i++) {
				if (i == 0)
					System.out.print("Posição da letra a é");

				if (scanString[i] == 'a')
					System.out.printf(" %d ", i);

			}
		}
	}

	protected static void ex004() {
		/*
		 * Ler uma string de no máximo 50 caracteres e em seguida um caractere, mostrar
		 * quais as posições esse caractere aparece na string lida e quantas vezes ele
		 * apareceu.
		 */

		int count = 0;

		System.out.print("Digite uma palavra: ");
		String string = sc.nextLine();

		System.out.print("Digite uma letra: ");
		char letra = sc.next().charAt(0);

		char scanString[] = new char[string.length()];

		if (string.length() <= 50) {

			for (int i = 0; i < string.length(); i++) {
				if (i == 0) {
					System.out.printf("Posição da letra %c é", letra);
				}

				if (scanString[i] == letra) {
					System.out.printf(" %d ", i);
					count++;
				}
			}

			System.out.printf("\nA letra %c apareceu %d vezes.", letra, count);
		}
	}

	protected static void ex007() {

		/*
		 * Ler uma string de no máximo 50 caracteres e criar uma nova string com seu
		 * inverso, isso é a ultima letra da primeira string será a primeira na nova
		 * string e assim sucessivamente.
		 * 
		 * O Java tem métodos para inverter, não sendo necessário realizar conforme o
		 * enunciado.
		 */

		String string;

		System.out.print("Digite uma frase: ");
		string = sc.nextLine();

		System.out.print("Frase inversa: ");
		System.out.println(new StringBuilder(string).reverse().toString());
	}

	protected static void ex008() {
		/*
		 * Ler uma string de no máximo 50 caracteres e retire dessa string todos os
		 * espaços em branco. Utilize uma string auxiliar.
		 */

		char string[] = new char[50];
		char auxiliar[] = new char[50];

		System.out.println("Retirar os espaços da frase");
		System.out.print("Digite uma frase: ");
		for (int i = 0; i < string.length; i++) {
			string[i] = sc.next().charAt(i);
		}

		for (int j = 0; j < string.length; j++) {
			if (auxiliar[j] == ' ')
				string[j] = auxiliar[j + 1];

			System.out.print(auxiliar[j]);
		}

		String stringAuxiliar = String.valueOf(auxiliar);

		System.out.printf("A frase sem espaços em branco: %s\n", stringAuxiliar);
	}

	protected static void ex009() {
		/*
		 * Ler uma stringde no máximo 50 caracteres e retire dessa stringtodos os
		 * espaços em branco. Sem utilize string auxiliar.
		 */

		String string;

		System.out.println("Retirar os espaços da frase");
		System.out.print("Digite uma frase: ");
		string = sc.nextLine();

		string = string.replaceAll("\\s+", "");

		System.out.printf("A frase sem espaços em branco: %s\n", string);
	}

}
