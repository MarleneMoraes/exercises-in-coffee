/*
    [DESAFIO] Desenvolva um aplicativo que tenha um procedimento chamado
    Fibonacci() que recebe um �nico valor inteiro como par�metro, indicando quantos
    termos da sequ�ncia ser�o mostrados na tela. O seu procedimento deve receber
    esse valor e mostrar a quantidade de elementos solicitados.
    Obs: Use os exerc�cios 70 e 75 para te ajudar na solu��o
    Ex:
    Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
    Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM
 */
package passo09_Procedimentos;

import java.util.Scanner;

public class ex094 {
	static void Fibonacci(int t) {
		int vetor[];
		vetor = new int[t];

		int a1 = 1;
		int a2 = 1;

		System.out.println("Sequ�ncia de Fibonacci");

		System.out.printf("%d >> %d >> ", a1, a2);

		for (int i = 2; i <= vetor.length; i++) {
			int an = a1 + a2;

			vetor[i] = an;

			System.out.printf("%d >> ", vetor[i]);

			a1 = a2;
			a2 = an;
		}

		System.out.println("FIM");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o n�mero de termos: ");
		int termos = scanner.nextInt();

		Fibonacci(termos);
		
		scanner.close();
	}
}
