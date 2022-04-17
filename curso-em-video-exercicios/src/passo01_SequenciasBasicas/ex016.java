/*
    [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
    fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
    já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
    quantos dias de vida um fumante perderá e exiba o total em dias.
*/
package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex016 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cigarro, anos, anoEmDia;
		float tempoCigarro, tempoPerdido;

		System.out.println("Vida do Fumante");
		System.out.printf("Quantos cigarros sÃ£o fumados ao dia? ");
		cigarro = sc.nextInt();

		System.out.printf("Quantos anos vocÃª Ã© fumante? ");
		anos = sc.nextInt();

		// 1 ano = 365 dias
		anoEmDia = anos * 365;

		// 10 minutos a cada cigarro
		tempoCigarro = cigarro * 10;

		// tempo em minutos em anos
		tempoCigarro *= 365;

		// tempo em hora
		tempoCigarro /= 60;

		// tempo em dia
		tempoCigarro *= 24;

		tempoPerdido = anoEmDia - tempoCigarro;

		System.out.printf("Você perderá %d dias.", tempoPerdido);

		sc.close();
	}
}