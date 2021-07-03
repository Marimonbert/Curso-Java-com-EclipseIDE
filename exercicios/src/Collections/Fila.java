package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	 public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// Offer e add -> adicionamm elementos na fila
		// Diferen�a � o comportamento quando a fila est� cheia
		//quando a fila est� cheia
		
		fila.add("Ana"); // retorna false
		fila.offer("Maria"); // lan�a exce��o
		fila.add("Julia");
		fila.offer("Anderson");
		fila.add("Rafael");
		fila.offer("Clara");
		fila.add("Lais");
		fila.offer("Renato");
		
		// peek e o element -> eles obtem o pr�ximo elementos da fila sem remover
		// diferen�a de comportamento ocorre quando a fila estiver vazia
		
		System.out.println(fila.peek()); // retorna null se a fila estiver vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lan�a exce��o se estiver vazia
		System.out.println(fila.element());
		

	 	//fila.size(); -> tamanho da fila
		//fila.clear(); -> para limpar a fila
		//fila.isEmpty(); - > verifica se a fila est� ou n�o vazia
		//fila.contains(...); -> saber se o elemento est� ou n�o contido
		
		
		
		//poll e Remove -> obt�m o pr�ximo elemento da fila e o remove
		//diferen�a de comportamento quando a fila est� vazia
		
		System.out.println(fila.poll()); //mostra elementos da lista e os remove
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		System.out.println(fila.remove()); // remove o elemento da fila
	}

	 	
	}
