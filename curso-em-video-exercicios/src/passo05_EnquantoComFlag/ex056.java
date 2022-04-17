/*
    Crie um programa que leia v�rios n�meros pelo teclado e mostre no final o somat�rio entre eles.
    Obs: O programa ser� interrompido quando o n�mero 1111 for digitado
*/

package passo05_EnquantoComFlag;

import java.util.Scanner;

public class ex056 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0, numero = 0;

		System.out.println("Somat�rio entre os n�meros");

		while (numero != 1111) {
			System.out.print("Digite um n�mero: ");
			numero = sc.nextInt();

			if (numero != 1111) {
				soma += numero;
			}
		}

		System.out.printf("Soma dos valores: %d", soma);

		sc.close();
	}
}
