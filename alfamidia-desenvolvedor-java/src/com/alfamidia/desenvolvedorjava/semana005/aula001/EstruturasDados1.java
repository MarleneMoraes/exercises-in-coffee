package com.alfamidia.desenvolvedorjava.semana005.aula001;

import java.util.Scanner;

public class EstruturasDados1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] list = new int[5]; //tamanho fixo
		int i = 0;

		while (true) {
			int value = scan.nextInt();
			if (value < 0)
				break;
			list[i++] = value;
		}

		for (int j = 0; j < 1; j++)
			System.out.println(list[j]);
		scan.close();
	}

}
