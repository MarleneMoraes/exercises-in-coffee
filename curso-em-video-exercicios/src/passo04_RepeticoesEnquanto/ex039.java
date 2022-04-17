/*
    Faça um algoritmo que mostre na tela a seguinte contagem:
    10 9 8 7 6 5 4 3 Acabou!
 */
package passo04_RepeticoesEnquanto;

public class ex039 {
	public static void main(String[] args) {
		int count = 10;

		while (count >= 3) {
			System.out.printf("%d ", count);
			count--;
		}

		System.out.print("Acabou!");
	}
}
