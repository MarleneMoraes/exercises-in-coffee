package programadeformacao_sabiumsistemas;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaDeFormacao_SabiumSistemas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int ex = -1;

        System.out.println("QUESTIONÁRIO SABIUM SISTEMAS PROGRAMA DE FORMAÇÃO JAVA");

        while (ex != 0) {
            System.out.print("Digite o número do exercício (1-5) ou 0 para sair: ");
            ex = scanner.nextInt();

            switch (ex) {
                case 0:
                    break;
                case 1:
                    Questao01.questao01();
                    break;
                case 2:
                    Questao02.questao02();
                    break;
                case 3: 
                    Questao03.questao03();
                    break;
                 case 4:
                    Questao04.questao04();
                    break;
                case 5: 
                    Questao05.questao05();
                    break;
            }
        }
        scanner.close();
    }
}
