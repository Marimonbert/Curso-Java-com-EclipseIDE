package Controle;

import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("A primeira média é:");
		
		double media1 = entrada.nextDouble();
		
		System.out.println("A segunda média é:");
		
		double media2 = entrada.nextDouble();
		
		double soma = media1 + media2;
		
		if (soma /2 >= 7) {
			System.out.println("Aluno aprovado");
		
		}else { 
			System.out.println(" Aluno reprovado");
		}
			
		System.out.println("Media Final: " + soma/2);
				
		entrada.close();
			
		
		
	}

}
