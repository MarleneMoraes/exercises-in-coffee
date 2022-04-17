package com.alfamidia.desenvolvedorjava.semana005.aula003;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// int[] list = new int[10];
		List<Integer> list = new LinkedList<>();

		while (true) {
			int value = scan.nextInt();
			if (value < 0)	break;
			list.add(value);
		}

		for (int j = 0; j < list.size(); j++)
			System.out.println(list.get(j));
		
		scan.close();

	}

}
