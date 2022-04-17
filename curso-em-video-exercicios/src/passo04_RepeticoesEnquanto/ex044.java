/*
    Crie um algoritmo que leia o valor inicial da contagem, o valor final 
    e o incremento, mostrando em seguida todos os valores no intervalo:
    Ex: Digite o primeiro Valor: 3
        Digite o Ãºltimo Valor: 10
        Digite o incremento: 2
        Contagem: 3 5 7 9 Acabou!
*/

package passo04_RepeticoesEnquanto;

import java.util.Scanner;

public class ex044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Digite o primeiro Valor: ");
        int inicio = sc.nextInt();
        
        System.out.print("Digite o último Valor: ");
        int fim = sc.nextInt();
        
        System.out.print("Digite o incremento: ");
        int i = sc.nextInt();
        
        if (i >= 0 && inicio < fim){
            
            while (inicio <= fim) {
               System.out.printf("%d ", inicio); 
               inicio+=i;
            } 
            
            System.out.println("Acabou!");
            
        } else {
            System.out.println("Não é possível fazer a contagem.");
        }
        
        sc.close();
    }
}
