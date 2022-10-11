package controle.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {		
		
		int contador = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número que deseja saber se é primo ou não: ");
		int Num = entrada.nextInt();
		
		for(int i = 2; i < Num; i++) {
			if(Num % i == 0) {
				contador++;
			}
		} 
		
		switch(contador) {
			case 0:
				System.out.println("O número é primo.");
				break;
			default:				
				System.out.println("O número não é primo.");
		}
		
		entrada.close();
	}
}
