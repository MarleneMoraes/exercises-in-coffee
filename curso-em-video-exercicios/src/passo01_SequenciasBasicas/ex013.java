/*
	Fa�a um algoritmo que leia o sal�rio de um funcion�rio, 
	calcule e mostre o seu novo sal�rio, com 15% de aumento.
 */

package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salario;

		System.out.println("Sal�rio atual: ");
		salario = sc.nextFloat();

		salario += (salario * 0.15);

		System.out.printf("Seu novo sal�rio � R$%.2f", salario);

		sc.close();
	}

}
