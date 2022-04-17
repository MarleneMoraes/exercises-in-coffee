/*
    Escreva um programa que seja capaz de identificar se uma palavra Ã© palÃ­ndromo ou nÃ£o. 
    Uma palavra palÃ­ndromo Ã© a palavra que Ã© possÃ­vel se ler da esquerda para a direita e da direita para esquerda e tem o mesmo significado. Exemplo: ovo, reviver 
*/

package programadeformacao_sabiumsistemas;

import java.util.Scanner;

public class Questao01 {
    String palavra, reverso;
    
    static void questao01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAMA DOS PALÃ�NDROMOS");
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String reverso = new StringBuffer(palavra).reverse().toString();
        if (palavra.equals(reverso)) {
            System.out.printf("A palavra %s Ã© palindromo", palavra);
        } else {
            System.out.printf("A palavra %s nÃ£o Ã© palindromo", palavra);
        }
        
        scanner.close();
    }
}
    
