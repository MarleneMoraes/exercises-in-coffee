/*
	Desenvolva um programa que leia um número inteiro 
	e mostre se ele é PAR ou ÍMPAR.
 */
package passo02_CondicoesBasicas;

import java.util.Scanner;

public class ex020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.println("Par ou ímpar?");
		System.out.print("Digite um valor: ");
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.printf("%d é par.", numero);
		} else {
			System.out.printf("%d é ímpar.", numero);
		}

		sc.close();
	}
}
