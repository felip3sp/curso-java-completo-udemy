package controle.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		int num = 0;
		int soma = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		while(num >= 0) {
			
			System.out.print("Insira um número inteiro para somar ou negativo para sair: ");
			num = entrada.nextInt();
			
			if(num >= 0) soma = soma + num;
		}
		
		System.out.printf("A soma de todos os números digitados é: " + soma);
		
		entrada.close();
	}
}
