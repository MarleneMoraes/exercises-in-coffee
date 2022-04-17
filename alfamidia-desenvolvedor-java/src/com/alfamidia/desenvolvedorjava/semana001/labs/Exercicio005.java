// Escreva um algoritmo que leia 10 valores e encontre o maior e o menor deles. Mostre o resultado.

/** 
 * @author MarleneMoraes
 * Since 2022-01-27
 * */

package com.alfamidia.desenvolvedorjava.semana001.labs;

import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int valor, menor = 0, maior = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Insira o valor: ");
			valor = scan.nextInt();
			
			if (i==0) {
				menor = valor;
				maior = valor;
			}
			
			if (valor < menor) {
				menor = valor;
			}
			
			if (valor > maior) {
				maior = valor;
			}
		}
		
		System.out.println("RESULTADO:");
		System.out.printf("Menor valor: %d\n", menor);
		System.out.printf("Maior valor: %d", maior);
		
		scan.close();

	}

}
