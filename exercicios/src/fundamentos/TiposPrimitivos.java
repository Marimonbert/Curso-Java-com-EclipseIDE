package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
	//informaçõesm de funcionários
		
	// Tipos numéricos inteiros
		
		byte AnosDeEmpresa = 23;
		short NumeroDeVoos = 542;
		int id = 56789;
		long PontosAcumulados = 3_123_845_223L;
		
		//Tipos numéricos reais
		
		float salario = 11_445.44F;
		double VendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		
		boolean EstaDeFerias = false; // true
		
		//tipo caractere
		char status = 'A' ; // ativo
		
		// Dias de empresa
		System.out.println(AnosDeEmpresa * 365);
		
		//numero de viagens
		System.out.println(NumeroDeVoos / 2);
		
		//Pontos por real
		
		System.out.println(PontosAcumulados / VendasAcumuladas);
		System.out.println(id + " ganha -> " + salario);
		System.out.println("Férias? " + EstaDeFerias);
		System.out.println("status " + status );
		
		
	}

}
