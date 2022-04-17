/*
	[DESAFIO] Crie um jogo onde o computador vai sortear um n�mero 
	entre 1 e 5 o jogador vai tentar descobrir qual foi o valor sorteado.
 */
package passo03_CondicoesCompostas;

import java.util.Random;
import java.util.Scanner;

public class ex032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int numero, tentativa;

		numero = ran.nextInt(5) + 1;

		System.out.println("MENTALISTA");
		System.out.print("Adivinhe o n�mero que estou pensando (de 1 a 5): ");
		tentativa = sc.nextInt();

		if (numero == 0) {
			numero++;
		} else {
			if (numero == tentativa) {
				System.out.println("Voc� � um mentalista!");
			} else {
				System.out.println("N�o foi desta vez...");
			}
		}

		sc.close();
	}

}
