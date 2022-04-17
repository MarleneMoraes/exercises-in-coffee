/*
    Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
    valores para um procedimento Somador() que vai calcular e mostrar a soma 
    entre eles.
 */
package passo09_Procedimentos;

import java.util.Scanner;

public class ex090 {

	static void Somador(int a, int b, int s) {
		s = a + b;

		System.out.printf("Soma: %d\n", s);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int soma, num1, num2;

		soma = 0;

		System.out.println("SOMA DE VALORES");

		System.out.print("Digite um valor: ");
		num1 = scanner.nextInt();

		System.out.print("Digite outro valor: ");
		num2 = scanner.nextInt();

		Somador(num1, num2, soma);
		
		scanner.close();
	}
}
