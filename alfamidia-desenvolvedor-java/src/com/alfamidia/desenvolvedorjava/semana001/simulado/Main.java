/**
 * @author Marlene Moraes
 * @since 13 Feb 2022
 */


package com.alfamidia.desenvolvedorjava.semana001.simulado;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("SIMULADO");
		
		questao001();
		questao002(false, false, false);
		questao003(3, 5);
		questao004();
		questao005();
		
		scan.close();

	}

	static void questao001() {
		/*
		 * Questão 1/5 Considerando que todas as variáveis utilizadas estão
		 * inicializadas com 0, qual o valor de x no final da execução do código abaixo?
		 * x = a + b + 1; x++; x+= x; a = x; x = a + b;
		 */
		int x = 0, a = 0, b = 0;

		x = a + b + 1;
		x++;
		x += x;
		a = x;
		x = a + b;
		System.out.println(x);
	}

	static void questao002(boolean x, boolean y, boolean z) {
		/*
		 * Considerando o código a seguir: if (x) { if (y) { System.out.println(1); }
		 * else if (z) { System.out.println(1); } } else { System.out.println(1); }
		 * 
		 * Podemos dizer que, das afirmações abaixo: 
		 * i. Se z for verdadeiro, o alerta sempre é exibido, independente de x e y. 
		 * ii. Dependendo dos valores de x, y e z, o alerta pode ser exibido duas vezes. 
		 * iii. x verdadeiro, y e z falsos, é a única situação em que o alerta não é exibido.
		 */

		if (x) {
			if (y) {
				System.out.println(1);
			} else if (z) {
				System.out.println(1);
			}
		} else {
			System.out.println(1);
		}
	}
	
	
	public static boolean questao003(int x,int y) {/*
	 * Observando o método a seguir e as frases abaixo, podemos afirmar que: 
	 * public static boolean f(int x,int y) { 
	 * 		if (x==0) return true; 
	 * 		if (y==1) return false; 
	 * 		return (x>y); 
	 * } 
	 * i. sempre que x é 0 a função retorna verdadeiro 
	 * ii. sempre que y é 1 a função retorna falso 
	 * iii. sempre que x é maior que y a função retorna verdadeiro
	 */ 
		if (x==0) return true; 
		if (y==1) return false; 
		return (x>y); 
	} 


	static void questao004() {
		/*
		 * Observando o código abaixo, indique a opção que tem um código equivalente:
		 * 
		 * for( int i = 0; i < a.length; i++ ) { 
		 * 		System.out.println(a[i]); 
		 * }
		 */
		int[] a = new int[1000];
		
		int i = 0;
		while (i < a.length) {
			System.out.println(a[i]);
			i++;
		}
	}

	static void questao005() {
		/*
		 * for(int i = 0; i < dados.length; i++) { 
		 * 		if (i > 0) { 
		 * 			if (dados[i] < dados[i-1]) { 
		 * 				continue; 
		 * 			} 
		 * 		} 
		 * 		
		 * 		System.out.println(dados[i]); 
		 * }
		 */
		
		int[] dados = new int[1000];
		
		for(int i = 0; i < dados.length; i++) {
			if (i > 0) {
				if (dados[i] < dados[i-1]) {
					continue; 
			 	}
			}

			System.out.println(dados[i]);
		}
	}
}
