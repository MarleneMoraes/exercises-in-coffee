/*
    Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1, 
    marcando os números que forem divisíveis por 4, exatamente como mostrado 
    abaixo:
    30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...
*/

package passo04_RepeticoesEnquanto;

public class ex043 {
    public static void main(String[] args) {
        int count = 30;
       
        while (count >= 1) {
            if (count%4 == 0){
             System.out.printf("[%d] ", count);   
            } else {
                System.out.printf("%d ", count);
            }

            count--;
        }
        
        System.out.println("Acabou!");
    }
}
