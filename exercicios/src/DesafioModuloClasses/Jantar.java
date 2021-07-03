package DesafioModuloClasses;

public class Jantar {
	
	public static void main(String[] args) {
	
	Comida c1 = new Comida("Arroz", 0.223);
	Comida c2 = new Comida("Feijao", 0.300);
	
	Pessoa p = new Pessoa("Maria" , 65.1);
		
	System.out.println(p.apresentar());
	p.comer(c1);
	System.out.println(p.apresentar());
	p.comer(c2);
	
	System.out.println(p.apresentar());
	}
		
		
}
