/*
	As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, e R$ 0,25 se forem compradas pelo menos doze.
	Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o valor total da compra.
 */

/** 
 * @author MarleneMoraes
 * Since 2022-01-27
 * */

package com.alfamidia.desenvolvedorjava.semana001.labs;

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int quantidadeMacas;
		double valorTotal;
		
		
		System.out.println("PROGRAMA DAS MA��S");
		System.out.print("Insira a quantidade de ma��s compradas: ");
		quantidadeMacas = scan.nextInt();
		
		if (quantidadeMacas < 12) {
			valorTotal = quantidadeMacas * 0.3;
		} else {
			valorTotal = quantidadeMacas * 0.25;
		}
		
		System.out.printf("Valor total: R$%.2f", valorTotal);
		
		scan.close();
		
	}

}
