package desafios.dio;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumeros {
	static void analiseDeNumeros() throws IOException {
		Scanner scan = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        int n;

        for (int i = 0; i < 5; i++) {
        	n = scan.nextInt();
        	
        	if(n % 2 == 0) par++;
        	if(n % 2 != 0) impar++;
        	if(n > 0) positivo++;
        	if(n < 0) negativo++;
        }

        System.out.println(par + " par(es)");
        System.out.println(impar + " impar(es)");
        System.out.println(positivo + " positivo(s)");
        System.out.println(negativo + " negativo(s)");
        
        scan.close();
	}
}
