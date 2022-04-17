/*
 	Crie um programa que leia 6 valores, os quais poderão ser negativos e/ou positivos. 
 	Em seguida, apresente a quantidade de valores positivos digitados.
 */

package desafios.dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuantidadeDeNumerosPositivos {
	static void quantidadeDeNumerosPositivos() throws IOException {
		String linha;
	    Double n;
	    int Pos = 0;
	
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       
	       for (int i = 0; i < 6; i++) {
	           linha = br.readLine();
	           n = Double.parseDouble(linha);
	           if(n > 0)Pos++;
	       }
	 
	       System.out.println(Pos + " valores positivos");
	}
}
