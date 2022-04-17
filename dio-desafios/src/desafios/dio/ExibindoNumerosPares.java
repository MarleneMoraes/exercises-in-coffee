/*
	Crie um programa que leia um número e mostre os números 
	pares até esse número, inclusive ele mesmo.
*/

package desafios.dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExibindoNumerosPares {
	static void exibindoNumerosPares() throws IOException {
		String entrada;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		entrada = br.readLine();

		if (Integer.parseInt(entrada) >= 0) {
			for (int i = 2; i <= Integer.parseInt(entrada); i += 2) {
				System.out.println(i);
			}
		} 
	}
}
