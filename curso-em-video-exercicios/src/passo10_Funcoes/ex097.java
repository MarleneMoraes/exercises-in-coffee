/*
   Refa�a o exerc�cio 91, s� que agora em forma de fun��o Maior(), mas fa�a uma
    adapta��o que vai receber TR�S n�meros como par�metro e vai retornar qual foi o
    maior entre eles.
 */
package passo10_Funcoes;

import java.util.Scanner;

public class ex097 {
	static int Maior(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				return a;
			}
		}
		if (b > a) {
			if (b > c) {
				return b;
			}
		} else {
			return c;
		}

		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero1, numero2, numero3;

		System.out.print("Digite um valor: ");
		numero1 = scanner.nextInt();

		System.out.print("Digite outro valor: ");
		numero2 = scanner.nextInt();

		System.out.print("Digite o �ltimo valor: ");
		numero3 = scanner.nextInt();

		int maiorValor = Maior(numero1, numero2, numero3);

		System.out.printf("Maior valor: %d\n", maiorValor);
		
		scanner.close();
	}
}
