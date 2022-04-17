/*
 * Escreva um algoritmo que calcule a m�dia aritm�tica das 3 notas dos alunos de uma classe. 
 * O algoritmo dever� ler, al�m das notas, o c�digo do aluno e dever� ser encerrado quando o c�digo for igual a zero.
 */

/** 
 * @author MarleneMoraes
 * Since 2022-01-27
 * */

package com.alfamidia.desenvolvedorjava.semana001.labs;

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double nota1, nota2, nota3, media;
		
		System.out.println("PROGRAMA DE M�DIAS ARITM�TICAS");
		System.out.print("Insira o c�digo do aluno: ");
		int codigo = scan.nextInt();
		
		while (codigo != 0) {
			System.out.print("Insira a primeira nota: ");
			nota1 = scan.nextDouble();
			
			System.out.print("Insira a segunda nota: ");
			nota2 = scan.nextDouble();
			
			System.out.print("Insira a terceira nota: ");
			nota3 = scan.nextDouble();
			
			media = (nota1+nota2+nota3) / 3;
			System.out.printf("M�dia aritm�tica: %.2f\n", media);

			System.out.print("Insira o c�digo do aluno: ");
			codigo = scan.nextInt();
		}
		
		
		scan.close();
	}

}
