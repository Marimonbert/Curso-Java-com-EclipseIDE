package Controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			double nota = 0.0;
			int QuantidadeDeNotas = 0;
			double total = 0.0;
		
		
	
		while(nota != -1) { // se nota for diferente de -1 o c�digo abaixo ser� executado.
			//se n�o, fechar� a execu��o.
			System.out.println("informe uma nota v�lida: ");
			nota = entrada.nextDouble();
			
				if (nota >= 0 && nota <= 10) {
					total += nota; // acrescentar a nota digitada, a vari�vel nota.
					QuantidadeDeNotas++; // toda vez que o if for verdadeiro � somada nesata
					//vari�vel.
				}else {
					if (nota != -1) // quando for diferente de -1.
					System.out.println("Nota inv�lida");
				}
		
		}	
			//calcular notas
			double media = total / QuantidadeDeNotas; // dividir o total pela quantidade de notas.
			System.out.println("M�dia: " + media);
			System.out.println("Notas v�lidas: " + QuantidadeDeNotas);
			entrada.close();
		
	
		
	}

}
