/*
	Você deve calcular o consumo médio de um automóvel onde será informada a distância 
	total percorrida (em Km) e o total de combustível consumido (em litros).
 */
package desafios.dio;

import java.io.IOException;
import java.util.Scanner;

public class ConsumoMedioDoAutomovel {
	static void consumoMedioDoAutomovel() throws IOException {
		Scanner scan = new Scanner(System.in);

        int distancia = scan.nextInt();
        double totalCombustivel = scan.nextDouble();

        double media =  distancia / totalCombustivel;
        System.out.println(String.format("%.3f km/l", media));   
        
        scan.close();
	}
}
