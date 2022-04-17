/*
    Crie um programa que tenha uma função SuperSomador(), que vai receber dois
    números como parâmetro e depois vai retornar a soma de todos os valores no
    intervalo entre os valores recebidos.
    Ex:
    SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
    SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar 85
 */
package passo10_Funcoes;

import java.util.Scanner;

public class ex098 {

	static int SuperSomador(int a, int b) {
		for (int i = (a + 1); i <= b; i++) {
			a += i;
		}

		return a;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2;

		System.out.println("SOMA DE VALORES");

		System.out.print("Digite um valor: ");
		num1 = scanner.nextInt();

		System.out.print("Digite outro valor: ");
		num2 = scanner.nextInt();

		int soma = SuperSomador(num1, num2);

		System.out.printf("Soma: %d\n", soma);
		
		scanner.close();
	}
}