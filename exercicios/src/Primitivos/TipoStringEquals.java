package Primitivos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		System.out.println("2" == "2"); // a compara��o feita diretamente deixar� o resultado sempre verdadeiro
		
		
		String s = new String ("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s)); // a  nota��o .equals compara string dando assim o resultado correto
		
		Scanner entrada = new Scanner (System.in);
		
		String s2 = entrada.next();  // next se refere a pr�xima linha
		System.out.println("2" == s2.trim()); // o .trim tira os espa�os em branco
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		
	}

}
