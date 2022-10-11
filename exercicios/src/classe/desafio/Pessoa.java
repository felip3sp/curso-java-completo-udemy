package classe.desafio;

public class Pessoa {

	String nome; // atributo de instancia
	double peso; // atributo de instancia
	
	Pessoa(String nome, double peso){ // Construtor
		this.nome = nome; // setando os valores nos atributos
		this.peso = peso; // setando os valores nos atributos
	}
	
	void comer(Comida comida){ // método que recebe um objeto de outra classe
		if(comida != null) { // verificando se o valor não é nulo.
			this.peso += comida.peso; // adicionando o peso da comida no peso da pessoa.
		}
	}
	
	String apresentar() { // método de aprensentação
		return "Olá eu sou o " + nome + " e tenho " + peso + " Kgs.";
	}
}
