package arrays;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Quantos alunos na turma? ");
		int qalunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qnotas = entrada.nextInt();
		
		double [] [] Mturma = new double [qalunos] [qnotas];
		double total = 0;
		for (int a = 0; a < Mturma.length; a++) {
			for (int n = 0; n <Mturma.length; n++ ) {
				System.out.printf("Informe a nota %d do aluno %d: "
						, n + 1 , a + 1);
				Mturma[a][n] = entrada.nextDouble();
				total += Mturma [a][n];
				
			}
			
		}
		double media = total /  (qalunos * qnotas);
		System.out.println("M�dia da turma � " + media);
		entrada.close();
		
		
	}

}
