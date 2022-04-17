/*
    Fa�a um algoritmo que leia a idade de v�rios alunos de uma turma. 
    O programa vai parar quando for digitada a idade 999. 
    No final, mostre quantos alunos existem na turma e qual � a m�dia
    de idade do grupo.
*/

package passo05_EnquantoComFlag;

import java.util.Scanner;

public class ex058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float average = 0;
		int age = 0, qtdstudent = 0;

		System.out.println("Controle de Idade");

		while (age != 999) {
			System.out.printf("Digite a idade do aluno: ");
			age = sc.nextInt();

			if (age != 999) {
				average += age;
				qtdstudent++;
			}
		}

		average /= qtdstudent;

		System.out.printf("Quantidade de alunos: %d\n", qtdstudent);
		System.out.printf("M�dia de idade: %d\n", average);

		sc.close();
	}
}
