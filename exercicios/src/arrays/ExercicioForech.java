package arrays;

public class ExercicioForech {
	
	public static void main(String[] args) {
		// criando um array
		double [] notasAlunoA = new double [3];
		notasAlunoA [0] = 7.7; // setando suas variáveis e posições
		notasAlunoA [1] = 9.0;
		notasAlunoA [2] = 5.0;
		
	//	System.out.println(Arrays.toString(notasAlunoA)); // ler o array com string
		
		double total = 0;
		for (double notas: notasAlunoA) {
			System.out.println(notas);
	
		}
		System.out.println(total / notasAlunoA.length); 
		// outra maneira de criar um array
		double [] notasAlunoB = {7.0, 5.8, 4.6, 9.0}; // variáveis setadas diretamente no array
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) { //laço for
			totalAlunoB += notasAlunoB[i];
		
	
	}
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
	
}


