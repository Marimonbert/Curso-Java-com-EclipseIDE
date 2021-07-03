package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		// o ultimo que entra � o primeiro a sair
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno pr�ncipe");
		livros.push("Don Quixote");
		livros.push("O hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop()); // tamb�m remove elemento da lista
		System.out.println(livros.poll());// remove itens da lista
	
		
		
	}

}
