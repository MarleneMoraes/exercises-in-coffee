/*
    Crie um programa que mostre na tela a seguinte contagem, usando a estrutura "faça enquanto"
        0 3 6 9 12 15 18 21 24 27 30 Acabou!
 */
package passo06_RepeticaoComFacaEnquanto;

public class ex061 {
	public static void main(String[] args) {
		int count = 0;

		do {
			System.out.print(count + " ");
			count += 3;
		} while (count <= 30);

		System.out.print("Acabou!");
	}
}
