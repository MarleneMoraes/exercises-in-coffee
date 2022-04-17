/*
    Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.
    Ex:
        Nome do Funcionário: Maria do Carmo
        Salário: 1850,45
    O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
 */
package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex003 {
	public static void main(String[] args) {
		String nome;
		double salario;

		Scanner sc = new Scanner(System.in);

		System.out.print("Nome do Funcionário: ");
		nome = sc.nextLine();

		System.out.print("Salário: ");
		salario = sc.nextDouble();

		System.out.println("O funcionário " + nome + ",tem um salário de R$" + salario + " em Junho.");

		sc.close();
	}
}
