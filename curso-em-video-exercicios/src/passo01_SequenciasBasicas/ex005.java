/*
    Fa�a um programa que leia as duas notas de um aluno em uma mat�ria 
    e mostre na tela a sua m�dia na disciplina.
    Ex:
        Nota 1: 4.5
        Nota 2: 8.5
    A m�dia entre 4.5 e 8.5 � igual a 6.5
 */

package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       float nota1, nota2, media;

       System.out.print("Nota 1: ");
       nota1 = sc.nextFloat();

       System.out.print("Nota 2: ");
       nota2 = sc.nextFloat();

       media = (nota1 + nota2)/2;

       System.out.printf("A m�dia entre %.1f e %.1f � igual a %.1f.", nota1, nota2, media);
       
       sc.close();
   }
}
