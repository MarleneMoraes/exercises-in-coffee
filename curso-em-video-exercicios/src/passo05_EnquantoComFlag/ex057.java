/*
F    Desenvolva um aplicativo que leia o sal�rio e o sexo de v�rios funcion�rios.
    No final, mostre o total de sal�rios pagos aos homens e o total pago �s mulheres. 
    O programa vai perguntar ao usu�rio se ele quer continuar ou n�o sempre que ler 
    os dados de um funcion�rio.
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

		System.out.println("Controle de Sal�rio");

		while (answer != 'n') {
			System.out.print("Digite o sexo(F/M): ");
			char sex = sc.next().charAt(0);

			if (sex == 'm' || sex == 'f') {
				answer = toUpperCase(answer);
			}

			switch (sex) {
			case 'M':
				System.out.print("Sal�rio do funcion�rio: ");
				salary = sc.nextFloat();
				salaryMen += salary;
				break;

			case 'F':
				System.out.print("Sal�rio da funcion�ria: ");
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

		System.out.printf("Total dos sal�rio dos homens: %d", salaryMen);
		System.out.printf("Total dos sal�rio das mulheres: %d", salaryWomen);

		sc.close();
	}
}