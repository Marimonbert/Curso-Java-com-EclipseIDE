package ControleExercicios;

import java.util.Scanner;

public class NumeroPrimoSwitch {
	//o programa recebe um n�mero e informa se ele � primo 
	//usando switch

	public static void main(String[] args) {
		
	

		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se � primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {

		case 0:
			System.out.println("O numero " + numero + " � um numero primo.");
			break;

		default:
			System.out.println("O numero " + numero + "  n�o � um numero primo.");

		}

		scanner.close();

	}
}
