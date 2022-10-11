package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salário: ");
		String sal1 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o segundo salário: ");
		String sal2 = entrada.next().replace(",", ".");
		
		System.out.print("Digite o terceiro salário: ");
		String sal3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(sal1);
		double salario2 = Double.parseDouble(sal2);
		double salario3 = Double.parseDouble(sal3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("Média salarial é: R$ %.2f", media);
		System.out.println("\nA média dos salários é " + media);
		
		
		entrada.close();
	}

}
