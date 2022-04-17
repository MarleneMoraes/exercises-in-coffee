/*
    Faça um programa que possua uma função chamada Potencia(), que vai receber
    dois parâmetros numéricos (base e expoente) e vai calcular o resultado da
    exponenciação.
    Ex: Potencia(5,2) vai calcular 5² = 25
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

		System.out.println("POTENCIAÇÃO");
		System.out.print("Digite a base: ");
		base = scanner.nextDouble();

		System.out.print("Digite a expoente: ");
		expoente = scanner.nextDouble();

		double potenciacao = Potencia(base, expoente);

		System.out.printf("Potência: %.1f\n", potenciacao);

		scanner.close();
	}
}
