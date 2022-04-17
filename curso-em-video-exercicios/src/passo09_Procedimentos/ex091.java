/*
    Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
    valores para um procedimento Maior() que vai verificar qual deles � o maior e
    mostr�-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem
    informando essa caracter�stica.
 */
package passo09_Procedimentos;

import java.util.Scanner;

public class ex091 {
	static void Maior(int a, int b) {
		if (a > b) {
			System.out.println("O primeiro n�mero � maior que o segundo.");
		} else if (b > a) {
			System.out.println("O segundo n�mero � maior que o primeiro.");
		} else {
			System.out.println("Os n�meros s�o iguais");
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
