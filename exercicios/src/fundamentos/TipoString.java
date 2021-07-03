package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Ol� pessoal".charAt(2)); // mostra o segundo caracter.
		
		String S = "Boa Tarde";
		System.out.println(S.concat("!!!!")); // acrescenta "!!!!" ao valor.
		
		System.out.println(S + "!!!"); // acrecenta o valor "!!!".
		
		System.out.println(S.startsWith("Boa")); // a String inicia ou n�o com a palabra "Boa"?.
		
		System.out.println(S.toLowerCase() // n�o considerar letras mai�sculas e min�sculas.
				.startsWith("boa"));
		
		System.out.println(S.toUpperCase() // n�o considerar mai�sculas e min�sculas.
				.endsWith("TARDE")); // Termina com "Tarde"?
		
		System.out.println(S.length()); // Quantos caracters tem?
		
		System.out.println(S.toLowerCase()
				.equals("boa tarde"));
		
		System.out.println(S.equalsIgnoreCase("maria")); // comparar strings ignorando mai�sculas e min�sculas.
		
		
		var nome = "Maria"; 
		var sobrenome = "Monteiro";
		var idade = 22;
		var salario = 1.300;
		
		System.out.println("Nome: "+nome + "\nsobrenome: " + 
				sobrenome + "\nIdade: " + idade +
				"\nSal�rio: " + salario + ("$") );
		
		System.out.printf("A jovem %s %s tem %d anos e ganha R$%.2f ", nome, sobrenome, idade, salario); // %s serve para adcionar o valor da vari�vel sem ter 
		//que quebrar multiplas linhas.
		
		
	}

}
