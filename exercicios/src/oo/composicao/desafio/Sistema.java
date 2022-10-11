package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.adicionarItem("Arroz", 20, 1);
		c1.adicionarItem("Feijao", 5, 2);
		
		Compra c2 = new Compra();
		c2.adicionarItem("Alface", 5, 1);
		c2.adicionarItem("Tomate", 8, 2);		
		
		Cliente cliente = new Cliente("Felipe");
		
		cliente.adicionarCompra(c1);
		cliente.adicionarCompra(c2);
		
		System.out.println("R$ " + cliente.obterValorTotal());
		
	}
}
