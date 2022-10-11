package arrays;

public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = { 9.9, 8.7, 7.2, 9.4}; // setando um array de 4 posições
		
		for (int i = 0; i < notas.length; i++) { // usando o for para percorrer todo o array
			System.out.print(notas[i] + " "); // imprimindo as notas armazenadas no array
		}
		
		System.out.println();
		
		for(double nota: notas) { // usando o foreach para percorrer todo o array
			System.out.print(nota + " "); // imprimindo as notas armazenadas no array
		}
	}
}
