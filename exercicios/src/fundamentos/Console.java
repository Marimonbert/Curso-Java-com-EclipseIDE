package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine();
	
		System.out.print("Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("O dados são: " + nome + sobrenome + "\nidade: " + idade);
		
		
		entrada.close();
	}

}
