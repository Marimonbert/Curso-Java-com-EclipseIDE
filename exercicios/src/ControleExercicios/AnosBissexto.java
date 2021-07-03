package ControleExercicios;

import java.util.Scanner;

public class AnosBissexto {
	//o programa informa se o ano é ou não é bissexto

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = scanner.nextInt();

		int bissexto = ano % 4;

		if (bissexto == 0) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		scanner.close();
	}

}
