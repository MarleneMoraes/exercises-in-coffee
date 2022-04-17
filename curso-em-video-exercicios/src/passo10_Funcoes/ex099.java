/*
    Fa�a um programa que possua uma fun��o chamada Potencia(), que vai receber
    dois par�metros num�ricos (base e expoente) e vai calcular o resultado da
    exponencia��o.
    Ex: Potencia(5,2) vai calcular 5� = 25
 */
package passo10_Funcoes;

import java.util.Scanner;

public class ex099 {
	static double Potencia(double b, double e) {
		return (Math.pow(b, e));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double base, expoente;

		System.out.println("POTENCIA��O");
		System.out.print("Digite a base: ");
		base = scanner.nextDouble();

		System.out.print("Digite a expoente: ");
		expoente = scanner.nextDouble();

		double potenciacao = Potencia(base, expoente);

		System.out.printf("Pot�ncia: %.1f\n", potenciacao);

		scanner.close();
	}
}
