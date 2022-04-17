/*
    Um programa de vida saud�vel quer dar pontos atividades f�sicas 
    que podem ser trocados por dinheiro. O sistema funciona assim:
        - Cada hora de atividade f�sica no m�s vale pontos
            - at� 10h de atividade no m�s: ganha 2 pontos por hora
            - de 10h at� 20h de atividade no m�s: ganha 5 pontos por hora
            - acima de 20h de atividade no m�s: ganha 10 pontos por hora
        - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
    
    Fa�a um programa que leia quantas horas de atividade uma pessoa teve por 
    m�s, calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu 
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
