package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Digite algo: ");
			valor = entrada.next();
		}
		
		System.out.println("Até a próxima!");				
		entrada.close();
	}
}
