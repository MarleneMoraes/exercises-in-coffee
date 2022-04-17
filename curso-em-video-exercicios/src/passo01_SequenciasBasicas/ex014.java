/*
    A locadora de carros precisa da sua ajuda para cobrar seus serviços. 
    Escreva um programa que pergunte a quantidade de Km percorridos por 
    um carro alugado e a quantidade de dias pelos quais ele foi alugado. 
    Calcule o preço total a pagar, sabendo que o carro custa R$90 por 
    dia e R$0,20 por Km rodado.  
*/

package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float quilometros, total;
		int dias;

		System.out.print("Km percorridos: ");
		quilometros = sc.nextFloat();

		System.out.print("Quantidade de dias que ele foi alugado: ");
		dias = sc.nextInt();

		total = (float) ((quilometros * 0.2) + (90 * dias));
		System.out.printf("Serviço total: R$%.2f", total);

		sc.close();
	}
}
