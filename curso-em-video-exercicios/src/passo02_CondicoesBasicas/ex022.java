/*
    Escreva um programa que leia o ano de nascimento de um rapaz 
    e mostre a sua situa��o em rela��o ao alistamento militar.
    	- Se estiver antes dos 18 anos, mostre em quantos anos 
    	faltam para o alistamento.
        - Se j� tiver depois dos 18 anos, mostre quantos anos 
        j� se passaram do alistamento.
 */
package passo02_CondicoesBasicas;

import java.util.Scanner;

public class ex022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anoNascimento, idade, anos;

		System.out.println("Ano de Nascimento: ");
		anoNascimento = sc.nextInt();

		idade = 2021 - anoNascimento;

		if (idade < 18) {
			anos = 18 - idade;
			System.out.printf("Faltam %d anos para o alistamento.", anos);
		} else if (idade > 18) {
			anos = idade - 18;
			System.out.printf("J� se passaram %d anos para o alistamento.", anos);
		} else {
			System.out.println("Est� na hora de voc� se alistar!");
		}

		sc.close();
	}
}
