/*
 * Um programa que leia o salário bruto de um funcionário e mostre o valor líquido.
 * Se o salário for menor que R$1.100, o desconto de INSS é 6%
 * Até R$2.500, 8%
 * Até R$4.800 10%
 * Maior que R$ 4.800 15%
 */

/** 
 * @author MarleneMoraes
 * Since 2022-01-27
 * */

package com.alfamidia.desenvolvedorjava.semana001.labs;

import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double salario, valorLiquido;
		
		System.out.println("PROGRAMA VALOR LÍQUIDO");
		System.out.print("Insira o salário bruto: ");
		salario = scan.nextDouble();
		
		if (salario < 1100) {
			valorLiquido = salario - (salario * 0.06);
		} else if (salario <= 2500) {
			valorLiquido = salario - (salario * 0.08);
		} else if (salario <= 4800) {
			valorLiquido = salario - (salario * 0.1);
		} else {
			valorLiquido = salario - (salario * 0.15);
		}
		
		System.out.printf("Valor líquido: R$ %.2f", valorLiquido);
		scan.close();
	}

}
