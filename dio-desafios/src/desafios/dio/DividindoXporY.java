/*
    Voc� ter� o desafio de escrever um algoritmo que leia 2 n�meros 
    e imprima o resultado da divis�o do primeiro pelo segundo. 
    Caso n�o for poss�vel, mostre a mensagem "divisao impossivel" 
    para os valores em quest�o.
 */
package desafios.dio;

import java.io.IOException;
import java.util.Scanner;

public class DividindoXporY {

    static void dividindoXporY() throws IOException {
        System.out.println("DIVIDINDO X POR Y");
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite quantas vezes ser� executada a tarefa: ");
        int N = scan.nextInt();

        for (int i = 0; i < N; i++) {
            int X = scan.nextInt();
            int Y = scan.nextInt();

            if (Y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double divisao = (double) X / Y;
                System.out.printf("%.1f\n", divisao);
            }
        }
        
        scan.close();
    }
}
