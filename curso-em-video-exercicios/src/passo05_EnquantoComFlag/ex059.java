/*
    Crie um programa que leia o sexo e a idade de várias pessoas. 
    O programa vai perguntar se o usuário quer continuar ou não a cada pessoa. 
    No final, mostre:
        a) qual é a maior idade lida
        b) quantos homens foram cadastrados
        c) qual é a idade da mulher mais jovem
        d) qual é a média de idade entre os homens
*/

package passo05_EnquantoComFlag;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

public class ex059 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int oldAge = 0, men = 0, newestWomen = 0;
		float averageMen = 0;
		char answer = 's';

		System.out.println("Controle de Idade");

		while (answer != 'n' || answer != 'N') {
			System.out.print("Digite o sexo(F/M): ");
			char sex = sc.next().charAt(0);

			if (sex == 'm' || sex == 'f') {
				answer = toUpperCase(answer);
			}

			System.out.print("Digite a idade: ");
			int age = sc.nextInt();

			if (oldAge == 0 || oldAge < age) {
				oldAge = age;
			}

			switch (sex) {
			case 'M':
				men++;
				averageMen += age;
				break;

			case 'F':
				if (newestWomen == 0 || newestWomen < age) {
					newestWomen = age;
				}
				break;
			default:
				System.out.println("Erro. Tente novamente.");
				break;
			}

			System.out.print("Deseja continuar? (S/N) ");
			answer = sc.next().charAt(0);

		}

		averageMen /= men;

		System.out.printf("Maior idade: %d\n", oldAge);
		System.out.printf("Homens cadastrados: %d\n", men);
		System.out.printf("Mulher mais jovem: %d\n", newestWomen);
		System.out.printf("Média de idade dos homens: %.2f\n", averageMen);
		
		sc.close();
	}
}
