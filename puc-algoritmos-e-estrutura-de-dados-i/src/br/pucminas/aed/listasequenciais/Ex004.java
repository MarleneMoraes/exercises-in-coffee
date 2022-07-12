package br.pucminas.aed.listasequenciais;

import java.util.Scanner;

public class Ex004 {
	static Scanner sc = new Scanner(System.in);
	
    static void ex004(){    
        int num;
        int[] number = new int[4];
        int[] peso = new int[3];
        double media = 0, novoSalario = 0, area = 0;
        
        //Menu
        System.out.print("Digite o programa que deseja utilizar (a-j): ");
        char option = sc.next().charAt(0);

        
		switch (option) {
            case 'a':
            	//Leia um número e imprima seu sucessor.
            	
                System.out.println("Qual o sucessor?");
                System.out.print("Olá, digite um número para descobrir o seu sucessor: ");
                num = sc.nextInt();
                num++;

                System.out.println("O sucessor é "+ num);

                break;
                
            case 'b':
                // Calcule a média aritmética de quatro números inteiros dados
            	System.out.println("Média aritmética");
                
                for (int i = 0; i < number.length; i++) {
                	if (i == 0)
                		System.out.print("Olá, digite o primeiro número para calcular a média: ");
                	else if (i == number.length -1)
                		System.out.print("Por fim, digite o último número: ");
                	else 
                		 System.out.print("Agora, digite o próximo número: ");
                	
                	number[i] = sc.nextInt();
                	
                	media += number[i];
                }
            

                media /= number.length;

                System.out.printf("A média aritmética é %.2f \n\n", media);
                break;
                
            case 'c':
                // Faça um algoritmo que receba 3 (três) notas e seus respectivos pesos, calcule e mostre a média ponderada dessas notas.
                
            	System.out.println("Média ponderada");
            	
            	for (int i = 0; i < 3; i++) {
                	if (i == 0)
                		System.out.print("Olá, digite o primeiro número para calcular a média: ");
                	else if (i == 2)
                		System.out.print("Por fim, digite o último número: ");
                	else 
                		 System.out.print("Agora, digite o próximo número: ");
                	
                	number[i] = sc.nextInt();
                	
                	System.out.print("Qual o peso desta nota? ");
                    peso[i] = sc.nextInt();
                	
                	media += number[i];
                }
            
                media /= (peso[0] + peso[1] + peso[2]);
            	
         

                System.out.printf("A média ponderada é %.2f \n\n", media);
                break;
                
            case 'd':
                /*
                   Leia uma temperatura dada na escala Celsius (C) e imprima o equivalente em Fahrenheit (F).
                   Fórmula de conversão: F = 9/5*C +32
                   Implemente uma alteração neste exercício para verificar o resultado.
                */

                System.out.println("Calculadora de Temperatura");
                System.out.print("Olá, digite a temperatura em Celsius (ºC) para calcular o Fahrenheit (ºF): ");
                double celsius = sc.nextDouble();

                double fahrenheit = ((9 * celsius) / 5) + 32;

                System.out.printf("Temperatura em Celsius: %.2f\n", celsius);
                System.out.printf("Temperatura em Fahrenheit: %.2f\n\n", fahrenheit);
                break;
                
            case 'e':
                // Faça um algoritmo que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o novo salário.


                System.out.println("Calculadora do promovido");
                System.out.print("Digite o seu salário atual: ");
                double salario = sc.nextDouble();

                System.out.print("Digite o percentual de aumento: ");
                double percentual = sc.nextDouble();

                if (salario < 0 || percentual < 0) 
                    System.out.println("Não é possível calcular o novo salário com um número negativo.");
                else
                    novoSalario = salario + (salario * (percentual / 100));
                    System.out.printf("O seu novo salÃ¡rio serÃ¡ de %.2f.\n\n", novoSalario);
                
                break;
                
            case 'f':
               // Faça um algoritmo que peça ao usuário a base e a altura e calcule a área de um triângulo.

                System.out.println("Área do Triângulo");
                System.out.print("Digite a base do triângulo: ");
                double base = sc.nextFloat();

                System.out.print("Digite a altura do triângulo: ");
                double altura = sc.nextFloat();

                if (base < 0 && altura < 0)
                    System.out.println("Não é possível calcular a área do triângulo com um número negativo.");
                else
                	area = (base * altura) / 2;
                    System.out.printf("A área do triângulo é %.2f.\n\n", area);
                
                break;
                
            case 'g':
                /* 
                    Pedro comprou um saco de Ração com peso em quilos. Pedro possui 2 (dois) gatos para os quais fornece a quantidade de ração em gramas. 
                    Faça um algoritmo que receba o peso do Saco de ração e a quantidade de ração fornecida para cada gato. Calcule e mostre quanto restará 
                    de ração no saco após 5 (cinco) dias.
                */


                System.out.println("Ração dos felinos");
                System.out.print("Digite o peso em kg do saco de Ração: ");
                double racao = sc.nextFloat();

                double racaoEmGramas = racao * 1000; //1 quilo = 1000 gramas

                System.out.print("Digite a quantidade fornecida de Ração para o seu gato (em g): ");
                double racaoGato = sc.nextFloat();

                racaoGato *= (2 * 5); //quantidade de ração fornecida para 2 gatos em 5 dias

                double sobra = racaoEmGramas - racaoGato;

                double sobraEmKg = sobra * 1000; //transformar em kg para a resposta

                System.out.printf("Restará %.2f kg de ração após 5 dias.\n\n", sobraEmKg);
                break;
                
            case 'h':
                //Ler dois números inteiros para as variáveis a e b. Trocar o valor de b com o de a, e imprimi-los.

                System.out.println("Trocando Valores de Variáveis");
                for (int i = 0; i == 1; i++) {
                	System.out.printf("Digite o valor do %dº número: ", (++i));
                	number[i] = sc.nextInt();
          
                }
            
                int c = number[0]; //Variável de armazenamento temporário para a troca ser realizada

                System.out.printf("a = %i\nb = %i\n\n", number[0], number[1]);

                number[0] = number[1];
                number[1] = c;

                System.out.printf("a = %i\nb = %i\n\n", number[0], number[1]);
                break;
                
            case 'i':
               //Leia um número e imprima o resto da divisão por 7. Utilize o comando resto (a,b) na linguagem C (a%b).

                System.out.println("Resto da divisão por 7");
                System.out.print("Digite um número: ");
                int numero = sc.nextInt();

                int resto = numero % 7;

                System.out.printf("O resto da divisão por 7 é %i\n\n", resto);
                break;
                
            case 'j':
                 /* 
                    Calcular a soma dos termos de uma P.A. lendo os valores do primeiro termo, do segundo termo e do número de termos. 
                    Fórmulas: Sn=n*(a1+an)/2, onde Sn é a soma dos termos, a1 o primeiro termo e an o último termo. 
                    O n-ésimo termo de uma progressão aritmética, pode ser obtido por meio da formula: an=a1+(n1).r, onde r é a razão da P.A.
                 */

                System.out.println("Cáculo de soma dos termos de uma P.A.");
                System.out.print("Digite o primeiro termo: ");
                int a1 = sc.nextInt();

                System.out.print("Digite o segundo termo: ");
                int a2 = sc.nextInt();

                //Fórmula para descobrir a razão
                int r = a2 - a1;

                System.out.print("Digite o valor do número de termos: ");
                int n = sc.nextInt();

                //Fórmula para descobrir o enÃ©simo termo
                int an = a1 + ((n - 1) * r);

                //Fórmula da Soma da P.A.
                int sn = (n * (a1 + an)) / 2;

                System.out.printf("A soma desta P.A. é %i\n\n", sn);
                break;
                
            default:
                System.out.println("ERRO. Tente novamente.");
        }
        
        
        sc.close();
    }
}


