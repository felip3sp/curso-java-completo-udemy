package fundamentos.exerciciosfimfundamentos;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		
		String entrada1 = JOptionPane.showInputDialog("Digite o valor da base do triangulo:").replace(",", ".");
		String entrada2 = JOptionPane.showInputDialog("Digite o valor da altura do triangulo:").replace(",", ".");
		
		double base = Double.parseDouble(entrada1);
		double altura = Double.parseDouble(entrada2);
		
		double area = (base * altura) / 2;
		
		System.out.println("A area do triangulo é " + area);
		
	}
}
