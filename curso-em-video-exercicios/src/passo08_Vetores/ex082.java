/*
    Fa�a um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em um vetor.
    No final, mostre:
        a) Qual � a m�dia da turma
        b) Quantos alunos est�o acima da m�dia da turma
        c) Qual foi a maior nota digitada
        d) Em que posi��es a maior nota aparece
 */

package passo08_Vetores;

import java.util.Scanner;

public class ex082 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float nota[];
		nota = new float[10];

		float mediaTurma = 0;
		float maiorNota = 0;

		for (int i = 0; i <= 9; i++) {
			System.out.print("Digite a nota: ");
			nota[i] = scanner.nextFloat();

			if (nota[i] > maiorNota) {
				maiorNota = nota[i];
			}

			mediaTurma += nota[i];
		}

		System.out.println("\nRESULTADOS");
		mediaTurma /= 10;

		System.out.printf("M�dia da turma: %.2f\n", mediaTurma);

		int alunosAcimaMedia = 0;
		for (int i = 0; i <= 9; i++) {
			if (nota[i] > mediaTurma) {
				alunosAcimaMedia++;
			}
		}

		System.out.printf("Alunos acima da m�dia da turma: %d\n", alunosAcimaMedia);

		System.out.printf("Maior nota digitada: %.2f\n", maiorNota);

		System.out.print("Posi��es que a maior nota aparece: ");

		for (int i = 0; i <= 8; i++) {
			if (nota[i] > mediaTurma) {
				System.out.print(i + " ");
			}
		}
		
		scanner.close();
	}
}
