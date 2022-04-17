/*
	Faça um algoritmo que leia um determinado ano 
	e mostre se ele é ou não BISSEXTO.
 */

package passo02_CondicoesBasicas;

import java.util.Scanner;

public class ex021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano;

		System.out.println("Bissexto ou não-bissexto?");
		System.out.print("Ano: ");
		ano = sc.nextInt();

		if (ano % 4 == 0) {
			if (ano % 100 == 0) {
				System.out.println("Ano não-bissexto.");
			} else {
				System.out.println("Ano bissexto.");
			}

			System.out.println("Ano não-bissexto.");
		}

		sc.close();
	}
}
