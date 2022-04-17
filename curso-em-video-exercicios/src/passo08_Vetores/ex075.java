/*
    Crie um programa que preencha automaticamente (usando lógica, não apenas
    atribuindo diretamente) um vetor numérico com 15 posições com os primeiros
    elementos da sequência de Fibonacci:
    
    1   1   2   3   5   8   13   21   34   55   89  144 233   377   610   987
    0   1   2   3   4   5   6     7   8  9  10  11  12  13  14  15
 */
package passo08_Vetores;

public class ex075 {
	public static void main(String[] args) {
		// Vetor
		int vetor[];
		vetor = new int[15];

		int a1 = 1;
		int a2 = 1;

		System.out.println("Sequência de Fibonacci");

		System.out.printf("%d %d ", a1, a2);

		for (int i = 2; i <= 15; i++) {
			int an = a1 + a2;

			vetor[i] = an;

			System.out.printf("%d ", vetor[i]);

			a1 = a2;
			a2 = an;
		}

		for (int i = 0; i <= 15; i++) {
			if (i == 0) {
				System.out.printf("\n %d ", i);
			} else if (i <= 6) {
				System.out.printf("%d  ", i);
			} else {
				System.out.printf("%d   ", i);
			}
		}
	}
}
