package controle.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int maiorValor = 0;
		
		for(int i = 1; i < 11; i++) {
			System.out.printf("Insira o %dº valor: ", i);
			int num = entrada.nextInt();
			
			if(num > maiorValor) {
				maiorValor = num;
			}
		}
		
		System.out.println(maiorValor);
		
		entrada.close();
	}
}
