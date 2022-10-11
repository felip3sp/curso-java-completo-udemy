package fundamentos.exerciciosfimfundamentos;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		String entrada = JOptionPane.showInputDialog("Insira um valor: ").replace(",",".");
		
		double num = Double.parseDouble(entrada);
		
		double quad = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		
		System.out.printf("O quadrado de %.2f é %.2f e o cubo é %.2f", num, quad, cubo);
	}
}
