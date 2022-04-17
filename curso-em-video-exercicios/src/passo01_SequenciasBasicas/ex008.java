/*
    Desenvolva um programa que leia uma dist�ncia em metros 
    e mostre os valores relativos em outras medidas.
    
    Ex:
        Digite uma dist�ncia em metros: 185.72
        A dist�ncia de 185.7m corresponde a:
            0.18572Km
            1.8572Hm
            18.572Dam
            1857.2dm
            18572.0cm
            185720.0mm
 */
package passo01_SequenciasBasicas;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double m, km, hm, dam, dm, cm, mm;
        
        System.out.print("Digite uma dist�ncia em metros: ");
        m = sc.nextDouble();
        
        km = m * 1000;
        hm = m * 100;
        dam = m * 10;
        dm  = m / 10;
        cm = m / 100;
        mm = m / 1000;
        
        System.out.println("A dist�ncia de " + m 
        		+ "m corresponde a: \n" + km + "Km \n" 
        		+ hm + "Hm \n" + dam + "Dam \n" + dm 
        		+ "dm \n" + cm + "cm \n" + mm + "mm");
        
        sc.close();
    }
}
