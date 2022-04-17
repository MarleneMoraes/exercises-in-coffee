/*
    Escreva um programa que pergunte a velocidade de um carro. 
    Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o 
    usuário foi multado. Nesse caso, exiba o valor da multa, 
    cobrando R$5 por cada Km acima da velocidade permitida.
 */
package passo02_CondicoesBasicas;

import java.util.Scanner;

public class ex017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float velocidade, multa;

		System.out.println("Qual a velocidade do carro?");
		velocidade = sc.nextFloat();

		if (velocidade > 80) {
			multa = (velocidade - 80) * 5;
			System.out.printf("Você ultrapassou, e sua multa foi de R$%.2f", multa);
		}

		sc.close();
	}
}
