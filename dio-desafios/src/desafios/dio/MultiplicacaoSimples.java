/*
 	Voc� receber� dois valores inteiros. Fa�a a leitura e em seguida calcule 
	o produto entre estes dois valores. Atribua esta opera��o � vari�vel PROD, 
	mostrando esta de acordo com a mensagem de sa�da esperada.   
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
