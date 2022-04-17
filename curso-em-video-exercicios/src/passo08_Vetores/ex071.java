/*
    Faça um programa que preencha automaticamente um vetor numérico 
    com 8 posições, conforme abaixo:
        999 999 999 999 999 999 999 999
        0   1   2   3   4   5   6   7
 */
package passo08_Vetores;

public class ex071 {
	public static void main(String[] args) {
		int vetor[];
		vetor = new int[8];

		for (int i = 0; i <= 7; i++) {
			vetor[i] = 999;
			System.out.printf("%d ", vetor[i]);
		}

		for (int i = 0; i <= 7; i++) {
			vetor[i] = i;
			if (i == 0) {
				System.out.printf("\n%d   ", vetor[i]);
			} else {
				System.out.printf("%d   ", vetor[i]);
			}
		}
	}
}
