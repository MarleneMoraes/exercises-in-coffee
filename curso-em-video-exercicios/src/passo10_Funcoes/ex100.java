/*
    Melhore o exerc�cio 96, criando al�m da fun��o Media() uma outra fun��o
    chamada Situacao(), que vai retornar para o programa principal se o aluno est�
    APROVADO, em RECUPERA��O ou REPROVADO. Essa nova fun��o, vai receber como
    par�metro o resultado retornado pela fun��o Media().
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
			return "RECUPERA��O";
		} else {
			return "APROVADO";
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float nota1, nota2;

		System.out.println("M�DIA DE NOTAS");

		System.out.print("Digite a primeira nota: ");
		nota1 = scanner.nextFloat();

		System.out.print("Digite a segunda nota: ");
		nota2 = scanner.nextFloat();

		float media = Media(nota1, nota2);
		String resultado = Situacao(media);

		System.out.printf("Situa��o: %.s\n", resultado);

		scanner.close();
	}
}
