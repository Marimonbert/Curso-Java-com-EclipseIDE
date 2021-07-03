package ControleExercicios;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		//o programa recebe um numero e informa se ele é primo 
		//ou não
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número");
		double numero = entrada.nextDouble();
		
		
		if(numero % 2 == 1) {
			System.out.println("O número é primo!!");
		}else {
			System.out.println("O número não é primo.");
		}
		entrada.close();
		
	}
	
}
