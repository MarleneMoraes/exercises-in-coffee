/*
    Crie um algoritmo que leia um n�mero real e mostre na tela o seu dobro e a sua ter�a parte.
    Ex:
        Digite um n�mero: 3.5
        O dobro de 3.5 � 7.0
        A ter�a parte de 3.5 � 1.16666
 */
package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float numero, dobro, terco;

		System.out.println("Digite um n�mero: ");
		numero = sc.nextFloat();

		dobro = numero * 2;
		terco = numero / 3;

		System.out.printf("O dobro de %f � %f \n" 
				+ "A ter�a parte de %f � %f", numero, dobro, numero, terco);
		sc.close();
	}
}
