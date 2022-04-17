/*
    Crie um programa que leia o número de dias trabalhados em um mês 
    e mostre o salário de um funcionário, sabendo que ele trabalha 8 
    horas por dia e ganha R$25 por hora trabalhada.
*/
package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salario;
		int dias;

		System.out.print("Número de dias trabalhados no mês: ");
		dias = sc.nextInt();

		salario = dias * 25 * 8;

		System.out.printf("O funcionário receberá R$%.2f", salario);

		sc.close();
	}
}