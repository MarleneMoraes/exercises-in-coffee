/*
    Escreva um programa que leia todos os caracteres de um arquivo texto 
    e imprima em ordem crescente as percentagens das ocorrências das letras 
    encontradas. 
   	Os caracteres que não são letras devem ser ignorados.
    Exemplo de texto contido em arquivo txt
        "Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
        Etiam eget ligula eu lectus lobortis condimentum. Aliquam nonummy 
        auctor massa. Pellentesque habitant morbi tristique senectus et 
        netus et malesuada fames ac turpis egestas. Nulla at risus. Quisque 
        purus magna, auctor et, sagittis ac, posuere eu, lectus. Nam mattis, 
        felis ut adipiscing."
        
        Resultado
        Total de letras: 283
        
        Percentuais:
        "a" = 9,54%
        "b" = 1,06%
        "c" = 4,24%
        ...
        "z" = 0,00% 
*/

package programadeformacao_sabiumsistemas;

import java.util.Scanner;

public class Questao05 {
    static void questao05() {
        Scanner sc = new Scanner (System.in);
        
        int quantidadeTotal = 0;
        float percentual = 0;
        
        System.out.println("Contagem de caracteres");
        System.out.print("Digite uma frase ou texto: ");
        String string = sc.nextLine();
         
        for (char i = 'a'; i <= 'z'; i++) {
            int quantidadeLetras = 0;
            char aux;
            
            if (i == 'a'){
               for (int j=0; j < string.length(); j++) {
                    aux = string.charAt(j);
                    quantidadeTotal++;  
               }
                System.out.printf("Total de letras: %d\n", quantidadeTotal);
                System.out.println("Percentuais:");
            } 
            for (int k = 0; k < string.length(); k++){
               aux = string.charAt(k);
               if (aux == i){
                quantidadeLetras++;    
               }
            }
            
            percentual = ((100*quantidadeLetras)/quantidadeTotal);
            
            System.out.printf("\n\"%c\" = %.1f%% \n", i, percentual);
        }

        sc.close();
    }
}
