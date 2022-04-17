/*
	Voc� est� na feira com a sua sacola e parou em uma banca. O feirante lhe 
	entregou piment�es amarelos e vermelhos. Agora iremos somar os pimet�es 
	amarelos e vermelhos para descobrir o total de piment�es na sacola.  Voc�
	receber� 2 inteiros que devem ser lidos e armazenados nas vari�veis A 
	(piment�es amarelos) e B (piment�es vermelhos). Fa�a a soma de A e B 
	atribuindo o seu resultado na vari�vel X (total de piment�es). Apresente X 
	como descrito na mensagem de exemplo abaixo. N�o apresente outra mensagem 
	al�m da mensagem especificada.
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
