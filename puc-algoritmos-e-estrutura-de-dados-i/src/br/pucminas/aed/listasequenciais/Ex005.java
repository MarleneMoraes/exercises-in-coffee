//Bateria de exercicios nomeados por 5.01 em diante. Foi utilizado um switch case para impressão na tela executados com interação com o usuário.

package br.pucminas.aed.listasequenciais;

import java.util.Scanner;

public class Ex005 {
    
    static void ex005(){
        Scanner sc = new Scanner(System.in);
        int num, option;
        int[] number = new int[3];
        char[] letter = new char[3];
        char alfaUpper = 0;

        System.out.println("Exercício 5");

        do {
            System.out.print("Digite a subdivisão desejada (1 a 15)\nou 0 para sair: ");
            option = sc.nextInt();

            switch (option) {
                case 0:
                    break;

                case 1:
                    // Ler um valor inteiro do teclado e dizer se é par

                    System.out.println("Este Número é Par?");
                    System.out.println("Olá! Vamos conferir se o número digitado é par.");
                    System.out.print("Digite um número: ");
                    num = sc.nextInt();

                    if (num % 2 == 0)
                        System.out.println("O número é par.");
                    else 
                        System.out.println("O número não é par.");
                    
                    break;

                case 2:
                    // Ler um valor inteiro do teclado e dizer se é ímpar

                    System.out.println("Este Número é ímpar?");
                    System.out.println("Olá! Vamos conferir se o número digitado é ímpar.");
                    System.out.print("Digite um número: ");
                    num = sc.nextInt();

                    if (num % 2 != 0) 
                        System.out.println("O número é ímpar.");
                    else 
                        System.out.println("O número não é ímpar.");
                    
                    break;

                case 3:
                    // Ler um valor inteiro do teclado e dizer se ímpar e maior que 100

                    System.out.println("Este Número é ímpar maior que 100?");
                    System.out.println("Olá! Vamos conferir se o número digitado é ímpar e maior que 100.");
                    System.out.print("Digite um número: ");
                    num = sc.nextInt();

                    if (num % 2 != 0 && num > 100)
                        System.out.println("O número é ímpar e maior que 100.");
                    else
                        System.out.println("O número não é ímpar.");
                    
                    break;

                case 4:
                    // Ler um valor inteiro do teclado e dizer se é par e menor que 100, ou ímpar e maior que 100.

                    System.out.println("Este Número é par menor que 100 ou ímpar maior que 100?");
                    System.out.println("Olá! Vamos conferir se o número digitado é par e menor que 100, ou ímpar e maior que 100.");
                    System.out.print("Digite um número: ");
                    num = sc.nextInt();

                    if (num % 2 == 0 && num < 100)
                        System.out.println("O número é par e menor que 100.");
                    else if (num % 2 != 0 && num > 100)
                        System.out.println("O número é ímpar e maior que 100.");
                    else 
                        System.out.println("O número não atende nenhuma das características desejadas.");
                    
                    break;

                case 5:
                    // Ler um valor inteiro do teclado e dizer se pertence ao intervalo aberto entre (25:75).

                    System.out.println("Pertence Ou Não Pertence?");
                    System.out.println("Olá! Vamos conferir se o número pertence ao intervalo aberto entre (25:75).");
                    System.out.print("Digite um número: ");
                    num = sc.nextInt();

                    if (num > 25 && num < 75)
                        System.out.println("O número pertence ao intervalo.");
                    else
                        System.out.println("O número não pertence ao intervalo.");
                    
                    break;

                case 6:
                    // Ler um valor inteiro do teclado e dizer se pertence ao intervalo fechado entre [25:75].

                    System.out.println("Pertence Ou Não Pertence?");
                    System.out.println("Olá! Vamos conferir se o número pertence ao intervalo fechado entre [25:75].");
                    System.out.print("Digite um número: ");
                    num = sc.nextInt();

                    if (num >= 25 && num <= 75)
                        System.out.println("O número pertence ao intervalo.");
                    else 
                        System.out.println("O número não pertence ao intervalo.");
                    
                    break;

                case 7:
                    // Ler um valor inteiro do teclado e dizer se pertence aos intervalos fechados [15:45] ou [66:99].

                    System.out.println("Pertence Ou Não Pertence?");
                    System.out.println("Olá! Vamos conferir se o número pertence aos intervalos fechados [15:45] ou [66:99].");
                    System.out.print("Digite um número: ");
                    num = sc.nextInt();

                    if ((num >= 15 && num <= 45) || (num >= 66 && num <= 99))
                        System.out.println("O número pertence ao intervalo.");
                    else
                        System.out.println("O número não pertence ao intervalo.");
                    
                    break;

                case 8:
                    // Ler dois valores inteiros do teclado e dizer se o primeiro é par e o segundo é ímpar.

                    System.out.println("Primeiro Par e o Segundo Ímpar?");
                    System.out.println("Olá! Vamos conferir se o primeiro número é par e o segundo é ímpar.");
                    
                    for (int i = 0; i < 2; i++) {
                    	System.out.printf("Digite o %dº número: ", i);
                    	number[i] = sc.nextInt();
                    }
                    
                    if ((number[0] % 2 == 0) && (number[1] % 2 != 0))
                        System.out.println("O primeiro é par e o segundo ímpar.");
                    else 
                        System.out.println("Os números não atende às condições apresentadas.");
                    
                    break;

                case 9:
                    // Ler dois valores inteiros do teclado e dizer se o primeiro é par e positivo, e o segundo é ímpar e negativo.

                    System.out.println("Primeiro Par e o Segundo Ímpar?");
                    System.out.println("Olá! Vamos conferir se o primeiro número é par e positivo e o segundo é ímpar e negativo. ");
                    
                    for (int i = 0; i < 2; i++) {
                    	System.out.printf("Digite o %dº número: ", i);
                    	number[i] = sc.nextInt();
                    }

                    if (((number[0] % 2 == 0) && (number[0]  > 0)) && ((number[1]  % 2 != 0) && (number[1]  < 0)))
                        System.out.println("O primeiro é par e positivo e o segundo ímpar negativo.");
                    else
                        System.out.println("Os números não atende às condições apresentadas.");
                    
                    break;

                case 10:
                    // Ler dois valores reais do teclado e dizer se o primeiro é maior, menor ou igual ao segundo.

                    System.out.println("Maior, Menor ou Igual?");
                    System.out.println("Olá! Vamos conferir se o primeiro número é maior, menor ou igual ao segundo.");
                    
                    for (int i = 0; i < 2; i++) {
                    	System.out.printf("Digite o %dº número: ", i);
                    	number[i] = sc.nextInt();
                    }

                    if (number[0] > number[1]) 
                        System.out.println("O primeiro número é maior.");
                    else if (number[0] < number[1])
                        System.out.println("O segundo número é maior.");
                    else
                        System.out.println("Os números são iguais.");
                    
                    break;

                case 11:
                    // Ler três valores reais do teclado e dizer se o primeiro está entre os outros dois

                    System.out.println("Pertence ou não pertence?");
                    System.out.println("Olá! Vamos conferir se o primeiro número pertence ao intervalo entre os outros dois.");
                    
                    for (int i = 0; i < number.length; i++) {
                    	System.out.printf("Digite o %dº número: ", i);
                    	number[i] = sc.nextInt();
                    }

                    if (((number[0] >= number[1]) && (number[0] <= number[2])) 
                    		|| ((number[0] >= number[2]) && (number[0] <= number[1]))) 
                        System.out.println("O número pertence ao intervalo entre os outros dois.");
                    else
                        System.out.println("O número não atende aos requisitos.");
                    
                    break;

                case 12:
                    // Ler três valores reais do teclado e dizer se o primeiro não está entre os outros dois

                    System.out.println("Pertence ou não pertence?");
                    System.out.println("Olá! Vamos conferir se o primeiro número não pertence ao intervalo entre os outros dois.");
                    
                    for (int i = 0; i < number.length; i++) {
                    	System.out.printf("Digite o %dº número: ", i);
                    	number[i] = sc.nextInt();
                    }

                    if (((number[0] >= number[1]) && (number[0] <= number[2])) 
                    		|| ((number[0] >= number[2]) && (number[0] <= number[1])))
                        System.out.println("O número não pertence ao intervalo entre os outros dois.");
                    else 
                        System.out.println("O número não atende aos requisitos.");
                    
                    break;

                case 13:
                    // Ler três valores literais (caracteres) do teclado e dizer se o primeiro está entre os outros dois    

                    System.out.println("ABC?");
                    System.out.println("Olá! Vamos conferir se a primeira letra pertence ao intervalo entre as outras duas.");
                    
                    for (int i = 0; i < letter.length; i++) {
                    	System.out.printf("Digite o %dª letra: ", i);
                    	letter[i] = sc.nextLine().charAt(0);
                    }
               

                    if (((letter[0] > letter[1]) && (letter[0] < letter[2])) 
                    		|| ((letter[0] > letter[2]) && (letter[0] < letter[1])))
                        System.out.println("A primeira letra está entre as duas!");
                    else
                        System.out.println("A primeira letra não está entre as duas");
                    
                    break;

                case 14:
                    // Ler três valores literais (caracteres) do teclado e dizer se estão em ordem crescente lexicograficamente.

                    System.out.println("ABC?");
                    System.out.println("Olá! Vamos colocar as letra em ordem crescente lexicograficamente.");
                    
                    for (int i = 0; i < letter.length; i++) {
                    	System.out.printf("Digite o %dª letra: ", i);
                    	letter[i] = sc.nextLine().charAt(0);
                    }

                    if ((letter[0] > letter[1] && letter[0] < letter[2]) 
                    		|| (letter[0] > letter[2] && letter[0] < letter[1]))
                        System.out.println("As letras estão em ordem crescente.");
                    else
                        System.out.println("As letras não estão em ordem crescente.");
                    
                    break;
                    
                case 15:
                    // Ler um valor literal (caractere) do teclado e dizer se é uma letra maiúscula.

                    System.out.println("ABC?");
                    System.out.println("Olá! Vamos conferir se é uma letra maiúscula.");
                    System.out.print("Digite a letra: ");
                    letter[0] = sc.nextLine().charAt(0);
                  
                    //alfaUpper = alfa.toUpperCase();

                    if (letter[0] == alfaUpper)
                        System.out.println("A letra é maiúscula.");
                    else
                        System.out.println("A letra é minúscula.");
                    
                    break;
                    
                default:
                    System.out.println("Opção não encontrada. Tente novamente.");
            }
        } while (option != 0);
        
        sc.close();
    }
}
