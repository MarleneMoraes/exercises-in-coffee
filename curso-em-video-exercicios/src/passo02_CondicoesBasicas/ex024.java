/*
    Fa�a um algoritmo que pergunte a dist�ncia que um passageiro 
    deseja percorrer em Km. Calcule o pre�o da passagem, cobrando 
    R$0.50 por Km para viagens at� 200Km e R$0.45 para viagens 
    mais longas.
*/

package passo02_CondicoesBasicas;

import java.util.Scanner;

public class ex024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float distancia, passagem;

		System.out.println("Pre�o da passagem");
		System.out.print("Dist�ncia percorrida(KM): ");
		distancia = sc.nextFloat();

		if (distancia <= 200) {
			passagem = (float) 0.50 * distancia;
		} else {
			passagem = (float) (distancia * 0.45);
		}

		System.out.printf("Pre�o da passagem: R$%.2f", passagem);

		sc.close();
	}
}
