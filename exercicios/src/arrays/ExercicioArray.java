package arrays;

import java.util.Scanner;

public class ExercicioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); // Lê a partir de uma linha de comando
		System.out.print("Quantas notas deseja informar: "); // Imprimindo mensagem
		int qtdNotas = entrada.nextInt(); // Armazenando a entrada de um dado tipo inteiro
		
		double[] notas = new double[qtdNotas]; // Declarando um array
		
		for (int i = 0; i < notas.length; i++) { // Usando o laço for para percorrer todo o array
			System.out.print("Digite a nota " + (i + 1) + ": "); // Imprimindo mensagem
			notas[i] = entrada.nextDouble(); // Armazenando a entrada de dado no array
		}
		double soma = 0;
		for(double nota: notas) { // Usando o laço foreach para perecorrer todo o array
			soma += nota; // Somando todas as notas
		}
		
		double media = soma / notas.length; // Tirando a media das notas
		
		System.out.printf("A media das %d notas é: %.2f", notas.length, media); // Imprimindo mensagem
		
		entrada.close(); // Encerra o programa
	}
}
