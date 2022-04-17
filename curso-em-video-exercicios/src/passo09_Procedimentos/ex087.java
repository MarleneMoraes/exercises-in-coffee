/*
    Crie um programa que melhore o procedimento Gerador() da questão anterior
    para que mostre uma mensagem personalizada, passada como parâmetro.
    
    Ex: Ao chamar Gerador("Aprendendo Portugol") aparece:
        +-------=======------+
          Aprendendo Portugol
        +-------=======------+
 */
package passo09_Procedimentos;

import java.util.Scanner;

public class ex087 {
	static void gerador(String m) {
		System.out.println("+-------=======------+");
		System.out.println(m);
		System.out.println("+-------=======------+");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mensage;

		System.out.print("Digite uma mensagem: ");
		mensage = scanner.nextLine();

		gerador(mensage);

		scanner.close();
	}
}
