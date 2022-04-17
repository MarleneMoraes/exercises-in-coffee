/*
    Faça um programa usando a estrutura "para" que leia um 
    número inteiro positivo e mostre na tela uma contagem 
    de 0 até o valor digitado:
    Ex: Digite um valor: 9
    Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!
 */
package passo07_RepeticaoComPara;

import java.util.Scanner;

public class ex067 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();

		System.out.print("Contagem: ");

		for (int i = 0; i <= valor; i++) {
			System.out.printf("%d, ", i);
		}

		System.out.print("FIM!");
		
		sc.close();
	}
}
