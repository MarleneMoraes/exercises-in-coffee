/*
    [DESAFIO] Crie uma lógica que preencha um vetor de 20 posições 
    com números aleatórios (entre 0 e 99) gerados pelo computador.
    Logo em seguida, mostre os números gerados e depois coloque o 
    vetor em ordem crescente, mostrando no final os valores ordenados.
 */
package passo08_Vetores;

import java.util.Arrays;
import java.util.Random;

public class ex083 {
	public static void main(String[] args) {
		Random random = new Random();
		// Scanner scanner = new Scanner (System.in);
		int aleatorios[];

		aleatorios = new int[20];

		for (int i = 0; i <= 19; i++) {
			aleatorios[i] = random.nextInt(99);
			System.out.printf("%d ", aleatorios[i]);
		}

		// Ordenação dos valores
		Arrays.sort(aleatorios);

		System.out.println("\n----------------------------------------------------------");
		System.out.println("NÚMEROS ORDENADOS");
		for (int i = 0; i <= 19; i++) {
			System.out.printf("%d ", aleatorios[i]);
		}

	}
}
