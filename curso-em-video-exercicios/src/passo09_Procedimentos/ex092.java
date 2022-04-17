/*
    Crie uma l�gica que leia um n�mero inteiro e passe para um procedimento
    ParOuImpar() que vai verificar e mostrar na tela se o valor passado como
    par�metro � PAR ou  �MPAR.
 */
package passo09_Procedimentos;

import java.util.Scanner;

public class ex092 {
	static void ParOuImpar(int n) {
		if (n % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("�MPAR");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;

		System.out.println("Par ou �mpar?");
		System.out.print("Digite um n�mero: ");
		numero = scanner.nextInt();

		ParOuImpar(numero);
		
		scanner.close();
	}
}
