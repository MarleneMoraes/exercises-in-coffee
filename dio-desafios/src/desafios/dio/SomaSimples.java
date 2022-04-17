/*
    Leia dois valores inteiros identificados como vari�veis A e B. 
    Calcule a soma entre elas e chame essa vari�vel de SOMA.
    A seguir escreva o valor desta vari�vel.
 */

package desafios.dio;
import java.util.Scanner;

public class SomaSimples {

    static void somaSimples() {
        System.out.println("SOMA SIMPLES");
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        int b = sc.nextInt();

        int soma = a + b;

        System.out.printf("SOMA = %d", soma);

        sc.close();
    }
}
