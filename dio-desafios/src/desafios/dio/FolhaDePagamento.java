package desafios.dio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FolhaDePagamento {
	static void folhaDePagamento() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int numeroColaborador = Integer.parseInt(st.nextToken());

	    st = new StringTokenizer(br.readLine());
	    int horasTrabalhadas = Integer.parseInt(st.nextToken());
	    
	    st = new StringTokenizer(br.readLine());
	    double valorHora = Double.parseDouble(st.nextToken());
	    
	    double salario = horasTrabalhadas * valorHora;
	   
	    System.out.println("NUMBER = " + numeroColaborador);
	    System.out.printf("SALARY = U$ %.2f", salario);
	    
	}

}
