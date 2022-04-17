/*
    Uma matriz quadrada inteira � um "quadrado m�gico" se a soma 
    dos elementos de cada linha, a soma dos elementos de cada coluna 
    e a soma dos elementos das diagonais principal e secund�ria s�o 
    todas iguais. Fa�a um algoritmo que recebe uma dimens�o N de uma 
    matriz Anxn, seguido dos respectivos valores da matriz, verificar 
    se A � um quadrado m�gico (escrevendo "quadrado m�gico" caso seja 
    e "quadrado n�o-m�gico" caso n�o seja).
 */
package programadeformacao_sabiumsistemas;

import java.util.Scanner;

public class Questao02 {

    static void questao02() {
        try (Scanner scanner = new Scanner(System.in)) {
			int i, j;
			int matriz[][] = new int[3][3];

			/*
			    for (i =0;i<3;i++){
			        for (j=0;j<3;j++){
			            System.out.println("Qual o valor de "+(i+1)+"X"+(j+1)+"?");
			            matriz[i][j] = e.nextInt();
			        }
			    }
			*/
			
			matriz[0][0] = 2;
			matriz[0][1] = 9;
			matriz[0][2] = 4;
			matriz[1][0] = 7;
			matriz[1][1] = 5;
			matriz[1][2] = 3;
			matriz[2][0] = 6;
			matriz[2][1] = 1;
			matriz[2][2] = 8;

			boolean quadradoMagico = true;
			int primeiraLinha = 0;
			int primeiraColuna = 0;

			for (i = 0; i < 3; i++) {
			    int totalLinha = 0;
			    int totalColuna = 0;
			    for (j = 0; j < 3; j++) {
			        if (i == 0) {
			            primeiraLinha += matriz[i][j];
			            primeiraColuna += matriz[j][i];
			        }
			        totalLinha += matriz[i][j];
			        totalColuna += matriz[j][i];
			    }
			    if (totalLinha != primeiraLinha || totalLinha != totalColuna 
			    		|| totalColuna != primeiraColuna || primeiraColuna != primeiraLinha) {
			        quadradoMagico = false;
			    }
			}
			if (quadradoMagico) {
			    System.out.println("� um quadrado m�gico");
			} else {
			    System.out.println("N�o � um quadrado m�gico");
			}
			
			scanner.close();
		}
    }
}
