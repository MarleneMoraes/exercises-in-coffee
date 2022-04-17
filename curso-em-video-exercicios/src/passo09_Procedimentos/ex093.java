/*
    Fa�a um programa que tenha um procedimento chamado Contador() que recebe
    tr�s valores como par�metro: o in�cio, o fim e o incremento de uma contagem. O
    programa principal deve solicitar a digita��o desses valores e pass�-los ao
    procedimento, que vai mostrar a contagem na tela.
    
    Ex: Para os valores de in�cio (4), fim (20) e incremento(3) teremos
    Contador(4, 20, 3) vai mostrar na tela 4 >> 7 >> 10 >> 13 >> 16 >> 19 >> FIM
 */
package passo09_Procedimentos;

import java.util.Scanner;

public class ex093 {
	static void contador(int inic, int fim, int i) {
		for (int j = inic; j <= fim; j += i) {
			System.out.printf("%d >> ", j);
		}

		System.out.println("FIM");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("CONTADOR");
		System.out.print("Digite o in�cio: ");
		int inicio = scanner.nextInt();

		System.out.print("Digite o fim: ");
		int fim = scanner.nextInt();

		System.out.print("Digite o incremento: ");
		int incremento = scanner.nextInt();

		contador(inicio, fim, incremento);

		scanner.close();
	}
}
