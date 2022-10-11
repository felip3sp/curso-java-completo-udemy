package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int Num = entrada.nextInt();
		
		if(Num >= 0 && Num <= 10) {
			System.out.printf("O número %d está entre 0 e 10.", Num);			
		} else {
			System.out.printf("O número %d NÃO está entre 0 e 10.", Num);
		}
		
		if(Num % 2 == 0) {
			System.out.print(" E é um numeral par.");
		} else {
			System.out.print(" E é um numeral ímpar.");
		}
		
		entrada.close();
	}
}
