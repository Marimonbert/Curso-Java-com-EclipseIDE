package Controle;

public class WhileDeterminado {
	
	public static void main(String[] args) {
		
		int contador = 1;
		
		// mais usado para quando se tem um estrutura indeterminada de repeti��es.
		
		while(contador <= 100) {
			
			System.out.printf("i = %d\n", contador);
			contador += 50;
		}
	}

}
