/*
    O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura 
    e no peso de uma pessoa. De acordo com o valor do IMC, podemos classificar 
    o indivíduo dentro de certas faixas.
        - abaixo de 18.5: Abaixo do peso
        - entre 18.5 e 25: Peso ideal
        - entre 25 e 30: Sobrepeso
        - entre 30 e 40: Obesidade
        - acima de 40: Obseidade mórbida
        
    Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado da altura)
 */
package passo03_CondicoesCompostas;

import java.util.Scanner;

public class ex034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float peso, altura, imc;

		System.out.println("Cálculo IMC");
		System.out.print("Peso: ");
		peso = sc.nextFloat();

		System.out.print("Altura: ");
		altura = sc.nextFloat();

		imc = (float) (peso / Math.pow(altura, 2));

		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc <= 25) {
			System.out.println("Peso Ideal");
		} else if (imc <= 30) {
			System.out.println("Sobrepeso");
		} else if (imc <= 40) {
			System.out.println("Obesidade");
		} else if (imc > 40) {
			System.out.println("Obseidade mórbida");
		}

		sc.close();
	}
}
