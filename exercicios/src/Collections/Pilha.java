package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		// o ultimo que entra é o primeiro a sair
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno príncipe");
		livros.push("Don Quixote");
		livros.push("O hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop()); // também remove elemento da lista
		System.out.println(livros.poll());// remove itens da lista
	
		
		
	}

}
