package controle.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a palavra que deseja separar as letras: ");
		String palavra = entrada.next();
		
		char letras[] = palavra.toCharArray();
		
		for(int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		entrada.close();
	}
}
