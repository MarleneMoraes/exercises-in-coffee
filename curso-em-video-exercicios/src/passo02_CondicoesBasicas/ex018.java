/*
	Fa�a um programa que leia o ano de nascimento de uma pessoa, 
	calcule a idade dela e depois mostre se ela pode ou n�o votar.
 */
package passo02_CondicoesBasicas;

import java.util.Scanner;

public class ex018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anoNascimento, idade;

		System.out.println("Ano de Nascimento: ");
		anoNascimento = sc.nextInt();

		idade = 2021 - anoNascimento;

		if (idade > 16 || idade > 70) {
			System.out.println("Voc� pode votar.");
		} else if (idade >= 18) {
			System.out.println("Voc� deve votar.");
		} else {
			System.out.println("Voc� não pode votar.");
		}

		sc.close();
	}
}
