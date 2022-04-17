/*
    Crie um programa que leia vários números pelo teclado e mostre no final o somatório entre eles.
    Obs: O programa será interrompido quando o número 1111 for digitado
*/

package passo05_EnquantoComFlag;

import java.util.Scanner;

public class ex056 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0, numero = 0;

		System.out.println("Somatório entre os números");

		while (numero != 1111) {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();

			if (numero != 1111) {
				soma += numero;
			}
		}

		System.out.printf("Soma dos valores: %d", soma);

		sc.close();
	}
}
