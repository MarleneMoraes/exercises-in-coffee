/*
    Crie um programa que melhore o procedimento Gerador() da questão anterior
    para que mostre uma mensagem várias vezes.
    
    Ex: Ao chamar Gerador("Aprendendo Portugol", 4) aparece:
    
    +-------=======------+
      Aprendendo Portugol
      Aprendendo Portugol
      Aprendendo Portugol
      Aprendendo Portugol
    +-------=======------+
 */
package passo09_Procedimentos;

import java.util.Scanner;

public class ex088 {
	static void gerador(String m, int j) {
		System.out.println("+-------=======------+");

		for (int i = 0; i <= (j - 1); i++) {
			System.out.println(m);
		}

		System.out.println("+-------=======------+");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mensage;
		int times;

		System.out.print("Mensagem: ");
		mensage = scanner.nextLine();

		System.out.print("Quantidade de vezes que a mensagem aparecerá: ");
		times = scanner.nextInt();

		gerador(mensage, times);

		scanner.close();
	}
}
