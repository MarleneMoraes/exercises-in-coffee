/*
    Crie um programa que tenha um procedimento Gerador() que, quando chamado,
    mostre a mensagem "Olá, Mundo!" com algum componente visual (linhas)
    
    Ex: Ao chamar Gerador() aparece:
        +-------=======------+
            Olá, Mundo!
        +-------=======------+
 */
package passo09_Procedimentos;

public class ex086 {

	static void gerador() {
		System.out.println("+-------=======------+");
		System.out.println("      Olá Mundo!      ");
		System.out.println("+-------=======------+");
	}

	public static void main(String[] args) {

		gerador();
	}
}
