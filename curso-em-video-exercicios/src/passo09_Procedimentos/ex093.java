/*
    Faça um programa que tenha um procedimento chamado Contador() que recebe
    três valores como parâmetro: o início, o fim e o incremento de uma contagem. O
    programa principal deve solicitar a digitação desses valores e passá-los ao
    procedimento, que vai mostrar a contagem na tela.
    
    Ex: Para os valores de início (4), fim (20) e incremento(3) teremos
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
		System.out.print("Digite o início: ");
		int inicio = scanner.nextInt();

		System.out.print("Digite o fim: ");
		int fim = scanner.nextInt();

		System.out.print("Digite o incremento: ");
		int incremento = scanner.nextInt();

		contador(inicio, fim, incremento);

		scanner.close();
	}
}
