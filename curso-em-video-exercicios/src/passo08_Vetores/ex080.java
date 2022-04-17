/*
    Fa�a um algoritmo que preencha um vetor de 30 posi��es com n�meros 
    entre 1 e 15 sorteados pelo computador. Depois disso, pe�a para o 
    usu�rio digitar um n�mero (chave) e seu programa deve mostrar em 
    que posi��es essa chave foi encontrada. Mostre tamb�m quantas vezes 
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
