package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto.desconto = 0.50; // todos os produtos da classe recebem 50% de desconto
		
		Produto p1 = new Produto("Notebook" , 4.500);
		System.out.println("Nome do produto: " +  p1.nome + "\nPre�o do produto: "
		+ p1.preco + "\nValor com desconto: " + p1.precoComDesconto());
		

		Produto p2 = new Produto("Geladeira" , 3.200);
		p2.precoComDesconto();
		System.out.println("\nNome do produto: " + p2.nome + "\nValor com desconto: " + p2.precoComDesconto());
		
		Produto p3 = new Produto("Arm�rio" , 2.500);
		p3.precoComDesconto();
		System.out.println("\nNome do produto: "+ p3.nome + "\nvalor do produto: "+ p3.precoComDesconto());
		
		
	}
	
}