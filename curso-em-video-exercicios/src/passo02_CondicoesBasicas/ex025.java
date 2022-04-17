/*
    [DESAFIO] Crie um programa que leia o tamanho de tr�s segmentos de reta.
    Analise seus comprimentos e diga se � poss�vel formar um tri�ngulo com 
    essas retas. Matematicamente, para tr�s segmentos formarem um tri�ngulo, 
    o comprimento de cada lado deve ser menor que a soma dos outros dois.
 */
package passo02_CondicoesBasicas;

import java.util.Scanner;

public class ex025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float lado1, lado2, lado3;

		System.out.println("Tri�ngulo ou n�o?");
		System.out.println("Reta 1: ");
		lado1 = sc.nextFloat();

		System.out.println("Reta 2: ");
		lado2 = sc.nextFloat();

		System.out.println("Reta 3: ");
		lado3 = sc.nextFloat();

		if (lado1 < lado2 + lado3) {
			if (lado2 < lado1 + lado3) {
				if (lado3 < lado1 + lado2) {
					System.out.println("� poss�vel formar um tri�ngulo");
				} else {
					System.out.println("N�o � poss�vel formar um tri�ngulo.");
				}
			} else {
				System.out.println("N�o � poss�vel formar um tri�ngulo.");
			}
		} else {
			System.out.println("N�o � poss�vel formar um tri�ngulo.");
		}
		sc.close();
	}
}
