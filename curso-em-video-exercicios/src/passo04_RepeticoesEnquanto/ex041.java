/*
    Desenvolva um programa que mostre na tela a seguinte contagem:
    100 95 90 85 80 ... 0 Acabou!
*/

package passo04_RepeticoesEnquanto;

public class ex041 {
	public static void main(String[] args) {
		int count = 100;

		while (count >= 0) {
			System.out.printf("%d ", count);
			count -= 5;
		}

		System.out.print("Acabou!");
	}
}
