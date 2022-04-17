/*
    O microblog Twitter é conhecido por limitar as postagens em 140 caracteres. 
    Conferir se um texto vai caber em um tuíte é sua tarefa.
 */

package desafios.dio;

import java.io.IOException;
import java.util.Scanner;

public class Tuitando {

    static void tuitando() throws IOException {
        System.out.println("TUITANDO");
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um texto: ");
        String T = scan.nextLine();

        System.out.println(T.length() > 140 ? "MUTE" : "TWEET");
        
        scan.close();
    }
}
