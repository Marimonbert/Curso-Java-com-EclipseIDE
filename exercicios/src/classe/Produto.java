package classe;

public class Produto {

	String nome;
	double preco;
	
	static double desconto = 0.25;
	
	Produto() {
		
	}
	
	Produto (String nomeInicial, double precoProduto) {
		nome = nomeInicial; 
		preco = precoProduto;
	
	}

	double precoComDesconto() {
		return preco*(1 - desconto);
	}
}
