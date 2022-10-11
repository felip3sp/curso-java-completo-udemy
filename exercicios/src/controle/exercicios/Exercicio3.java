package controle.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota do aluno: ");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Informe a segunda nota do aluno: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7.0) {
			System.out.println("Aprovado.");
		} else if(media < 7.0 || media > 4.0) {
			System.out.println("Recuperação.");
		} else {
			System.out.println("Reprovado.");
		}
		
		entrada.close();
	}
}
