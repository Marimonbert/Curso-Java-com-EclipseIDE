package ControleExercicios;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		//o programa pega um n�mero de 0 a 10 e informa se ele �
		//par ou �mpar
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o n�mero: ");
		
		int numero = entrada.nextInt();
		
		if (numero >= 0 && numero <= 10) {
		System.out.println("est� entre 0 e 10");
			if(numero % 2 == 0) {
				System.out.println("N�mero par");
			}
				if(numero % 2 == 1)
				System.out.println("N�mero �mpar");
				
			}else {
				System.out.println("N�mero inv�lido");
			}
		
		entrada.close();
		
	}
}
