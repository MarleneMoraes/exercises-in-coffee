/*
    Crie um programa que preencha automaticamente (usando lógica, não apenas
    atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
        5 3 5 3 5 3 5 3 5 3
        0 1 2 3 4 5 6 7 8 9
 */
package passo08_Vetores;

public class ex074 {

	public static void main(String[] args) {
		int vetor[];
		vetor = new int[10];

		for (int i = 0; i <= 9; i++) {
			if (i % 2 == 0) {
				vetor[i] = 5;
			} else {
				vetor[i] = 3;
			}

			System.out.printf("%d ", vetor[i]);
		}

		for (int i = 0; i <= 9; i++) {
			vetor[i] = i;

			if (i == 0) {
				System.out.printf("\n%d ", vetor[i]);
			} else {
				System.out.printf("%d ", vetor[i]);
			}
		}
	}
}
