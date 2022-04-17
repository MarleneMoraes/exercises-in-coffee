/*
    O programa acima vai ter um problema quando digitarmos o primeiro 
    valor maior que o �ltimo. Resolva esse problema com um c�digo que 
    funcione em qualquer situa��o.
*/

package passo04_RepeticoesEnquanto;

import java.util.Scanner;

public class ex045 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro Valor: ");
		int inicio = sc.nextInt();

		System.out.print("Digite o �ltimo Valor: ");
		int fim = sc.nextInt();

		System.out.print("Digite o incremento ou decremento: ");
		int i = sc.nextInt();

		if (inicio < fim) {

			while (inicio <= fim) {
				System.out.printf("%d ", inicio);
				inicio += i;
			}

			System.out.println("Acabou!");

		} else if (fim < inicio) {

			while (fim <= inicio) {
				System.out.printf("%d ", inicio);
				inicio -= i;
			}
			System.out.println("Acabou!");
		} else {
			System.out.println("N�o � poss�vel fazer a contagem.");
		}

		sc.close();
	}
}
