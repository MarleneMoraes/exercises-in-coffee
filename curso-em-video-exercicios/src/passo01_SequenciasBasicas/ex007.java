/*
    Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.
    Ex:
        Digite um número: 3.5
        O dobro de 3.5 é 7.0
        A terça parte de 3.5 é 1.16666
 */
package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float numero, dobro, terco;

		System.out.println("Digite um número: ");
		numero = sc.nextFloat();

		dobro = numero * 2;
		terco = numero / 3;

		System.out.printf("O dobro de %f é %f \n" 
				+ "A terça parte de %f é %f", numero, dobro, numero, terco);
		sc.close();
	}
}
