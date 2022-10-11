package fundamentos.exerciciosfimfundamentos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		double conversao = (fahrenheit - 32) / 1.8;
		
		System.out.print("Valor em Celsius: " + conversao);
		
		entrada.close();
	}
}
