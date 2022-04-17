/*
    [DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de
    agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
    tentativas para tentar acertar.
 */
package passo04_RepeticoesEnquanto;

import java.util.Random;
import java.util.Scanner;

public class ex055 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int count = 0;

		int numero = ran.nextInt(10) + 1;

		System.out.println("MENTALISTA");
		System.out.print("Adivinhe o número que estou pensando (de 1 a 10): ");
		int tentativa = sc.nextInt();

		while (count < 3) {
			if (numero == 0) {
				numero++;
			} else if (numero == tentativa) {
				System.out.println("Você é um mentalista!");
				break;
			} else {
				System.out.println("Não foi desta vez...");
			}

			count++;
			System.out.print("Tente de novo: ");
			tentativa = sc.nextInt();
		}

		sc.close();
	}
}
