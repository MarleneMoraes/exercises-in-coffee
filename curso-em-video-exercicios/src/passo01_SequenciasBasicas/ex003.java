/*
    Crie um programa que leia o nome e o sal�rio de um funcion�rio, mostrando no final uma mensagem.
    Ex:
        Nome do Funcion�rio: Maria do Carmo
        Sal�rio: 1850,45
    O funcion�rio Maria do Carmo tem um sal�rio de R$1850,45 em Junho.
 */
package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex003 {
	public static void main(String[] args) {
		String nome;
		double salario;

		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do Funcion�rio: ");
		nome = sc.nextLine();

		System.out.print("Sal�rio: ");
		salario = sc.nextDouble();

		System.out.println("O funcion�rio " + nome + ",tem um sal�rio de R$" + salario + " em Junho.");

		sc.close();
	}
}
