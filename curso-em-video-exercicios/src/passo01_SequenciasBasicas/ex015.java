/*
    Crie um programa que leia o n�mero de dias trabalhados em um m�s 
    e mostre o sal�rio de um funcion�rio, sabendo que ele trabalha 8 
    horas por dia e ganha R$25 por hora trabalhada.
*/
package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salario;
		int dias;

		System.out.print("N�mero de dias trabalhados no m�s: ");
		dias = sc.nextInt();

		salario = dias * 25 * 8;

		System.out.printf("O funcion�rio receber� R$%.2f", salario);

		sc.close();
	}
}