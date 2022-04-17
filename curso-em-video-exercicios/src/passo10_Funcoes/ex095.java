/*
    Refaça o exercício 90, só que agora em forma de função Somador(), que vai
    receber dois parâmetros e vai retornar o resultado da soma entre eles para o
    programa principal.
 */
package passo10_Funcoes;

import java.util.Scanner;

public class ex095 {
	static int Somador(int a, int b) {
		return (a + b);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2;

		System.out.println("SOMA DE VALORES");

		System.out.print("Digite um valor: ");
		num1 = scanner.nextInt();

		System.out.print("Digite outro valor: ");
		num2 = scanner.nextInt();

		int soma = Somador(num1, num2);

		System.out.printf("Soma: %d\n", soma);
		
		scanner.close();
	}
}
