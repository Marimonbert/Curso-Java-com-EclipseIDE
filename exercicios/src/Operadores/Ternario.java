package Operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		/* double media = 7.0;
		String nota = media >= 7.0 ?
				"O aluno está aprovado!" : "O aluno estã em recuperação";	*/
	
		
		
		double nota = 9.9;
		boolean comportamento = false;
		boolean PorMedia = nota >= 7;
		boolean temDesconto = comportamento && PorMedia;
		
		String Resultado = temDesconto ? "sim" : "nao";
		
		System.out.println("tem desconto? " + Resultado);
		
		
	}

}
