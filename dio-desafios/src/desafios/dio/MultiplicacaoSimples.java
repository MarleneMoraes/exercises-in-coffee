/*
 	Você receberá dois valores inteiros. Faça a leitura e em seguida calcule 
	o produto entre estes dois valores. Atribua esta operação à variável PROD, 
	mostrando esta de acordo com a mensagem de saída esperada.   
 */

package desafios.dio;

import java.util.Scanner;

public class MultiplicacaoSimples {
	static void multiplicacaoSimples() {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		int product = a * b;

		System.out.println("PROD = " + product);

		scan.close();

	}
}
