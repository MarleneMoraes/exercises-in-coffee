/*
F    Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
    No final, mostre o total de salários pagos aos homens e o total pago às mulheres. 
    O programa vai perguntar ao usuário se ele quer continuar ou não sempre que ler 
    os dados de um funcionário.
*/

package passo05_EnquantoComFlag;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;
import java.util.Scanner;

public class ex057 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char answer;
		float salary, salaryMen, salaryWomen;

		salary = 0;
		salaryMen = 0;
		salaryWomen = 0;
		answer = 's';

		System.out.println("Controle de Salário");

		while (answer != 'n') {
			System.out.print("Digite o sexo(F/M): ");
			char sex = sc.next().charAt(0);

			if (sex == 'm' || sex == 'f') {
				answer = toUpperCase(answer);
			}

			switch (sex) {
			case 'M':
				System.out.print("Salário do funcionário: ");
				salary = sc.nextFloat();
				salaryMen += salary;
				break;

			case 'F':
				System.out.print("Salário da funcionária: ");
				salary = sc.nextFloat();
				salaryWomen += salary;
				break;
			default:
				System.out.println("Erro. Tente novamente.");
				break;
			}

			System.out.print("Deseja continuar? (S/N) ");
			answer = sc.next().charAt(0);

			if (answer == 'N') {
				answer = toLowerCase(answer);
			}
		}

		System.out.printf("Total dos salário dos homens: %d", salaryMen);
		System.out.printf("Total dos salário das mulheres: %d", salaryWomen);

		sc.close();
	}
}