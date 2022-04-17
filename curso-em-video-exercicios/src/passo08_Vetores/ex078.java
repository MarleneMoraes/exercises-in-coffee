/*
    Escreva um programa que leia 15 n�meros e guarde-os em um vetor.
    No final, mostre o vetor inteiro na tela e em seguida mostre em que
    posi��es foram digitados valores que s�o m�ltiplos de 10.
 */
package passo08_Vetores;

import java.util.Scanner;

public class ex078 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[];
		vetor = new int[15];

		for (int i = 1; i <= 15; i++) {
			System.out.printf("Digite o %d� n�mero: ", i);
			vetor[(i - 1)] = sc.nextInt();
		}

		System.out.println("\n-------------------------------------------");
		System.out.println("Listagem valores que s�o m�ltiplos de 10");
		System.out.println("-------------------------------------------");

		for (int i = 1; i <= 15; i++) {
			if (vetor[(i - 1)] % 10 == 0) {
				System.out.println(vetor[(i - 1)]);
			}
		}
		
		sc.close();
	}
}
