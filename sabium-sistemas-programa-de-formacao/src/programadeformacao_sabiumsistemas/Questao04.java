/*
    Dado o seguinte algoritmo:
    
    inicio
    ler a, b, c
    se (a < b + c) e (b < a + c) e (c < a + b) entao
        se (a = b) e (b=c) entao
            mens 'Triângulo Equilátero'
        senao
           se (a=b) ou (b = c) ou (a = c) entao
                mens 'Triângulo Isósceles'
            senao
                mens 'Triângulo Escaleno'
            fim_se
        fim_se
    senao
        mens 'Não e possível formar um triângulo'
    fimSe
    escrever mens
    fim

    FaÃ§a um teste de mesa. 
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

		System.out.println("TESTE DE MESA: TRIÂNGULO");

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
				return "Triângulo Equilátero";
			} else if ((a == b) || (b == c) || (a == c)) {
				return "Triângulo Isósceles";
			} else {
				return "Triângulo Escaleno";
			}
		} else {
			return "Não é possível formar um triângulo";
		}
	}
}

/*
 * Resultados: TESTE DE MESA: TRIÂNGULO 
 * 1ª Não é possível formar um triângulo 
 * 2ª Triângulo Escaleno 
 * 3ª Não é possível formar um triângulo
 * 4ª Triângulo Equilátero 
 * 5ª Triângulo Isósceles
 */
