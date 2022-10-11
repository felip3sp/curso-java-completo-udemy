package fundamentos.exerciciosfimfundamentos;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Temos a equação ax2 + bx + c = 0");
		System.out.print("Digite o valor de a: ");
		double numA = entrada.nextInt();
		System.out.print("Digite o valor de b: ");
		double numB = entrada.nextInt();
		System.out.print("Digite o valor de c: ");
		double numC = entrada.nextInt();
		
		double delta = Math.pow(numB, 2) - (4 * numA * numC);
		
		System.out.printf("Para a equação %.0fx2 + %.0fx + %.0f = 0,"
				+ " temos o valor %.0f como delta", numA, numB, numC, delta);
		
		double x1 = (-numB + Math.sqrt(delta)) / (2 * numA);
		double x2 = (-numB - Math.sqrt(delta)) / (2 * numA);
		
		System.out.printf("\nO valor de x' é %.2f e de x'' é %.2f", x1, x2);
		
		entrada.close();
	}
}
