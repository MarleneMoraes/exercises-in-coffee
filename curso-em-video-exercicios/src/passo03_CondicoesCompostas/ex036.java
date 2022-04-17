/*
    Um programa de vida saudável quer dar pontos atividades físicas 
    que podem ser trocados por dinheiro. O sistema funciona assim:
        - Cada hora de atividade física no mês vale pontos
            - até 10h de atividade no mês: ganha 2 pontos por hora
            - de 10h até 20h de atividade no mês: ganha 5 pontos por hora
            - acima de 20h de atividade no mês: ganha 10 pontos por hora
        - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
    
    Faça um programa que leia quantas horas de atividade uma pessoa teve por 
    mês, calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu 
    ganhar.
 */
package passo03_CondicoesCompostas;

import java.util.Scanner;

public class ex036 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float dinheiro;
        int pontos, horas;

		System.out.println("PROGRAMA DE PONTOS");
        System.out.print("Horas de atividade: ");
        horas = sc.nextInt();

        if (horas <= 10) {
            pontos = horas * 2;
        } else if (horas <= 20) {
            pontos = horas * 5;
        } else {
            pontos = horas * 10;
        }

        dinheiro = (float) (pontos * 0.05);
        
        System.out.printf("Pontos: %d\nValor: R$%.2f", pontos, dinheiro);
      sc.close();
    }
}
