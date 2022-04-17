/*
    Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
    O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
        a) O nome da pessoa mais velha
        b) O nome da mulher mais jovem
        c) A média de idade do grupo
        d) Quantos homens tem mais de 30 anos
        e) Quantas mulheres tem menos de 18 anos
 */
package passo05_EnquantoComFlag;

import static java.lang.Character.toUpperCase;
import java.util.Scanner;

public class ex060 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0, oldAge = 0, newestWomen = 0, olderThirty = 0, newestEighteen = 0;
		float average = 0;
		char answer = 's';

		System.out.println("Controle de Idade");

		while (answer != 'n' || answer != 'N') {
			System.out.print("Digite o nome: ");
			System.out.print("Digite a idade: ");
			int age = sc.nextInt();

			average += age;

			if (oldAge == 0 || oldAge < age) {
				oldAge = age;
			}

			System.out.print("Digite o sexo(F/M): ");
			char sex = sc.next().charAt(0);

			if (sex == 'm' || sex == 'f') {
				answer = toUpperCase(answer);
			}

			switch (sex) {
			case 'M':
				if (age > 30) {
					olderThirty++;
				}
				break;

			case 'F':
				if (newestWomen == 0 || newestWomen < age) {
					newestWomen = age;

					if (age < 18) {
						newestEighteen++;
					}
				}
				break;
			default:
				System.out.println("Erro. Tente novamente.");
				break;
			}

			System.out.print("Deseja continuar? (S/N) ");
			answer = sc.next().charAt(0);
			count++;
		}

		average /= count;

		System.out.printf("Maior idade: %d\n", oldAge);
		System.out.printf("Mulher mais jovem: %d\n", newestWomen);
		System.out.printf("Média de idade: %.2f\n", average);
		System.out.printf("Homens com mais de 30 anos: %d\n", olderThirty);
		System.out.printf("Mulheres com menos de 18 anos: %d\n", newestEighteen);

		sc.close();
	}
}
