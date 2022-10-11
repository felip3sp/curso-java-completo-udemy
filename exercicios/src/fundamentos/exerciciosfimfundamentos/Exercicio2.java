package fundamentos.exerciciosfimfundamentos;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();
		
		double conversao = (celsius * 1.8) + 32;
		
		System.out.print("Valor em Fahrenheit: " + conversao);
		
		entrada.close();
	}
}
