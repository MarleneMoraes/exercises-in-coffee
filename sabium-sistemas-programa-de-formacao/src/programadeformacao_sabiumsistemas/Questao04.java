/*
    Dado o seguinte algoritmo:
    
    inicio
    ler a, b, c
    se (a < b + c) e (b < a + c) e (c < a + b) entao
        se (a = b) e (b=c) entao
            mens 'Tri�ngulo Equil�tero'
        senao
           se (a=b) ou (b = c) ou (a = c) entao
                mens 'Tri�ngulo Is�sceles'
            senao
                mens 'Tri�ngulo Escaleno'
            fim_se
        fim_se
    senao
        mens 'N�o e poss�vel formar um tri�ngulo'
    fimSe
    escrever mens
    fim

    Faça um teste de mesa. 
*/

package programadeformacao_sabiumsistemas;

import java.util.Scanner;

public class Questao04 {

	int a, b, c;

	static void questao04() {
		Scanner scanner = new Scanner(System.in);
		int ladoA[], ladoB[], ladoC[];

		ladoA = new int[6];
		ladoB = new int[6];
		ladoC = new int[6];

		System.out.println("TESTE DE MESA: TRI�NGULO");

		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o primeiro valor: ");
			ladoA[i] = scanner.nextInt();

			System.out.print("Digite o segundo valor: ");
			ladoB[i] = scanner.nextInt();

			System.out.print("Digite o terceiro valor: ");
			ladoC[i] = scanner.nextInt();

			System.out.println(triangulo(ladoA[i], ladoB[i], ladoC[i]));
		}

		scanner.close();
	}

	static String triangulo(int a, int b, int c) {
		if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) {
			if ((a == b) && (b == c)) {
				return "Tri�ngulo Equil�tero";
			} else if ((a == b) || (b == c) || (a == c)) {
				return "Tri�ngulo Is�sceles";
			} else {
				return "Tri�ngulo Escaleno";
			}
		} else {
			return "N�o � poss�vel formar um tri�ngulo";
		}
	}
}

/*
 * Resultados: TESTE DE MESA: TRI�NGULO 
 * 1� N�o � poss�vel formar um tri�ngulo 
 * 2� Tri�ngulo Escaleno 
 * 3� N�o � poss�vel formar um tri�ngulo
 * 4� Tri�ngulo Equil�tero 
 * 5� Tri�ngulo Is�sceles
 */
