/*
    Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
    valores para um procedimento Maior() que vai verificar qual deles é o maior e
    mostrá-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem
    informando essa característica.
 */
package passo09_Procedimentos;

import java.util.Scanner;

public class ex091 {
	static void Maior(int a, int b) {
		if (a > b) {
			System.out.println("O primeiro número é maior que o segundo.");
		} else if (b > a) {
			System.out.println("O segundo número é maior que o primeiro.");
		} else {
			System.out.println("Os números são iguais");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero1, numero2;

		System.out.print("Digite um valor: ");
		numero1 = scanner.nextInt();

		System.out.print("Digite outro valor: ");
		numero2 = scanner.nextInt();

		Maior(numero1, numero2);
		
		scanner.close();
	}
}
