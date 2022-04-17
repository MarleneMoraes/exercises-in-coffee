/*
    Uma classe de anagramas é um conjunto de palavras com as 
    mesmas letras, mas por outra ordem.
    Exemplo: caras, casar e sacar são anagramas, fio e foi 
    formam outra classe.
    Escreva um programa que exiba todas as classes de 
    anagramas e suas palavras a partir da leitura de um 
    arquivo texto.
		
 */
package programadeformacao_sabiumsistemas;

import java.util.Scanner;

public class Questao03 {

    public static void questao03() {
        Scanner scanner = new Scanner(System.in);

        String palavra = "";
        char letras[];
        letras = new char[palavra.length()];

        while (palavra.length() <= 2) {
            System.out.print("Digite uma palavra: ");
            palavra = scanner.nextLine();

            if (palavra.length() > 2) {
                System.out.println("Calculando Anagrama...");
            } else {
                System.out.println("Digite uma palavra de no minimo 3 caracteres");
            }
        }

        for (int i = 0; i < letras.length; i++) {
            letras[i] = palavra.charAt(i);
        }

        CalcularAnagrama(letras, 0);
        
        scanner.close();
    }

    private static void CalcularAnagrama(char vetor[], int k) {
        int i;
        if (k == vetor.length - 1) {
            for (i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println("");
        } else {
            CalcularAnagrama(vetor, k + 1);
            i = k + 1;
            while (i < vetor.length) {
                TrocarPosicao(vetor, k, i);
                CalcularAnagrama(vetor, k + 1);
                TrocarPosicao(vetor, k, i);
                i = i + 1;
            }
        }
    }


    private static void TrocarPosicao(char[] vetor, int k, int i) {
        char aux;
        aux = vetor[i];
        vetor[i] = vetor[k];
        vetor[k] = aux;
    }

}
