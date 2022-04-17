/*
    Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No
    final, mostre uma listagem com todos os nomes informados, na ordem inversa
    daquela em que eles foram informados.
 */
package passo08_Vetores;

import java.util.Scanner;

public class ex077 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nomePessoa[];
		nomePessoa = new String[7];

		for (int i = 1; i <= 7; i++) {
			System.out.printf("Digite o nome da %dª pessoa: ", i);
			nomePessoa[(i - 1)] = sc.nextLine();
		}

		System.out.println("\n-------------------");
		System.out.println("Listagem de nomes");
		System.out.println("-------------------");

		for (int i = 6; i >= 0; i--) {
			System.out.printf("%s\n", nomePessoa[i]);
		}
		
		sc.close();
	}
}
