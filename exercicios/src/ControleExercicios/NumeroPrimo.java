package ControleExercicios;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		//o programa recebe um numero e informa se ele � primo 
		//ou n�o
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um n�mero");
		double numero = entrada.nextDouble();
		
		
		if(numero % 2 == 1) {
			System.out.println("O n�mero � primo!!");
		}else {
			System.out.println("O n�mero n�o � primo.");
		}
		entrada.close();
		
	}
	
}
