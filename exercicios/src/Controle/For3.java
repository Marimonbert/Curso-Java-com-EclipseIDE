package Controle;

public class For3 {
	
	public static void main(String[] args) {
		
		//fazendo um la�o "for" , ou seja, um for dentro de outro.
		// definirmos uma vari�vel dentro do la�o for, nao poderemos usa-la depois
		
		for(int i = 0; i < 10; i++) {
			for (int j = 0;	j < 10; j++) {
				System.out.printf("{%d, %d}", i, j);
			}
			System.out.println();
		
		}
	}
}
