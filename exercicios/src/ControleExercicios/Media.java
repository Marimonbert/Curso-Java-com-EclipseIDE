package ControleExercicios;

import java.util.Scanner;

public class Media {
	//o programa soma duas notas parciais de um aluno e as 
			//divide por 2, dando a média final!
			//não aceitando numeros inválidos!
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double nota1 = 0.0;
		double nota2 = 0.0;
		
		do {
			System.out.println("informe a primeira nota parcial: ");
			nota1 = entrada.nextDouble();
			
		}while(nota1 < 0 || nota1 > 10.0);
		do {
			
			System.out.println("informe a segunda nota parcial: ");
			nota2 = entrada.nextDouble();
		}
		while(nota2 < 0 || nota2 > 10.0);{
		System.out.println("Nota 2: " + nota2);
		}
			double sm = nota1 + nota2;
			double mf = sm/2;
			
			if ( mf >= 7.0) {
			System.out.println("O aluno está aprovado!!");
			System.out.println("A média final é: " + mf);
				
				}if (mf >= 4.0 && mf < 7.0) {
				System.out.println("O aluno está em recuperação!!");
				System.out.println("A média final é: " + mf);
			
					}if (mf < 4.0) {
						System.out.println("O aluno está REPROVADO!!");
						System.out.println("A média final é: " + mf);
			}
		entrada.close();
	}
}	
				
	

