package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		double cima1 = Math.pow((6 * (3 + 2)), 2);
		double baixo1 = 3 * 2;
		double equa1 = cima1 / baixo1;
		
		double cima2 = ((1 - 5) * (2 - 7));
		double baixo2 = 2;
		double equa2 = Math.pow(cima2 / baixo2, 2);
		
		double cima = Math.pow((equa1 - equa2), 3);
		double baixo = Math.pow(10, 3);
		
		double resultado = cima / baixo;
		
		System.out.println(resultado);			
		
		
		double equacao1 = Math.pow((6 * (3 + 2)), 2) / ( 3 * 2);
		
		double equacao2 = Math.pow(((1-5)*(2-7)/2), 2);
		
		double resultado2 = Math.pow((equacao1 - equacao2) / 10, 3);
		
		System.out.println(equacao1);
		System.out.println(equacao2);
		System.out.println(resultado2);
	}
}
