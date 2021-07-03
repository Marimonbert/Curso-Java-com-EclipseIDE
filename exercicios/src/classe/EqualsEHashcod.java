package classe;

public class EqualsEHashcod {
	
	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Maria Monteiro";
		u1.email = "marimonob@gmail.com";
		

		Usuario u2 = new Usuario();
		u2.nome = "Maria Monteiro";
		u2.email = "marimonob@gmail.com";
		
		

		Usuario u3 = new Usuario();
		u3.nome = "Maria Monteiro";
		u3.email = "marimonob@gmail.com";
		
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u3));
		
		
	}

}
