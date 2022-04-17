/*
	Fa�a um algoritmo que leia um determinado ano 
	e mostre se ele � ou n�o BISSEXTO.
 */

package passo02_CondicoesBasicas;

import java.util.Scanner;

public class ex021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano;

		System.out.println("Bissexto ou n�o-bissexto?");
		System.out.print("Ano: ");
		ano = sc.nextInt();

		if (ano % 4 == 0) {
			if (ano % 100 == 0) {
				System.out.println("Ano n�o-bissexto.");
			} else {
				System.out.println("Ano bissexto.");
			}

			System.out.println("Ano n�o-bissexto.");
		}

		sc.close();
	}
}
