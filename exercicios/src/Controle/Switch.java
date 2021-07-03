package Controle;

public class Switch {

	public static void main(String[] args) {
		
		// o swuitch nao recebe um verdadeiro e falso, e sim o valor direto.
		String faixa = "roxa"; 
		
		switch (faixa.toLowerCase()) {
		
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei oTekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "amarela":
			System.out.println("Sei o Heian Nidan");
		break;	// o break é onde o código papará de ser executado 
			default:
				System.out.println("não sei nada!!");
		}
		System.out.println("fim");
		
		int idade = 1;
		switch(idade) {
		
		case 3:
			System.out.println("sabe falar");
		case 2:
			System.out.println("sabe andar");
		case 1:
			System.out.println("sabe sorrir");
		
		}
		
	}
	
}
