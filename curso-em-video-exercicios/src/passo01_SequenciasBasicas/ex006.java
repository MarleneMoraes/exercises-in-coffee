/*
   Fa�a um programa que leia um n�mero inteiro e mostre o seu antecessor e seu sucessor.
   Ex:
        Digite um n�mero: 9
        O antecessor de 9 � 8
        O sucessor de 9 � 10
 */
package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex006 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, antecessor, sucessor;

		System.out.println("Digite um n�mero: ");
		numero = sc.nextInt();

		antecessor = numero - 1;
		sucessor = numero + 1;

		System.out.printf("O antecessor de %d � %d\n"
				+ "O sucessor de %d � %d", numero, 
					antecessor, numero, sucessor);

		sc.close();
	}
}
