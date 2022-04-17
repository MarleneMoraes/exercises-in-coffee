package desafios.dio;

import java.io.IOException;
import java.util.Scanner;

public class DesafiosDIO {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("DESAFIOS DIO.ME");
        System.out.println("1 - Conversão de Tempo");
        System.out.println("2 - DDD");
        System.out.println("3 - Tuitando");
        System.out.println("4 - Distancia");
        System.out.println("5 - Dividindo X por Y");
        System.out.println("6 - Soma Simples");
        System.out.println("7 - Multiplicação Simples");
        System.out.println("8 - Visita Na Feira");
        System.out.println("9 - Folha de Pagamento");
        System.out.println("10 - Quantidade de Números Positivos");
        System.out.println("11 - Exibindo Números Pares");
        System.out.println("12 - Análise de Números");
        System.out.println("13 - Contagem de Cédulas");
        System.out.println("14 - Consumo Médio do Automóvel");
        
        System.out.print("Digite o valor do desafio desejado: ");
        byte desafio = scanner.nextByte();
        
        switch (desafio){
            case 1: 
                ConversaoDeTempo.conversaoDeTempo();
                break;
            case 2: 
                DDD.ddd();
                break;
            case 3: 
                Tuitando.tuitando();
                break;
            case 4: 
                Distancia.distancia();
                break;
            case 5: 
                DividindoXporY.dividindoXporY();
                break;
            case 6: 
                SomaSimples.somaSimples();
                break;
            case 7: 
                MultiplicacaoSimples.multiplicacaoSimples();
                break;
            case 8: 
                VisitaNaFeira.visitaNaFeira();
                break;
            case 9: 
                FolhaDePagamento.folhaDePagamento();
                break;
            case 10: 
                QuantidadeDeNumerosPositivos.quantidadeDeNumerosPositivos();
                break;
            case 11: 
                ExibindoNumerosPares.exibindoNumerosPares();
                break;
            case 12: 
                AnaliseDeNumeros.analiseDeNumeros();
                break;
            case 13: 
                ContagemDeCedulas.contagemDeCedulas();
                break;
            case 14: 
                ConsumoMedioDoAutomovel.consumoMedioDoAutomovel();
                break;
            default:
                
            scanner.close();    
        }
        
    }
    
}
