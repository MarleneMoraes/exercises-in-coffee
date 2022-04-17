/*
    Crie um algoritmo que leia o nome e as duas notas de um aluno, 
    calcule a sua m�dia e mostre na tela. No final, analise a 
    m�dia e mostre se o aluno teve ou n�o um bom aproveitamento 
    (se ficou acima da m�dia 7.0).
 */
package passo02_CondicoesBasicas;

import java.util.Scanner;

public class ex019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        float nota1, nota2, media;

        System.out.print("Nome do aluno(a): ");
        nome = sc.nextLine();
        
        System.out.print("Nota 1� semestre: ");
        nota1 = sc.nextFloat();
        
        System.out.print("Nota 2� semestre: ");
        nota2 = sc.nextFloat();
        
        media = (nota1 + nota2) / 2;
        
        if (media >= 7){
            System.out.printf("%s teve bom aproveitamento "
            		+ "\nM�dia: %.2f", nome, media);
        } else {
            System.out.printf("%s não teve bom aproveitamento"
            		+ "\nM�dia: %.2f", nome, media);
        }
        
        sc.close();
    }
}
