/*
    Uma empresa de aluguel de carros precisa cobrar pelos seus servi√ßos. O aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
    carro de luxo. Al√©m disso, o cliente paga por Km percorrido. Fa√ßa um programa que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
    quantos Km foram percorridos. No final mostre o pre√ßo a ser pago de acordo com a tabela a seguir:
        - Carros populares (aluguel de R$90 por dia)
            - At√© 100Km percorridos: R$0,20 por Km
            - Acima de 100Km percorridos: R$0,10 por Km
        - Carros de luxo (aluguel de R$150 por dia)
            - At√© 200Km percorridos: R$0,30 por Km
            - Acima de 200Km percorridos: R$0,25 por Km
 */
package passo03_CondicoesCompostas;

import java.util.Scanner;

public class ex035 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tipoCarro;
        float distanciaPercorrida, preco;

        System.out.println("ALUGUEL DE CARROS");
        System.out.print("Tipo de carro (popular / luxo): ");
        tipoCarro = sc.nextLine();

        System.out.print("Dist‚ncia percorrida: ");
        distanciaPercorrida = sc.nextFloat();

        switch (tipoCarro) {
            case "popular":
                if (distanciaPercorrida <= 100) {
                    preco = (float) (90 + (0.2 * distanciaPercorrida));
                    System.out.printf("O valor ser· de R$%.2f", preco);
                } else {
                    preco = (float) (90 + (0.1 * distanciaPercorrida));
                    System.out.printf("O valor ser· de R$%.2f", preco);
                }

                break;

            case "luxo":
                if (distanciaPercorrida <= 100) {
                    preco = (float) (150 + (0.3 * distanciaPercorrida));
                    System.out.printf("O valor ser· de R$%.2f", preco);
                } else {
                    preco = (float) (150 + (0.25 * distanciaPercorrida));
                    System.out.printf("O valor ser· de R$%.2f", preco);
                }

                break;

            default:
                System.out.println("Valor inv·lido. Tente de novo.");

        }
        
        sc.close();
    }

}
