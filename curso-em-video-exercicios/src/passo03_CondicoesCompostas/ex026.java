/*
    Escreva um algoritmo que leia dois n�meros inteiros 
    e compare-os, mostrando na tela uma das mensagens abaixo:
     - O primeiro valor � o maior
     - O segundo valor � o maior
     - N�o existe valor maior, os dois s�o iguais
 */
package passo03_CondicoesCompostas;

import java.util.Scanner;

public class ex026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero1, numero2;

		System.out.println("Maior ou Menor?");
		System.out.println("Digite um valor: ");
		numero1 = sc.nextInt();

		System.out.print("Digite outro valor: ");
		numero2 = sc.nextInt();

		if (numero1 > numero2) {
			System.out.println("O primeiro valor � o maior.");
		} else if (numero2 > numero1) {
			System.out.println("O segundo valor � o maior.");
		} else {
			System.out.println("N�o existe valor maior, os dois s�o iguais");
		}

		sc.close();
	}
}
