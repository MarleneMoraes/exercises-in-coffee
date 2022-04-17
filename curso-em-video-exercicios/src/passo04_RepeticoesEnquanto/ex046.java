/*
	Crie um programa que calcule e mostre na tela o resultado da soma 
	entre 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.
 */

package passo04_RepeticoesEnquanto;
public class ex046 {
	public static void main(String[] args) {
        int sum = 0;
        int count = 6;
        
        while (count <= 100){
            sum += count;
            count += 2;
        }
        
        System.out.printf("A soma dos valores pares entre 6 e 100 é %d\n", sum);
    }
    
}
