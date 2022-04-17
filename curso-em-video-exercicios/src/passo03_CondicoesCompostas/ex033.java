/*
    Escreva um programa para aprovar ou não o empréstimo bancário 
    para a compra de uma casa. O programa vai perguntar o valor da 
    casa, o salário do comprador e em quantos anos ele vai pagar. 
    Calcule o valor da prestação mensal, sabendo que ela não pode 
    exceder 30% do salário ou então o empréstimo será negado.
 */
package passo03_CondicoesCompostas;

import java.util.Scanner;

public class ex033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valorCasa, salarioComprador, prestacao, porcentagem;
        int tempoPagamento;
        
        System.out.println("EMPRÉSTIMO BANCÁRIO");
        System.out.println("Aprovação do empréstimo bancário");
        System.out.print("Valor do imóvel: ");
        valorCasa = sc.nextFloat();
        
        System.out.print("Salário do comprador: ");
        salarioComprador = sc.nextFloat();
        
        System.out.print("Tempo de pagamento (em anos): ");
        tempoPagamento = sc.nextInt();
        
        tempoPagamento *= 12; //reverte anos para meses
        
        prestacao = valorCasa / tempoPagamento;
        
        porcentagem = (float) (salarioComprador * 0.3);  
        
        if (prestacao > porcentagem){
            System.out.println("Não é possível realizar o empréstimo.");
        } else {
            System.out.println("Parabéns! Você pode fazer o empréstimo.");
        }
                
        sc.close();
    }
    
}
