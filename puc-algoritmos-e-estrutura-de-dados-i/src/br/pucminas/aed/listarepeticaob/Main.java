package br.pucminas.aed.listarepeticaob;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author: Marlene Moraes 
 * @since: 04/10/2020
 */

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int ex;

		System.out.println("LISTA IIIb - EXERCÍCIOS REPETIÇÃO");

		do {
			System.out.print("\nDigite o número do exercício (1-8) ou 0 para sair: ");
			ex = sc.nextInt();

			switch (ex) {
			case 0:
				break;
			case 1:
				Exercises.ex001();
				break;
			case 2:
				Exercises.ex002();
				break;
			case 3:
				Exercises.ex003();
				break;
			case 4:
				Exercises.ex004();
				break;
			case 5:
				Exercises.ex005();
				break;
			case 6:
				Exercises.ex006();
				break;
			case 7:
				Exercises.ex007();
				break;
			case 8:
				Exercises.ex008();
				break;
			}
		} while (ex != 0);
		
		sc.close();
	}
}
