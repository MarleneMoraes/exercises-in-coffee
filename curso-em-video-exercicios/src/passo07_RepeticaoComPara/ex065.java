/*
    Desenvolva um programa usando a estrutura "para" que mostre na tela a seguinte contagem:
        100 90 80 70 60 50 40 30 20 10 0 Acabou!
 */
package passo07_RepeticaoComPara;

public class ex065 {
	public static void main(String[] args) {
		for (int i = 100; i >= 0; i -= 10) {
			System.out.print(i + " ");
		}

		System.out.print("Acabou!");
	}
}
