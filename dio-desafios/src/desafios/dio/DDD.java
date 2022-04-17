/*
    Leia um número inteiro que representa um código de DDD para discagem interurbana. 
    Em seguida, informe é  qual cidade o DDD pertence, considerando a tabela abaixo:

        DDD          Destination
        61              BrasÃ­lia
        71              Salvador
        11              SÃ£o Paulo
        21              Rio de Janeiro
        32              Juiz de Fora
        19              Campinas
        27              Vitoria
        31              Belo Horizonte

    Se a entrada for qualquer outro DDD que nÃ£o esteja presente na tabela acima, o programa deverÃ¡ informar: DDD nao cadastrado
 */

package desafios.dio;

import java.util.Scanner;

public class DDD {
	static void ddd() {
		System.out.println("DDD");

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o DDD desejado: ");
		int a = scan.nextInt();

		switch (a) {
		case 61:
			System.out.printf("Brasilia\n");
			break;
		case 71:
			System.out.printf("Salvador\n");
			break;
		case 11:
			System.out.printf("Sao Paulo\n");
			break;
		case 21:
			System.out.printf("Rio de Janeiro\n");
			break;
		case 32:
			System.out.printf("Juiz de Fora\n");
			break;
		case 19:
			System.out.printf("Campinas\n");
			break;
		case 27:
			System.out.printf("Vitoria\n");
			break;
		case 31:
			System.out.printf("Belo Horizonte\n");
			break;
		default:
			System.out.printf("DDD nao cadastrado\n");
			break;
		}

		scan.close();

	}
}
