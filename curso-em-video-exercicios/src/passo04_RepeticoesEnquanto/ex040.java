/*
    Crie um aplicativo que mostre na tela a seguinte contagem:
    0 3 6 9 12 15 18 Acabou!
 */
package passo04_RepeticoesEnquanto;

public class ex040 {
	public static void main(String[] args) {
		int count = 0;

		while (count <= 18) {
			System.out.printf("%d ", count);
			count += 3;
		}

		System.out.print("Acabou!");
	}
}
