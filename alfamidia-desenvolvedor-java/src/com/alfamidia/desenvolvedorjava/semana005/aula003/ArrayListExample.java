package com.alfamidia.desenvolvedorjava.semana005.aula003;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// int[] list = new int[10];
		ArrayList<Integer> list = new ArrayList<>();

		// int i = 0;

		while (true) {
			int value = scan.nextInt();
			if (value < 0)	break;
			// list[i++] = value;
			list.add(value);
		}

		for (int j = 0; j < list.size(); j++)
			System.out.println(list.get(j));
		scan.close();
	}
}
