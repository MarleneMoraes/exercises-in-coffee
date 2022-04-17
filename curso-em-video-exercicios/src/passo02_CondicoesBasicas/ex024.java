/*
    Faça um algoritmo que pergunte a distância que um passageiro 
    deseja percorrer em Km. Calcule o preço da passagem, cobrando 
    R$0.50 por Km para viagens até 200Km e R$0.45 para viagens 
    mais longas.
*/

package passo02_CondicoesBasicas;

import java.util.Scanner;

public class ex024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float distancia, passagem;

		System.out.println("Preço da passagem");
		System.out.print("Distância percorrida(KM): ");
		distancia = sc.nextFloat();

		if (distancia <= 200) {
			passagem = (float) 0.50 * distancia;
		} else {
			passagem = (float) (distancia * 0.45);
		}

		System.out.printf("Preço da passagem: R$%.2f", passagem);

		sc.close();
	}
}
