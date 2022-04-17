/*
    Crie um programa que preencha automaticamente (usando lógica, não apenas
    atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
    
        9 8 7 6 5 4 3 2 1 0
        0 1 2 3 4 5 6 7 8 9
 */
package passo08_Vetores;

public class ex073 {

    public static void main(String[] args) {
        int vetor[];
        vetor = new int[10];

        for (int i = 9; i >= 0; i--) {
            vetor[i] = i;
            System.out.printf("%d ", vetor[i]);
        }

        for (int i = 0; i <= 9; i++) {
            vetor[i] = i;

            if (i == 0) {
                System.out.printf("\n%d ", vetor[i]);
            } else {
                System.out.printf("%d ", vetor[i]);
            }
        }
    }
}
