package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
	Map<Integer , String > usuarios = new HashMap<>();
	usuarios.put(1, "Maria");
	usuarios.put(2, "Isabelle");
	usuarios.put(3, "Xicell");
	usuarios.put(4, "Xuaum");
	
	System.out.println(usuarios.size()); // tamanho do map
	System.out.println(usuarios.isEmpty()); // se est� vazio ou n�o
	System.out.println(usuarios.keySet()); // passando as chaves 
	System.out.println(usuarios.values()); // passando os valores
	System.out.println(usuarios.entrySet()); // mostra todos as chaves e valores
	
	System.out.println(usuarios.containsKey(4)); // se cont�m a chave 4
	System.out.println(usuarios.containsValue("Maria")); // se cont�m o valor "Maria"
	
	System.out.println(usuarios.get(3)); // tamb�m uma forma de verificar se cont�m o valor e imprimi-lo
	System.out.println(usuarios.remove(1)); // para remover um usu�rio 
	
	for (int chave : usuarios.keySet()) { // mostrar todas as chaves
		
		System.out.println(chave);
	}
	for (String valor: usuarios.values()) { // mostrar todos os valores
		System.out.println(valor);
		
		}
	for(Entry<Integer, String> registro: usuarios.entrySet()) { // for para mostrar chaves e valores de uma vez
		
		System.out.println(registro.getKey() +
				" " + registro.getValue());
	}
	
	}
}
