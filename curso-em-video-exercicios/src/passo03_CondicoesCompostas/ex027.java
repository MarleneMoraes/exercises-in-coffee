/*
    Crie um programa que leia duas notas de um aluno e calcule a sua média,
    mostrando uma mensagem no final, de acordo com a média atingida:
        - Média atÃ© 4.9: REPROVADO
        - Média entre 5.0 e 6.9: RECUPERAÇÃO
        - Média 7.0 ou superior: APROVADO
 */
package passo03_CondicoesCompostas;

import java.util.Scanner;

public class ex027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float nota1, nota2, media;

		System.out.print("Nota 1: ");
		nota1 = sc.nextInt();

		System.out.print("Nota 2: ");
		nota2 = sc.nextInt();

		media = (nota1 + nota2) / 2;

		if (media <= 4.9) {
			System.out.println("REPROVADO");
		} else if (media >= 5 || media <= 6.9) {
			System.out.println("RECUPERAÇÃO");
		} else {
			System.out.println("APROVADO");
		}

		sc.close();
	}

}
