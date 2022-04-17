/*
    Voc� ter� o desafio de ler um valor inteiro, que � o tempo 
    de dura��o em segundos de um determinado evento em uma loja, 
    e informe-o expresso no formato horas:minutos:segundos.
 */
package desafios.dio;

import java.util.Scanner;

public class ConversaoDeTempo {

    static void conversaoDeTempo() {
        System.out.println("CONVERS�O DE TEMPO");
        
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
