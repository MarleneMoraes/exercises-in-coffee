/*
    Fa�a um algoritmo que leia o nome, o sexo e o sal�rio de 5 funcion�rios 
    e guarde esses dados em tr�s vetores. No final, mostre uma listagem 
    contendo apenas os dados das funcion�rias mulheres que ganham mais de R$5 mil.
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

			System.out.print("Sal�rio: ");
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
