/*
    Crie um programa que leia a idade de 8 pessoas e guarde-as em um 
    vetor. No final, mostre:
        a) Qual é a média de idade das pessoas cadastradas
        b) Em quais posições temos pessoas com mais de 25 anos
        c) Qual foi a maior idade digitada (podem haver repetições)
        d) Em que posições digitamos a maior idade
*/
package passo08_Vetores;

import java.util.Scanner;

public class ex081 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[];
        vetor = new int[8];
        
        int maisVinteCinco = 0;
        int maiorIdade = 0;
        int posicaomaiorIdade = 0;
        float mediaCadastro = 0;
        
        for (int i = 0; i <= 8; i++){
            System.out.print("Digite a idade: ");
            vetor[i] = scanner.nextInt();
            
            if (vetor[i] > 25){
                for (i = 0; i <= 8; i++){
                    maisVinteCinco++;
                }
            }
            
            if(vetor[i] > maiorIdade){
                maiorIdade = vetor[i];
                posicaomaiorIdade++;
            }
            
            mediaCadastro += vetor[i];
        }
        
        mediaCadastro /= 8;
        
        System.out.printf("Média de pessoas cadastradas: %f\n", mediaCadastro);
        System.out.print("Posições com mais de 25 anos: ");  
        
        for (int i = 0; i <= 8; i++){
          if (vetor[i] > 25){
            System.out.print(i + " "); 
          }  
        }
        
        System.out.printf("\nMaior idade digitada: %d\n", maiorIdade);
        
        System.out.print("Posições digitamos a maior idade: ");
        
        for (int i = 0; i <= 8; i++){
          if (vetor[i] == maiorIdade){
            System.out.print(i + " "); 
          }  
        }
       
        scanner.close();
    }
}
