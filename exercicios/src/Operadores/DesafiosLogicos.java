package Operadores;

public class DesafiosLogicos {
	
	public static void main(String[] args) {
		
		boolean terca = false;
		boolean quinta = true;
	   
		
		boolean Tv50 = terca && quinta;
		boolean Tv30 = terca ^ quinta;
		boolean Sorvete = terca || quinta;
		 
		System.out.println("comprou Tv de 50 polegas? " + Tv50);
		System.out.println("comprou Tv de 50 polegas? " + Tv30);
		System.out.println("comprou Tv de 50 polegas? " + Sorvete);
		System.out.println("comprou Tv de 50 polegas? " + !Sorvete);
		
		
	}

}
