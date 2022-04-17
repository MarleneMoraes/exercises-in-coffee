/*
    Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-vindas para ela:
    
    Ex:
        Qual é o seu nome? João da Silva
        Olá João da Silva, é um prazer te conhecer!
 */
package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex002 {
	public static void main(String[] args) {
		String nome;
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual é o seu nome?");
		nome = sc.nextLine();

		System.out.println("Olá " + nome + ", é um prazer te conhecer!");

		sc.close();
	}
}
