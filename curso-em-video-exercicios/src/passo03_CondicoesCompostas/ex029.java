/*
    Desenvolva um programa que leia o nome de um funcionário, seu salário, 
    quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
    acordo com a tabela a seguir:
        - Até 3 anos de empresa: aumento de 3%
        - entre 3 e 10 anos: aumento de 12.5%
        - 10 anos ou mais: aumento de 20%
 */
package passo03_CondicoesCompostas;

import java.util.Scanner;

public class ex029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int anos;
		float salario;

		System.out.print("Nome do funcionário: ");
		nome = sc.nextLine();

		System.out.print("Salário atual: ");
		salario = sc.nextFloat();

		System.out.print("Tempo de casa: ");
		anos = sc.nextInt();

		if (anos < 3) {
			salario += (salario * 0.03);
		} else if (anos < 10) {
			salario += (salario * 0.125);
		} else {
			salario += (salario * 0.2);
		}

		System.out.printf("%s, você terá reajuste de R$%.2f", nome, salario);
		
		sc.close();
	}
}
