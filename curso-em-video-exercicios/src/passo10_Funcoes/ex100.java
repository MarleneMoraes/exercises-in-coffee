/*
    Melhore o exercício 96, criando além da função Media() uma outra função
    chamada Situacao(), que vai retornar para o programa principal se o aluno está
    APROVADO, em RECUPERAÇÃO ou REPROVADO. Essa nova função, vai receber como
    parâmetro o resultado retornado pela função Media().
 */
package passo10_Funcoes;

import java.util.Scanner;

public class ex100 {
	static float Media(float n1, float n2) {
		return ((n1 + n2) / 2);
	}

	static String Situacao(float Media) {
		if (Media < 5) {
			return "REPROVADO";
		} else if (Media >= 6.9) {
			return "RECUPERAÇÃO";
		} else {
			return "APROVADO";
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float nota1, nota2;

		System.out.println("MÉDIA DE NOTAS");

		System.out.print("Digite a primeira nota: ");
		nota1 = scanner.nextFloat();

		System.out.print("Digite a segunda nota: ");
		nota2 = scanner.nextFloat();

		float media = Media(nota1, nota2);
		String resultado = Situacao(media);

		System.out.printf("Situação: %.s\n", resultado);

		scanner.close();
	}
}
