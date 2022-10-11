package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		// if(...) sentenca; ou {}
		// while(...) sentenca; ou {}
		// for(...; ...; ...) sentenca; ou {}
		
		// do sentenca; ou {} while(...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar "
					+ "\nas palavras mágicas...");
			System.out.println("Quer sair? ");
			texto = entrada.next();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();
	}
}
