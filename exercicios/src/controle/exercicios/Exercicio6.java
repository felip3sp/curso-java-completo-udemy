package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int continuar;
		int numeroSorteado;
		int tentativas;
		int num;

		do {
			
			System.out.println("\nJogo da adivinhação!");
			System.out.println("Sorteando um número entre 0-100...");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("O jogo começou, boa sorte!");
			tentativas = 0;		
			
			do {
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				num = entrada.nextInt();
				
				if(tentativas == 10) {
					System.out.println("\nNúmero máximo de tentativas atingidas, mais sorte na próxima!!!");
					break;
				} else if (num > numeroSorteado) {
					System.out.println("O número sorteado é menor.\n");
				} else if (num < numeroSorteado) {
					System.out.println("O número sorteado é maior.\n");
				} else {
					System.out.printf("\nParabéns, você acertou!!! O número escolhido era %d .\n", numeroSorteado);
				}
				
			} while (num != numeroSorteado);
			
			System.out.print("\nDigite 0 para sair ou qualquer tecla para recomeçar: ");
			continuar = entrada.nextInt();
			
		} while (continuar != 0);
		
		entrada.close();
	}
}
