package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));
		
		String S = "Boa Tarde";
		System.out.println(S.concat("!!!!"));
		
		System.out.println(S + "!!!");
		
		System.out.println(S.startsWith("Boa"));
		
		System.out.println(S.toLowerCase()
				.startsWith("boa"));
		
		System.out.println(S.toUpperCase()
				.endsWith("TARDE"));
		
		System.out.println(S.length());
		
		System.out.println(S.toLowerCase()
				.equals("boa tarde"));
		
		System.out.println(S.equalsIgnoreCase("maria"));
		
		
		var nome = "Maria";
		var sobrenome = "Monteiro";
		var idade = 22;
		var salario = 1.300;
		
		System.out.println("Nome: "+ nome + "\nsobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario + ("$") );
		
		
		
	}

}
