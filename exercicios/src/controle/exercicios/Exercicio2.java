package controle.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o ano que deseja saber se é bissexto ou não: ");
		int age = entrada.nextInt();
		
		if(age % 4 == 0) {
			System.out.printf("O ano %d é um ano bissexto.", age);
		} else {
			System.out.printf("O ano %d NÃO é um ano bissexto.", age);
		}
		
		entrada.close();
	}
}
