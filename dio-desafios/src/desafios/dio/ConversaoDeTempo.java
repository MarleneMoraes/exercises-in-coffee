/*
    Você terá o desafio de ler um valor inteiro, que é o tempo 
    de duração em segundos de um determinado evento em uma loja, 
    e informe-o expresso no formato horas:minutos:segundos.
 */
package desafios.dio;

import java.util.Scanner;

public class ConversaoDeTempo {

    static void conversaoDeTempo() {
        System.out.println("CONVERSÃO DE TEMPO");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor em segundos: ");
        int sec = scan.nextInt();

        /*
            1 min = 60 sec
            1 hour = 60 min
            1 hour = 60*60
        */
        int hour = sec/3600;
        sec -= (hour*3600);  


        int min = sec/60;
        sec -= (min*60);  

        System.out.println(hour+":"+min+ ":"+sec);
        
        scan.close();
    }
}
