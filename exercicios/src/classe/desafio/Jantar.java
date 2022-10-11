package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.180); // instanciando a classe Comida criando um objeto
		Comida c2 = new Comida("Feijao", 0.300); // instanciando a classe Comida criando um objeto
		
		Pessoa p = new Pessoa("João", 99.8); // instanciando a classe Pessoa criando um objeto	
		
		System.out.println(p.apresentar()); // imprimindo
		p.comer(c1); // chamando o método comer com a comida c1 
		System.out.println(p.apresentar()); // imprimindo
		p.comer(c2); // chamando o método comer com a comida c2 
		System.out.println(p.apresentar()); // imprimindo
		
		
	}
}
