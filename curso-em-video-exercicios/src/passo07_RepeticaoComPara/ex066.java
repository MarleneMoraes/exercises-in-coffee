/*
    Escreva um programa que leia um número qualquer e mostre a tabuada 
    desse número, usando a estrutura "para".
    Ex: Digite um valor: 5
        5 x 1 = 5
        5 x 2 = 10
        5 x 3 = 15 ...
 */
package passo07_RepeticaoComPara;

import java.util.Scanner;

public class ex066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			int resultado = valor * i;

			System.out.printf("%d x %d = %d\n", valor, i, resultado);
		}

		sc.close();
	}
}
