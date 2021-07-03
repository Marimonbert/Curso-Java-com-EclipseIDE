package ControleExercicios;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;

		do {
			System.out.println("Sorteando numero entre 0 e 100...\n");
			Random numeroAleatorio = new Random();// MOSTRA UM NUMERO ALEATÓRIO 
			numeroSorteado = numeroAleatorio.nextInt(101);

			System.out.println("Começou o jogo! Sera que consegue me vencer?");
			tentativas = 0;

			do {
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				numero = scanner.nextInt();

				if (numero > numeroSorteado) {

					System.out.printf("\nO numero sorteado e menor que %d\n\n", numero);

				} else if (numero < numeroSorteado) {

					System.out.printf("\nO numero sorteado e maior que %d\n\n", numero);

				} else {

					System.out.printf("\nParabens! Voce acertou o numero em %d tentativas!\n\n", tentativas);

				}

			} while (numero != numeroSorteado);

			System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
			continuar = scanner.nextInt();

		} while (continuar != 0);

		scanner.close();
	}
}
