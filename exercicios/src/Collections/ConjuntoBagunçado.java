package Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagun�ado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// criando uma colletion tipo Set
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); //adcionando itens
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("O tamanho �: " + conjunto.size()); //tamanho da colletion
		
		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste")); // removendo item da colletion
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho � " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(true);
		
		Set nums = new HashSet(); // outro modo de criar colletion com set
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		//conjunto.addAll(nums); // uni�o entre dois conjuntos
		System.out.println(nums); // intercess�o de dois conjuntos
		System.out.println(conjunto);
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		
		
		
	}
	

}
