/*
    Faça um programa que leia a largura e o comprimento de um terreno retangular, 
    calculando e mostrando a sua área em mÂ². O programa também deve mostrar a 
    classificação desse terreno, de acordo com a lista abaixo:
        - Abaixo de 100m² = TERRENO POPULAR
        - Entre 100m² e 500m² = TERRENO MASTER
        - Acima de 500m² = TERRENO VIP
 */
package passo03_CondicoesCompostas;

import java.util.Scanner;

public class ex028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float area, largura, comprimento;

		System.out.println("CLASSIFICAÇÃO DO TERRENO");
		System.out.print("Largura: ");
		largura = sc.nextFloat();

		System.out.print("Comprimento: ");
		comprimento = sc.nextFloat();

		area = largura * comprimento;

		if (area < 100) {
			System.out.println("TERRENO POPULAR");
		} else if (area <= 500) {
			System.out.println("TERRENO MASTER");
		} else {
			System.out.println("TERRENO VIP");
		}

		sc.close();
	}
}
