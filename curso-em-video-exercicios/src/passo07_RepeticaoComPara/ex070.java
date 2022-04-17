/*
    [DESAFIO] Faça um programa que mostre os 10 primeiros elementos da Sequência de Fibonacci:
        1 1 2 3 5 8 13 21...
 */
package passo07_RepeticaoComPara;

public class ex070 {
	public static void main(String[] args) {
		int a1 = 1;
		int a2 = 1;
		int an = 2;

		System.out.println("Sequência de Fibonacci");
		System.out.printf("%d %d ", a1, a2);

		for (int i = 1; i <= 10; i++) {
			an = a2 + a1;
			a1 = a2;
			a2 = an;

			System.out.printf("%d ", an);
		}
	}

}
