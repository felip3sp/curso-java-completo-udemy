package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio2 {

	public static void main(String[] args) {
		
		Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2800 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = preco -> ("R$" + preco);
		
		Produto p = new Produto("Notebook", 4358, 0.32);
		
		String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);
		System.out.println("O preço final do produto é " + preco);
	}
}
