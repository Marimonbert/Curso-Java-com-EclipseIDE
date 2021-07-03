package Collections;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("Xicell"));
		lista.add(new Usuario("Isabelle"));
		lista.add(new Usuario("Xuaum"));
		lista.add(new Usuario("PH"));
		
		System.out.println(lista.get(3)); // aqui acessamos pelo indice
		
		lista.remove(4);
		System.out.println(lista.remove(new Usuario("Manu")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome); // aqui acessamos todos os elementos 
			
			
		}
	}
	
	
}
