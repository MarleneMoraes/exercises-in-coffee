/*
    Fa�a um algoritmo que leia a largura e altura de uma parede, 
    calcule e mostre a �rea a ser pintada e a quantidade de tinta 
    necess�ria para o servi�o, sabendo que cada litro de tinta 
    pinta uma �rea de 2 metros quadrados.
*/

package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float largura, altura, area;
        int tinta;
        
        System.out.println("Largura da parede: ");
        largura = sc.nextFloat();
        
        System.out.println("Altura da parede: ");
        altura = sc.nextFloat();
        
        area = largura * altura;
        
        tinta = (int) (area / 2);
        
        System.out.printf("Ser� necess�rio %d tintas para pintar a parede.", tinta);
        
        sc.close();
    }
}
