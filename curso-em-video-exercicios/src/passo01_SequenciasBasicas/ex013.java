/*
	Faça um algoritmo que leia o salário de um funcionário, 
	calcule e mostre o seu novo salário, com 15% de aumento.
 */

package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salario;

		System.out.println("Salário atual: ");
		salario = sc.nextFloat();

		salario += (salario * 0.15);

		System.out.printf("Seu novo salário é R$%.2f", salario);

		sc.close();
	}

}
