package Operadores;

public class Logicos {
public static void main(String[] args) {
	
	System.out.println("Tabela do E ");
	
	System.out.println(true && true );
	System.out.println(true && false );
	//System.out.println(false && true);
	//System.out.println(false && false);
	
	System.out.println("Tabela do OU ");
	
	//System.out.println(true || true );
	//System.out.println(true || false );
	System.out.println(false || true);
	System.out.println(false || false);

	
	System.out.println("Tabela do OU EXCLUSIVO ");
	
	System.out.println(true ^ true );
	System.out.println(true ^ false );
	System.out.println(false ^ true);
	System.out.println(false ^ false);
	
	System.out.println("Tabela do NOT de negação ");
	
	System.out.println(!true );
	System.out.println(!false );

	
}
}
