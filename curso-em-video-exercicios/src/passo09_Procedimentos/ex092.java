/*
    Crie uma lógica que leia um número inteiro e passe para um procedimento
    ParOuImpar() que vai verificar e mostrar na tela se o valor passado como
    parâmetro é PAR ou  ÍMPAR.
 */
package passo09_Procedimentos;

import java.util.Scanner;

public class ex092 {
	static void ParOuImpar(int n) {
		if (n % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero;

		System.out.println("Par ou Ímpar?");
		System.out.print("Digite um número: ");
		numero = scanner.nextInt();

		ParOuImpar(numero);
		
		scanner.close();
	}
}
