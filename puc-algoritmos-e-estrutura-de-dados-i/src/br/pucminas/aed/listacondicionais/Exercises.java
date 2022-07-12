package br.pucminas.aed.listacondicionais;

import java.util.Scanner;

public class Exercises {
	static Scanner sc = new Scanner(System.in);

	public static String ex001() {
		/*
		 * Fazer um algoritmo que leia um numero inteiro e mostre uma mensagem indicando
		 * se este numero e par ou impar.
		 */
		int numero;

		System.out.println("Par Ou Ímpar?");
		System.out.println("Olá! Vamos conferir se o primeiro número é par ou ímpar. Digite um número: ");
		numero = sc.nextInt();

		if (numero % 2 == 0)
			return "O número é par.";
		else
			return "O número é ímpar.";

	}

	public static void ex002() {
		/*
		 * Fazer um algoritmo peça o nome e as 3 notas de um aluno e mostre, além do
		 * nome e do valor da media do aluno, uma mensagem de "Aprovado", caso a media
		 * seja igual ou superior a 6, ou a mensagem "reprovado", caso contrario.
		 */
		String nome;
		double[] nota = new double[3];
		double media = 0;

		System.out.println("Boletim Escolar");
		System.out.print("Digite o nome do aluno: ");
		nome = sc.nextLine();

		for (int i = 0; i < nota.length; i++) {
			System.out.printf("Digite a %dª nota: ", (i + 1));
			nota[i] = sc.nextDouble();

			media += nota[i];
		}

		media /= nota.length;

		if (media >= 6)
			System.out.printf("%s está APROVADO", nome);
		else
			System.out.printf("%s está REPROVADO", nome);

	}

	public static String ex003() {
		/*
		 * Fazer um algoritmo que leia a temperatura da água e mostre se está no estado
		 * sólido, líquido ou gasoso.
		 */

		System.out.println("Estado da água");
		System.out.print("Digite uma temperatura em celsius: ");
		double temperatura = sc.nextDouble();

		if (temperatura <= 0)
			return "A água está no estado sólido.";
		else if (temperatura > 0 || temperatura <= 100)
			return "A água está no estado líquido.";
		else
			return "A água está no estado gasoso.";

	}

	public static void ex004() {
		/*
		 * Leia um valor X e se ele for menor que 0 avalie Y = x2+ 4. Se ele for maior
		 * que 0 avalie x3-3 e se ele for igual a 0 de uma mensagem de erro.
		 */
		double Y;

		System.out.print("Olá! Digite um número: ");
		double numero = sc.nextFloat();

		if (numero < 0) {
			Y = (Math.pow(numero, 2)) + 4; // Y = x2+ 4
			System.out.printf("%f", Y);
		} else if (numero > 0) {
			Y = (Math.pow(numero, 3)) - 3; // Y = x3-3
			System.out.printf("%f", Y);
		} else {
			System.out.println("ERRO: Tente novamente");
		}

	}

	public static void ex005() {
		/*
		 * Construa um algoritmo que receba como entrada três valores (A, B e C). Após o
		 * processamento o menor valor deverá estar em A e o maior valor em C, e o valor
		 * intermediário em B. Imprima A, B e C.
		 */
		System.out.println("Menor, maior e intermediário");
		int[] value = new int[3];

		for (int i = 0; i < value.length; i++) {
			System.out.printf("Digite o %dº valor: ", (i + 1));
			value[i] = sc.nextInt();
		}

		int intermediario = 0;
		int maior = 0;
		int menor = 0;

		if (value[0] > value[1]) {
			if (value[0] > value[2]) {
				value[0] = maior;

				if (value[1] > value[2]) {
					value[1] = intermediario;
					value[2] = menor;
				} else {
					value[1] = menor;
					value[2] = intermediario;
				}
			} else {
				value[0] = intermediario;
				value[1] = menor;
			}
		}

		menor = value[0];
		intermediario = value[1];
		maior = value[2];

		System.out.printf("A = %i\nB = %i\nC = %i", value[0], value[1], value[2]);
	}

	public static String ex006() {
		/*
		 * Desenvolver um algoritmo que leia três números inteiros: X, Y, Z e verifique
		 * se o número X é divisível por Y e por Z. O algoritmo deverá mostrar as
		 * possíveis mensagens: 
		 * - O número é divisível por Y e Z. 
		 * - O número é divisível por Y mas não por Z. 
		 * - O número é divisível por Z mas não por Y. 
		 * - O número não é divisível nem Y nem por Z.
		 */
		int[] value = new int[3];

		System.out.println("Divisível ou não?");

		for (int i = 0; i < value.length; i++) {
			if (i == 0)
				System.out.println("Digite o valor X: ");
			else if (i == 1)
				System.out.print("Digite o valor de Y: ");
			else
				System.out.print("Digite o valor de Z: ");

			value[i] = sc.nextInt();
		}

		if (value[0] % value[1] == 0 && value[0] % value[2] == 0)
			return "O número é divisível por Y e Z.";
		else if (value[0] % value[1] == 0 && value[0] % value[2] != 0)
			return "O número é divisível por Y mas não por Z.";
		else if (value[0] % value[1] != 0 && value[0] % value[2] == 0)
			return "O número é divisível por Z mas não por Y.";
		else
			return "O número não é divisível nem Y nem por Z.";
	}
	
	
	public static void ex007() {
		/*
		 * O numero 3025 possui a seguinte característica: 30 + 25 = 55 55²= 3025 Fazer
		 * um algoritmo que dado um numero de 4 dígitos (verifique se o número pertence
		 * a faixa) calcule e escreva se ele possui ou não esta característica.
		 */
        String numero;
        int soma;
        
        System.out.print("Digite um valor: ");
        numero = sc.nextLine();
    }
	
	
	public static String ex008() {
		/*
		 * Ler um código do teclado e mostrar o nome correspondente, de acordo com a
		 * lista: 
		 * 	221 Bernardo 
		 * 	211 Eustáquio 
		 * 	311 Luiz 
		 * 	312 Mário 
		 * 	332 Artur
		 */
        System.out.print("Olá! Digite um número: ");
        int codigo = sc.nextInt();

		if (codigo == 221)
			return "Bernardo";
		else if (codigo == 211)
			return "Eustáquio";
		else if (codigo == 311)
			return "Luiz";
		else if (codigo == 312)
			return "Mário";
		else if (codigo == 332)
			return "Eustáquio";
		else
			return "ERRO: Tente novamente";
    }
	
	
	public static String ex009() {
		/*
		 * Números palíndromos são aqueles que escritos da direita para esquerda ou da
		 * esquerda para direita tem o mesmo valor. Exemplo: 929, 44, 97379. Fazer um
		 * algoritmo que dado um numero de 5 dígitos; calcule e escreva se este e ou não
		 * palíndromo.
		 */
       int [] number = new int[5];
       int value, A = 0, inverse = 0;

       System.out.println("Insira um número: ");
       value = sc.nextInt();
       
       int n = 10000;
       
       for (int i = 0; i < number.length; i++) { 
    	   if (i == 0) { 
    		   number[i] = value/n;
    		   A = value % n;
    	   } else {
    		   number[i] = A / n;
    	   }
    	   
    
    	   if (n==10)
    		   n = 10;
    	   else 
    		   n /= 10;
       }
       
       for (int i = number.length-1; i == 0; i--) {
    	   inverse += (number[i] * n);
    	   
    	   if (n==10)
    		   n = 1;
    	   else 
    		   n /= 10;
       }

        if (value == inverse)
            return "Este número é palíndromo";
        else
            return "Este número não é palíndromo";

    }
	
	public static void ex010() {
		/*
		 * Desenvolver um algoritmo para calcular a conta de água para a SANEAGO. O
		 * custo da água varia dependendo do tipo do consumidor residencial, comercial
		 * ou industrial. A regra para calcular a conta é:
		 * 
		 * • Residencial: R$ 75,00 de taxa mais R$ 3,50 por m3 gastos; 
		 * • Comercial: R$ 500,00 para os primeiros 80 m3 gastos mais R$ 5,50 por m3 
		 * gastos acima dos 80m3; 
		 * • Industrial: R$ 800,00 para os primeiros 100 m3 gastos mas R$ 8,00 por m3 
		 * gastos acima dos 100 m3;
		 * 
		 * O algoritmo devera ler a conta do cliente, seu tipo (residencial, comercial e
		 * industrial) e o seu consumo de água em metros cubos. Como resultado imprimir
		 * o valor a ser pago pelo mesmo.
		 */
        double taxa, custo, gasto;
        
        System.out.println("Conta de Água SENEAGO");
        System.out.print("Tipo de Consumidor (residencial, comercial ou industrial): ");
        String consumidor = sc.nextLine();

        if (consumidor == "residencial") {
            System.out.print("Gastos em m³: ");
            gasto = sc.nextDouble();

            taxa = 75.00;

            custo = taxa + (gasto * 3.5);

            System.out.printf("Valor a ser pago: R$%d", custo);
        } else if (consumidor == "comercial") {
            System.out.print("Gastos em m³: ");
            gasto = sc.nextDouble();

            taxa = 500.00;

            if (gasto > 80) {
                custo = taxa + ((gasto - 80) * 5.5);
            } else {
                custo = taxa;
            }

            System.out.printf("Valor a ser pago: R$%d", custo);
        } else if (consumidor == "industrial") {
			System.out.print("Gastos em m³: ");
			gasto = sc.nextDouble();

			taxa = 800.00;

			if (gasto > 100)
				custo = taxa + ((gasto - 100) * 8);
			else
				custo = taxa;

            System.out.printf("Valor a ser pago: R$%d", custo);
        }
	}
}
