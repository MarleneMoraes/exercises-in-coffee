/*
    Crie um programa que tenha uma fun��o Media(), que vai receber as 2 notas de
    um aluno e retornar a sua m�dia para o programa principal.
 */
package passo10_Funcoes;

import java.util.Scanner;

public class ex096 {
	static float Media(float n1, float n2) {
		return ((n1 + n2) / 2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float nota1, nota2;

		System.out.println("M�DIA DE NOTAS");

		System.out.print("Digite a primeira nota: ");
		nota1 = scanner.nextFloat();

		System.out.print("Digite a segunda nota: ");
		nota2 = scanner.nextFloat();

		float med = Media(nota1, nota2);

		System.out.printf("M�dia: %.2f\n", med);

		scanner.close();
	}
}
