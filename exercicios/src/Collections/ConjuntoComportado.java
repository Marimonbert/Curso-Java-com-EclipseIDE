package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	 public static void main(String[] args) {
		SortedSet<String> ListaAprovados = new TreeSet<> ();{
			ListaAprovados.add("Maria");
			ListaAprovados.add("Isabelle");
			ListaAprovados.add("Xuaum");
			ListaAprovados.add("Xicell");
			
			for (String Aprovados : ListaAprovados) {
			System.out.println(Aprovados);
		}
			
			Set<Integer> nums = new HashSet<>();
			nums.add(1);
			nums.add(2);
			nums.add(3);
			nums.add(4);
			
			for (int n: nums) {
				System.out.println(n);
			}
					
		}
	}

}
