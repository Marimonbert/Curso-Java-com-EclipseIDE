package Controle;

import java.util.Scanner;

public class DesafioWhile1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe");

		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) { // enquanto o valor for diferente de "sair"
		System.out.println("Você Diz"); //repetirar 
		valor = entrada.nextLine(); //valor recebe a variavel digitada pelo usuário
		
	
			
		}
		
		entrada.close();
		
	}

}
