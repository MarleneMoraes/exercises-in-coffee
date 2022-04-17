/*
	Desenvolva um aplicativo que mostre na tela o resultado da 
	expressão 500 + 450 + 400 + 350 + 300 + ... + 50 + 0
 */

package passo04_RepeticoesEnquanto;

public class ex047 {
   public static void main(String[] args) {
        int sum = 0;
        int count = 500;
        
        while (count >= 0){
            sum += count;
            count -= 50;
        }
        
        System.out.printf("A soma dos valores é %d\n", sum);
    }
     
}
