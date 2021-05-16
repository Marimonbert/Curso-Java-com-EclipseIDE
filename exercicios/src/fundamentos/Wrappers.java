package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		
	//Byte
	Byte b = 100;
	Short s = 1000;
	
	Integer i = 10000; //int
	Long l = 10000l;
	
	System.out.println(b.byteValue());
	System.out.println(s.toString());
	System.out.println(i * 3 );
	System.out.println(l/3);

	Boolean bo = Boolean.parseBoolean("true");
	System.out.println(bo.toString().toUpperCase());
	
	Character c = '#';
	System.out.println(c + "...");
}
}
