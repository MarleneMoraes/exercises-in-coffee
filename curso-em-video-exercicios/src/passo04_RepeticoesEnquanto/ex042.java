/*
    Faça um algoritmo que pergunte ao usuário um número inteiro 
    e positivo qualquer e mostre uma contagem até esse valor:
    Ex: Digite um valor: 35
    Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
*/

package passo04_RepeticoesEnquanto;

import java.util.Scanner;

public class ex042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        
        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();
        
        while (count <= valor) {
            System.out.printf("%d ", count);
            count++;
        }
        
        System.out.println("Acabou!");
        
        sc.close();
    }
}
