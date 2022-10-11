package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double media = 0;
		int contador = 0;
		
		while(nota != -1) {
		System.out.print("Informe a nota (ou -1 p/ sair): ");
		nota = entrada.nextDouble();
		
		if(nota <= 10 && nota >= 0) {
			media = media + nota;
			contador++;
		} else if (nota != -1) {
			System.out.println("Nota inválida!");
		} else	{		
			System.out.println("Calculando...");
				}
		}
		
		double mediaFinal = media / contador;		
		
		System.out.printf("Média: %.2f", mediaFinal);		
		entrada.close();
	}
}
