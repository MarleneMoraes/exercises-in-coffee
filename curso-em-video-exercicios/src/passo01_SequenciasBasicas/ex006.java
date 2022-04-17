/*
   Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.
   Ex:
        Digite um número: 9
        O antecessor de 9 é 8
        O sucessor de 9 é 10
 */
package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, antecessor, sucessor;

		System.out.println("Digite um número: ");
		numero = sc.nextInt();

		antecessor = numero - 1;
		sucessor = numero + 1;

		System.out.printf("O antecessor de %d é %d\n"
				+ "O sucessor de %d é %d", numero, 
					antecessor, numero, sucessor);

		sc.close();
	}
}
