package arrays;

import java.util.Scanner;

public class ExercicoArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas: ");
		int qtdeNotas = entrada.nextInt(); //informar a quantidade de notas
		
		double [] notas = new double [qtdeNotas]; // criar um array com a quantidade de notas
		
		for (int i = 0; i < notas.length; i++) { //laço for para percorrer o array
		System.out.println("Informe nota " + (i + 1) + ": ");  // informando as notas
		notas[i] = entrada.nextDouble();
		
		}
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		double media = total / notas.length;
		System.out.println("A média é: " + media + "!");
		entrada.close();
	}

}
