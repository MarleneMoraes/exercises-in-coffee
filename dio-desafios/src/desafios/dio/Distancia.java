/*
    Duas motos (X e Y) partem em uma mesma dire��o. A moto X sai com 
    velocidade constante de 60 Km/h e a moto Y sai com velocidade 
    constante de 90 Km/h.
    Em uma hora (60 minutos) a moto Y consegue se distanciar 30 
    quil�metros da moto X, ou seja, consegue se afastar um 
    quil�metro a cada 2 minutos.
    O seu desafio � ler a dist�ncia (em Km) e calcular quanto tempo 
    leva (em minutos) para a moto Y tomar essa dist�ncia da outra moto.
 */
package desafios.dio;
import java.util.Scanner;

public class Distancia {

    static void distancia() {
    	Scanner scan = new Scanner(System.in);

    	System.out.println("DISTANCIA");
        System.out.println("Digite a dist�ncia em Km: ");
        int minutos = scan.nextInt();

        minutos *= 2;

        System.out.printf("%d minutos\n", minutos);
        
        scan.close();
    }
}
