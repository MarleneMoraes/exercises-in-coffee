/*
    [DESAFIO] Desenvolva um aplicativo que tenha um procedimento chamado
    Fibonacci() que recebe um único valor inteiro como parâmetro, indicando quantos
    termos da sequência serão mostrados na tela. O seu procedimento deve receber
    esse valor e mostrar a quantidade de elementos solicitados.
    Obs: Use os exercícios 70 e 75 para te ajudar na solução
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

		System.out.println("Sequência de Fibonacci");

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
		System.out.print("Digite o número de termos: ");
		int termos = scanner.nextInt();

		Fibonacci(termos);
		
		scanner.close();
	}
}
