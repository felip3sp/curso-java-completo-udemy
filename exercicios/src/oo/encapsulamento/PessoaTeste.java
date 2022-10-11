package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", "Amoedo", -45);		
		p1.setIdade(-30); // alterar o valor da variavel
		
		System.out.println(p1.getIdade()); // ler o valor da variavel
		System.out.println(p1); // toString
		System.out.println(p1.getNomeCompleto());
	}
}
