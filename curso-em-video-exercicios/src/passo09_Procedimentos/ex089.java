/*
    Crie um programa que melhore o procedimento Gerador() da questão anterior
    para que o programador possa escolher uma entre três bordas:
    
    +-------=======------+ Borda 1
    ~~~~~~~~:::::::~~~~~~~ Borda 2
    <<<<<<<<------->>>>>>> Borda 3

    Ex: Uma chamada válida seria Gerador("Portugol Studio", 3, 2)
    ~~~~~~~~:::::::~~~~~~~
        Portugol Studio
        Portugol Studio
        Portugol Studio
    ~~~~~~~~:::::::~~~~~~~
 */
package passo09_Procedimentos;

import java.util.Scanner;

public class ex089 {

	static void gerador(String m, int j, int b) {
		String t = null;

		switch (b) {
		case 1:
			t = "+-------=======------+";
			break;
		case 2:
			t = "~~~~~~~~:::::::~~~~~~~";
			break;
		case 3:
			t = "<<<<<<<<------->>>>>>>";
			break;
		default:
			System.out.println("ERRO.");
		}

		System.out.println(t);

		for (int i = 0; i <= (j - 1); i++) {
			System.out.println(m);
		}

		System.out.println(t);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mensage;
		int times, border;

		System.out.print("Mensagem: ");
		mensage = scanner.nextLine();

		System.out.print("Quantidade de vezes que a mensagem aparecerá: ");
		times = scanner.nextInt();

		System.out.print("Tipo de borda que gostaria: ");
		border = scanner.nextInt();

		gerador(mensage, times, border);
		
		scanner.close();
	}
}
