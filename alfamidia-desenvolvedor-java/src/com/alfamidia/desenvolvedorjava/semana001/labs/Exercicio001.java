//Escreva um programa para ler 2 valores e escrever o maior deles

/** 
 * @author MarleneMoraes
 * Since 2022-01-27
 * */

package com.alfamidia.desenvolvedorjava.semana001.labs;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("PROGRAMA DO MAIOR");
		
		System.out.print("Insira um valor: ");
		int valor1 = scan.nextInt();
		
		System.out.print("Insira outro valor: ");
		int valor2 = scan.nextInt();

		if (valor1 > valor2) {
			System.out.printf("O valor %d é maior.", valor1);
		} else {
			System.out.printf("O valor %d é maior.", valor2);
		}
		
		
		scan.close();
	}

}
