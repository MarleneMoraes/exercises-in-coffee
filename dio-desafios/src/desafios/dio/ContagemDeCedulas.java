/*
	Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis 
	(cédulas) onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 
	50, 20, 10, 5, 2 e 1. Na sequência mostre o valor lido e a relação de notas necessárias.
 */
package desafios.dio;

import java.io.IOException;
import java.util.Scanner;

public class ContagemDeCedulas {
	static void contagemDeCedulas() throws IOException {
		Scanner scan = new Scanner(System.in);

        int notasInseridas = scan.nextInt();
        int atual = notasInseridas;
        
        int notas100 = atual / 100;
        atual -= notas100 * 100;
        
        int notas50 = atual / 50;
        atual -= notas50 * 50;
     
        int notas20 = atual / 20;
        atual -= notas20 * 20;
        
        int notas10 = atual / 10;
        atual -=   notas10 * 10;
        
        int notas5 = atual / 5;
        atual -= notas5 * 5;
        
        int notas2 = atual / 2;
        atual -= notas2 * 2;
        
        int notas1 = atual;
        
        System.out.println(notasInseridas);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
        
        scan.close();
	}
}
