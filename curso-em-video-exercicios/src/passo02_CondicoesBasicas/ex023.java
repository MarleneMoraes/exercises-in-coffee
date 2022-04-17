/*
    Numa promoção exclusiva para o Dia da Mulher, uma loja 
    quer dar descontos para todos, mas especialmente para 
    mulheres. Faça um programa que leia nome, sexo e o 
    valor das compras do cliente e calcule o preço com desconto. 
    Sabendo que:
        - Homens ganham 5% de desconto
        - Mulheres ganham 13% de desconto
 */
package passo02_CondicoesBasicas;

import java.util.Scanner;

public class ex023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char genero;
		float compras;

		System.out.println("PROMOÇÃO DIA DA MULHER");
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.println("Gênero(F/M): ");
		genero = sc.nextLine().charAt(0);

		System.out.println("Valor da compra: ");
		compras = sc.nextFloat();

		if (genero == 'M') {
			compras -= (compras * 0.05);
		} else {
			compras -= (compras * 0.13);
		}

		System.out.printf("Valor total: R$%.2f", compras);

		sc.close();
	}
}
