/*
    Crie um programa que tenha um procedimento Gerador() que, quando chamado,
    mostre a mensagem "Ol�, Mundo!" com algum componente visual (linhas)
    
    Ex: Ao chamar Gerador() aparece:
        +-------=======------+
            Ol�, Mundo!
        +-------=======------+
 */
package passo09_Procedimentos;

public class ex086 {

	static void gerador() {
		System.out.println("+-------=======------+");
		System.out.println("      Ol� Mundo!      ");
		System.out.println("+-------=======------+");
	}

	public static void main(String[] args) {

		gerador();
	}
}
