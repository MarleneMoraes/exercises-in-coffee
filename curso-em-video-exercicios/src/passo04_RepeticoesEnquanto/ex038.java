/*
    Escreva um programa que mostre na tela a seguinte contagem:
    6 7 8 9 10 11 Acabou!
 */
package passo04_RepeticoesEnquanto;

public class ex038 {
    public static void main(String[] args) {
        int count = 6;
        
        while (count <= 11){
            System.out.printf("%d ", count);
            count++;
        }
        
        System.out.print("Acabou!");
    }
}
