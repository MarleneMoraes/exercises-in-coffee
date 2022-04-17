/*
    Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses 
    valores em dois vetores, em posições relacionadas. No final, mostre 
    uma listagem contendo apenas os dados das pessoas menores de idade.
*/

package passo08_Vetores;

import java.util.Scanner;

public class ex084 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome[];
		int idade[];

		nome = new String[9];
		idade = new int[9];

		for (int i = 0; i <= 8; i++) {
			System.out.print("Nome: ");
			nome[i] = scanner.nextLine();

			System.out.print("Idade: ");
			idade[i] = scanner.nextInt();
		}

		System.out.println("\nLISTAGEM MENORES DE IDADE");

		for (int i = 0; i <= 8; i++) {
			if (idade[i] < 18) {
				System.out.print(nome[i]);
				System.out.printf("     %d\n", idade[i]);
			}
		}

		scanner.close();
	}
}
