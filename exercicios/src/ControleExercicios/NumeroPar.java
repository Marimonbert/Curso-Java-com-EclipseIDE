package ControleExercicios;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		//o programa pega um némero de 0 a 10 e informa se ele é
		//par ou ímpar
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		
		int numero = entrada.nextInt();
		
		if (numero >= 0 && numero <= 10) {
		System.out.println("está entre 0 e 10");
			if(numero % 2 == 0) {
				System.out.println("Número par");
			}
				if(numero % 2 == 1)
				System.out.println("Número ímpar");
				
			}else {
				System.out.println("Número inválido");
			}
		
		entrada.close();
		
	}
}
