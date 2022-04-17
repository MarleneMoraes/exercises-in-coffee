/*
	Você está na feira com a sua sacola e parou em uma banca. O feirante lhe 
	entregou pimentões amarelos e vermelhos. Agora iremos somar os pimetões 
	amarelos e vermelhos para descobrir o total de pimentões na sacola.  Você
	receberá 2 inteiros que devem ser lidos e armazenados nas variáveis A 
	(pimentões amarelos) e B (pimentões vermelhos). Faça a soma de A e B 
	atribuindo o seu resultado na variável X (total de pimentões). Apresente X 
	como descrito na mensagem de exemplo abaixo. Não apresente outra mensagem 
	além da mensagem especificada.
*/

package desafios.dio;

import java.util.Scanner;

public class VisitaNaFeira {
	static void visitaNaFeira() {
		System.out.println("VISITA NA FEIRA");

		Scanner scan = new Scanner(System.in);
	   
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    
	    int soma = a + b;
	    
	    System.out.println("X = " + soma);
	    
	    scan.close();
	}
}
