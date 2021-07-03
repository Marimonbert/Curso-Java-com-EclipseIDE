package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	 public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// Offer e add -> adicionamm elementos na fila
		// Diferença é o comportamento quando a fila está cheia
		//quando a fila está cheia
		
		fila.add("Ana"); // retorna false
		fila.offer("Maria"); // lança exceção
		fila.add("Julia");
		fila.offer("Anderson");
		fila.add("Rafael");
		fila.offer("Clara");
		fila.add("Lais");
		fila.offer("Renato");
		
		// peek e o element -> eles obtem o próximo elementos da fila sem remover
		// diferença de comportamento ocorre quando a fila estiver vazia
		
		System.out.println(fila.peek()); // retorna null se a fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança exceção se estiver vazia
		System.out.println(fila.element());
		

	 	//fila.size(); -> tamanho da fila
		//fila.clear(); -> para limpar a fila
		//fila.isEmpty(); - > verifica se a fila está ou não vazia
		//fila.contains(...); -> saber se o elemento está ou não contido
		
		
		
		//poll e Remove -> obtém o próximo elemento da fila e o remove
		//diferença de comportamento quando a fila está vazia
		
		System.out.println(fila.poll()); //mostra elementos da lista e os remove
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		System.out.println(fila.remove()); // remove o elemento da fila
	}

	 	
	}
