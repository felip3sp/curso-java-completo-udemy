package controle.exercicios;

import java.util.Scanner;

public class Exercicio4 {

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
		
		if(contador == 0) {
			System.out.printf("O número %d é primo.", Num);
		} else {
			System.out.printf("O número %d não é primo.", Num);
		}
		
		entrada.close();
	}
}
