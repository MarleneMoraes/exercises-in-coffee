/*
    Fa�a um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas para ela:
    
    Ex:
        Qual � o seu nome? Jo�o da Silva
        Ol� Jo�o da Silva, � um prazer te conhecer!
 */
package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex002 {
	public static void main(String[] args) {
		String nome;
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual � o seu nome?");
		nome = sc.nextLine();

		System.out.println("Ol� " + nome + ", � um prazer te conhecer!");

		sc.close();
	}
}
