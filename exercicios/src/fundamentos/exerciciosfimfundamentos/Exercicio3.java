package fundamentos.exerciciosfimfundamentos;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		String peso = JOptionPane.showInputDialog("Digite seu peso:").replace(",", ".");
		String altura = JOptionPane.showInputDialog("Digite sua altura:").replace(",", ".");
		
		double p1 = Double.parseDouble(peso);
		double h1 = Double.parseDouble(altura);
		
		double imc = p1 / Math.pow(h1, 2);
		
		System.out.printf("Seu IMC é %.2f", imc);
		
	}
}
