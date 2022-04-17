/*
    Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.
    Ex:
        Digite um valor: 8
        Digite outro valor: 5
        A soma entre 8 e 5 é igual a 13.
 */
package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1, valor2, soma;

		System.out.print("Digite um valor: ");
		valor1 = sc.nextInt();

		System.out.print("Digite outro valor: ");
		valor2 = sc.nextInt();

		soma = valor1 + valor2;

		System.out.printf("A soma entre %d e %d é igual a %d.", valor1, valor2, soma);

		sc.close();
	}
}
