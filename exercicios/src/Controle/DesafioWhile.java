package Controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			double nota = 0.0;
			int QuantidadeDeNotas = 0;
			double total = 0.0;
		
		
	
		while(nota != -1) { // se nota for diferente de -1 o código abaixo será executado.
			//se não, fechará a execução.
			System.out.println("informe uma nota válida: ");
			nota = entrada.nextDouble();
			
				if (nota >= 0 && nota <= 10) {
					total += nota; // acrescentar a nota digitada, a variável nota.
					QuantidadeDeNotas++; // toda vez que o if for verdadeiro é somada nesata
					//variável.
				}else {
					if (nota != -1) // quando for diferente de -1.
					System.out.println("Nota inválida");
				}
		
		}	
			//calcular notas
			double media = total / QuantidadeDeNotas; // dividir o total pela quantidade de notas.
			System.out.println("Média: " + media);
			System.out.println("Notas válidas: " + QuantidadeDeNotas);
			entrada.close();
		
	
		
	}

}
