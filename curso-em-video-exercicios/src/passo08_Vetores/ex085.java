/*
    Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários 
    e guarde esses dados em três vetores. No final, mostre uma listagem 
    contendo apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.
 */
package passo08_Vetores;

import java.util.Scanner;

public class ex085 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name[];
		char sex[];
		float salary[];

		name = new String[5];
		sex = new char[5];
		salary = new float[5];

		for (int i = 0; i <= 8; i++) {
			System.out.print("Nome: ");
			name[i] = scanner.nextLine();

			System.out.print("Sexo(F/M): ");
			sex[i] = scanner.next().charAt(0);

			System.out.print("Salário: ");
			salary[i] = scanner.nextFloat();
		}

		System.out.println(" ");
		System.out.println("MULHERES QUE GANHAM MAIS DE 5 MIL");

		for (int i = 0; i <= 8; i++) {
			if ((sex.equals('f') || sex.equals('F')) && salary[i] < 5000) {
				System.out.print(name[i]);
				System.out.printf("     %d\n", sex[i]);
				System.out.printf("     %d\n", salary[i]);
			}
		}

		scanner.close();
	}
}
