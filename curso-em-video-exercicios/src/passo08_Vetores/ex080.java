/*
    Faça um algoritmo que preencha um vetor de 30 posições com números 
    entre 1 e 15 sorteados pelo computador. Depois disso, peça para o 
    usuário digitar um número (chave) e seu programa deve mostrar em 
    que posições essa chave foi encontrada. Mostre também quantas vezes 
    a chave foi sorteada.
*/

package passo08_Vetores;

import java.util.Random;
import java.util.Scanner;

public class ex080 {
	public static void main(String[] args) {
		int chave, vezesChaveSorteada = 0;

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int vetor[];
		vetor = new int[30];

		for (int i = 0; i <= 30; i++) {
			vetor[i] = random.nextInt(15);
		}

		System.out.print("Digite a chave desejada: ");
		chave = scanner.nextInt();

		System.out.println("Listagem da chave foi sorteada");
		for (int i = 0; i <= 30; i++) {
			if (vetor[i] == chave) {
				System.out.println(vetor[i]);
				vezesChaveSorteada++;
			}
		}

		System.out.println("Quantidade de vezes que a chave foi sorteada: " + vezesChaveSorteada);
		
		scanner.close();

	}
}
