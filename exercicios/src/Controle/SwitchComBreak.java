package Controle;

import java.util.Scanner;

public class SwitchComBreak {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		int nota = 0;
		String conceito = "";
		
		System.out.println("Digite a nota: ");
		nota = entrada.nextInt();
		System.out.println("O conceito é: " + conceito);
		switch(nota) {
		
		case 10: 
		case 9:
			System.out.println("Conceito A");
			break;
		case 8: 
		case 7:
			System.out.println("Conceito B");
			break;
		case 6: 
		case 5:
			System.out.println("Conceito C");
			break;
		case 4: 
		case 3:
			System.out.println("Conceito D");
			break;
		case 2: 
		case 1:
			System.out.println("Conceito E");
			
			break;
			
		default :
			System.out.println("Não Informado1");;
	
		}
		
			
		entrada.close();
}
}
