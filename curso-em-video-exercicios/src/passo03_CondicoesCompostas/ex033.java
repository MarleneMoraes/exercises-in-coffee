/*
    Escreva um programa para aprovar ou n�o o empr�stimo banc�rio 
    para a compra de uma casa. O programa vai perguntar o valor da 
    casa, o sal�rio do comprador e em quantos anos ele vai pagar. 
    Calcule o valor da presta��o mensal, sabendo que ela n�o pode 
    exceder 30% do sal�rio ou ent�o o empr�stimo ser� negado.
 */
package passo03_CondicoesCompostas;

import java.util.Scanner;

public class ex033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valorCasa, salarioComprador, prestacao, porcentagem;
        int tempoPagamento;
        
        System.out.println("EMPR�STIMO BANC�RIO");
        System.out.println("Aprova��o do empr�stimo banc�rio");
        System.out.print("Valor do im�vel: ");
        valorCasa = sc.nextFloat();
        
        System.out.print("Sal�rio do comprador: ");
        salarioComprador = sc.nextFloat();
        
        System.out.print("Tempo de pagamento (em anos): ");
        tempoPagamento = sc.nextInt();
        
        tempoPagamento *= 12; //reverte anos para meses
        
        prestacao = valorCasa / tempoPagamento;
        
        porcentagem = (float) (salarioComprador * 0.3);  
        
        if (prestacao > porcentagem){
            System.out.println("N�o � poss�vel realizar o empr�stimo.");
        } else {
            System.out.println("Parab�ns! Voc� pode fazer o empr�stimo.");
        }
                
        sc.close();
    }
    
}
