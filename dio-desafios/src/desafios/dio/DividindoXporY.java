/*
    Você terá o desafio de escrever um algoritmo que leia 2 números 
    e imprima o resultado da divisão do primeiro pelo segundo. 
    Caso não for possível, mostre a mensagem "divisao impossivel" 
    para os valores em questão.
 */
package desafios.dio;

import java.io.IOException;
import java.util.Scanner;

public class DividindoXporY {

    static void dividindoXporY() throws IOException {
        System.out.println("DIVIDINDO X POR Y");
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite quantas vezes será executada a tarefa: ");
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
