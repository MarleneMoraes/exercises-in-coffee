/*
    [DESAFIO] Desenvolva um programa que leia o primeiro termo e a 
    razão de uma PA (Progressão Aritmética), mostrando na tela os 
    10 primeiros elementos da PA e a soma entre todos os valores da 
    sequência.
 */
package passo07_RepeticaoComPara;

import java.util.Scanner;

public class ex069 {
	public static void main(String[] args) {
		/*
		 * Termo Geral da P.A.: an = a1 + (n-1)*r
		 * 
		 * Soma da P.A.: Sn = (a1+an)n/2
		 * 
		 * Razão da P.A.: r = a2-a1
		 */
		Scanner sc = new Scanner(System.in);

		int an = 0;

		System.out.println("Progressão Aritmética");

		System.out.print("Digite o primeiro termo: ");
		int a1 = sc.nextInt();

		System.out.print("Digite a razão da PA: ");
		int r = sc.nextInt();

		System.out.println("Os 10 primeiros elementos da PA:");

		for (int i = 1; i <= 10; i++) {
			an = a1 + ((i - 1) * r);
			System.out.print(an + " ");
		}

		int S = ((a1 + an) * 10) / 2;

		System.out.printf("\nSoma da P.A.: %d\n", S);

		sc.close();
	}
}
