package arrays;

public class Foreach {
	
	public static void main(String[] args) {
		
		double[] notas = { 9.9 , 7.9 , 4.5};
		
		for (int i = 0; i < notas.length; i++ ) {
			System.out.println(notas[i] + " ");
		}
		System.out.println();
		
		for (double nota: notas) {
		System.out.println(nota + " ");
		}
	}

}
