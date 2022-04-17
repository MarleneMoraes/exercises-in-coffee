/*
    [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
    Analise seus comprimentos e diga se é possível formar um triângulo com 
    essas retas. Matematicamente, para três segmentos formarem um triângulo, 
    o comprimento de cada lado deve ser menor que a soma dos outros dois.
 */
package passo02_CondicoesBasicas;

import java.util.Scanner;

public class ex025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float lado1, lado2, lado3;

		System.out.println("Triângulo ou não?");
		System.out.println("Reta 1: ");
		lado1 = sc.nextFloat();

		System.out.println("Reta 2: ");
		lado2 = sc.nextFloat();

		System.out.println("Reta 3: ");
		lado3 = sc.nextFloat();

		if (lado1 < lado2 + lado3) {
			if (lado2 < lado1 + lado3) {
				if (lado3 < lado1 + lado2) {
					System.out.println("É possível formar um triângulo");
				} else {
					System.out.println("Não é possível formar um triângulo.");
				}
			} else {
				System.out.println("Não é possível formar um triângulo.");
			}
		} else {
			System.out.println("Não é possível formar um triângulo.");
		}
		sc.close();
	}
}
