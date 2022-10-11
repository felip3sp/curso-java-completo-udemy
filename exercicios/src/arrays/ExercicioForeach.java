package arrays;

import java.util.Arrays;

public class ExercicioForeach {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4]; // declarando um array de 3 dados
		System.out.println(Arrays.toString(notasAlunoA)); // imprimindo o array usando o ToString para mostrar
		
		notasAlunoA[0] = 7.9; // declarando valores
		notasAlunoA[1] = 8; // declarando valores
		notasAlunoA[2] = 6.7; // declarando valores
		notasAlunoA[3] = 9.7; // declarando valores
		
		System.out.println(Arrays.toString(notasAlunoA)); // imprimindo o array usando o ToString para mostrar
		System.out.println(notasAlunoA[0]); // imprimindo o primeiro valor do array
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); // imprimindo o ultimo valor do array
		
		double totalAlunoA = 0; // inicializando a variavel
		for(double nota: notasAlunoA) { // usando o laço foreach para percorrer todo o array						
			totalAlunoA += nota; // somatória de todas as notas
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length); // imprimindo a média das notas
		
		final double notaArmazenada = 5.9; // constante declarada
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10}; // declarando um array com valores
		
		double totalAlunoB = 0; // inicializando a variavel
		for (double nota: notasAlunoB) { // usando o laço foreach para percorrer todo o array
			totalAlunoB += nota; // somatória de todas as notas
		}
		
		System.out.println(Arrays.toString(notasAlunoB)); // imprimindo o array usando o ToString para mostrar
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
