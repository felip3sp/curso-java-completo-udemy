package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		ProdutoDesafioFilter p1 = new ProdutoDesafioFilter("PC GAMER", 5999.99, 0.25, 0);
		ProdutoDesafioFilter p2 = new ProdutoDesafioFilter("TECLADO", 999.99, 0.12, 0);
		ProdutoDesafioFilter p3 = new ProdutoDesafioFilter("MOUSE", 899.99, 0.15, 0);
		ProdutoDesafioFilter p4 = new ProdutoDesafioFilter("HEADSET", 599.99, 0.33, 0);
		ProdutoDesafioFilter p5 = new ProdutoDesafioFilter("CELULAR", 7999.99, 0.22, 0);
		ProdutoDesafioFilter p6 = new ProdutoDesafioFilter("MOUSE PAD", 99.99, 0.05, 0);
		ProdutoDesafioFilter p7 = new ProdutoDesafioFilter("SSD 512MB", 2299.99, 0.35, 0);
		ProdutoDesafioFilter p8 = new ProdutoDesafioFilter("PLACA DE VIDEO", 1999.99, 0.20, 0);
		ProdutoDesafioFilter p9 = new ProdutoDesafioFilter("MONITOR GAMER", 1599.99, 0.19, 0);
		ProdutoDesafioFilter p10 = new ProdutoDesafioFilter("CADEIRA GAMER", 999.99, 0.10, 0);
		
		List<ProdutoDesafioFilter> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
		
		Predicate<ProdutoDesafioFilter> promocao = p -> p.desconto >= 0.15;
		Predicate<ProdutoDesafioFilter> frete = p -> p.valorFrete == 0;
		Predicate<ProdutoDesafioFilter> produtoRelevante = p -> p.preco >= 500;
		Function<ProdutoDesafioFilter, String> result = p -> "Aproveite! " + p.nome + " por R$" + p.preco;
		
		produtos.stream().filter(promocao).filter(frete).filter(produtoRelevante).map(result).forEach(System.out::println);;
	}
}
