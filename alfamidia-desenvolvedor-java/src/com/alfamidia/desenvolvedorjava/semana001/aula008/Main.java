package com.alfamidia.desenvolvedorjava.semana001.aula008;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite quantos números deseja armazenar: ");
		int quantidadeNumeros = scan.nextInt();

		int[] numeros = new int[quantidadeNumeros];

		for (int i = 0; i < numeros.length; i++) {

			System.out.print("Digite um número inteiro: ");
			numeros[i] = scan.nextInt();

		}

		System.out.println("\nDigite uma das opções abaixo:");
		System.out.println("1 - listar em ordem");
		System.out.println("2 - listar invertido");
		System.out.println("3 - exibir números menores que 5");
		System.out.println("4 - exibir o primeiro número menor que 5");

		int opcao = scan.nextInt();

		switch (opcao) {
		case 1:
			for (int i = 0; i < numeros.length; i++) {

				System.out.printf("%d	", numeros[i]);

			}
			break;

		case 2:
			for (int i = numeros.length - 1; i >= 0; i--) {

				System.out.printf("%d	", numeros[i]);

			}
			break;
			
		case 3:
			for (int i = 0; i < numeros.length; i++) {
				if (numeros[i] >= 5) {
					continue;
				}
				
				System.out.printf("%d	", numeros[i]);
				
			}
			break;
			
		case 4:
			for (int i = 0; i < numeros.length; i++) {
				if (numeros[i] >= 5) {
					break;
				}
				System.out.printf("%d	", numeros[i]);
				
			}
			break;
		default:
			System.out.println("Valor incorreto. Tente novamente");
		}
		
		scan.close();
	}

}
