package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); // Captura entrada de informa��es vindas do teclado.
		
		System.out.print("Nome: ");
		String nome = entrada.nextLine(); // NextLine quer dizer que aparecer na pr�xima linha
	
		System.out.print("Sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s temmaria %d anos de idade ", nome, sobrenome, idade);
		
		
		entrada.close(); // fechar o scanner
	}

}
