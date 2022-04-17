/*
    Crie um programa que preencha automaticamente um vetor numérico com 7
    números gerados aleatoriamente pelo computador e depois mostre os valores
    gerados na tela.
 */
package passo08_Vetores;

import java.util.Random;

public class ex076 {
	public static void main(String[] args) {
		Random aleatorio = new Random();

		int vetor[];
		vetor = new int[7];

		for (int i = 0; i <= 6; i++) {
			vetor[i] = aleatorio.nextInt();
			System.out.printf("%d ", vetor[i]);
		}
	}
}
