/*
	[DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
 */
package passo03_CondicoesCompostas;

import java.util.Scanner;

public class ex031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String escolhaJogador1, nomeJogador1, escolhaJogador2, nomeJogador2;

		System.out.println("JOGO PEDRA-PAPEL-TESOURA");
		System.out.print("Jogador 1: ");
		nomeJogador1 = sc.nextLine();

		System.out.printf("%s, você escolhe pedra, papel ou tesoura?\n", nomeJogador1);
		escolhaJogador1 = sc.nextLine();

		System.out.print("Jogador 2: ");
		nomeJogador2 = sc.nextLine();

		System.out.printf("%s, você escolhe pedra, papel ou tesoura?\n", nomeJogador2);
		escolhaJogador2 = sc.nextLine();

		if (escolhaJogador1 == "pedra") {
			if (escolhaJogador2 == "pedra") {
				System.out.println("EMPATE");
			} else if (escolhaJogador2 == "papel") {
				System.out.printf("%s VENCEU!", nomeJogador2);
			} else if (escolhaJogador2 == "tesoura") {
				System.out.printf("%s VENCEU!", nomeJogador1);
			} else {
				System.out.println("ERRO. Tente novamente.");
			}
		} else if (escolhaJogador1 == "papel") {
			if (escolhaJogador2 == "pedra") {
				System.out.printf("%s VENCEU!", nomeJogador1);
			} else if (escolhaJogador2 == "papel") {
				System.out.println("EMPATE");
			} else if (escolhaJogador2 == "tesoura") {
				System.out.printf("%s VENCEU!", nomeJogador2);
			} else {
				System.out.println("ERRO. Tente novamente.");
			}
		} else {
			if (escolhaJogador2 == "pedra") {
				System.out.printf("%s VENCEU!", nomeJogador2);
			} else if (escolhaJogador2 == "papel") {
				System.out.printf("%s VENCEU!", nomeJogador1);
			} else if (escolhaJogador2 == "tesoura") {
				System.out.println("EMPATE");
			} else {
				System.out.println("ERRO. Tente novamente.");
			}
		}

		sc.close();
	}
}
