package Controle;

public class Continue {
	// o continue � usado para pular uma determinada execu��o
	public static void main(String[] args) {
		
	for (int i = 0; i < 10; i++) {
		
		if(i % 2 == 1) {
			continue;
		}
		 System.out.println(i);
		}

	} 
}
