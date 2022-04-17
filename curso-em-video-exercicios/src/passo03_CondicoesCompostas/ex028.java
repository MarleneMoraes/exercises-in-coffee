/*
    Fa�a um programa que leia a largura e o comprimento de um terreno retangular, 
    calculando e mostrando a sua �rea em m². O programa tamb�m deve mostrar a 
    classifica��o desse terreno, de acordo com a lista abaixo:
        - Abaixo de 100m� = TERRENO POPULAR
        - Entre 100m� e 500m� = TERRENO MASTER
        - Acima de 500m� = TERRENO VIP
 */
package passo03_CondicoesCompostas;

import java.util.Scanner;

public class ex028 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float area, largura, comprimento;

		System.out.println("CLASSIFICA��O DO TERRENO");
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
