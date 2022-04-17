/*
    Uma empresa precisa reajustar o sal�rio dos seus funcion�rios, 
    dando um aumento de acordo com alguns fatores. Fa�a um programa 
    que leia o sal�rio atual, o g�nero do funcion�rio e h� quantos 
    anos esse funcion�rio trabalha na empresa. No final, mostre o 
    seu novo sal�rio, baseado na tabela a seguir:
    - Mulheres
        - menos de 15 anos de empresa: +5%
        - de 15 at� 20 anos de empresa: +12%
        - mais de 20 anos de empresa: +23%
    - Homens
        - menos de 20 anos de empresa: +3%
        - de 20 at� 30 anos de empresa: +13%
        - mais de 30 anos de empresa: +25%
 */
package passo03_CondicoesCompostas;

import java.util.Scanner;

public class ex037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char genero;
		float salario;
		int anos;

		System.out.println("G�nero (F/M): ");
		genero = sc.next().charAt(0);

		System.out.print("Sal�rio atual: ");
		salario = sc.nextFloat();

		System.out.print("Tempo de casa: ");
		anos = sc.nextInt();

		switch (genero) {
		case 'F':
			if (anos < 15) {
				salario += (salario * 0.05);
			} else if (anos <= 20) {
				salario += (salario * 0.12);
			} else {
				salario += (salario * 0.23);
			}
			break;
		case 'M':
			if (anos < 20) {
				salario += (salario * 0.03);
			} else if (anos <= 30) {
				salario += (salario * 0.13);
			} else {
				salario += (salario * 0.25);
			}
			break;
		}

		System.out.printf("Voc� receber� R$%.2f");
		sc.close();
	}

}
