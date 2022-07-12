package br.pucminas.aed.listasequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int ex;

        System.out.println("EXERCÍCIOS SEQUENCIAIS AED I EM JAVA");

        do {
            System.out.print("Digite o número do exercício (4 ou 5): ");
            ex = sc.nextInt();

            if (ex == 4) {
                Ex004.ex004();
            } else if (ex == 5) {
                Ex005.ex005();
            } 
        } while (ex != 0);   

        sc.close();
    }
}

