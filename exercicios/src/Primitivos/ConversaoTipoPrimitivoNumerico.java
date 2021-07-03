package Primitivos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //conversão implícita
		System.out.println(a); 
		
		float b = (float) /*cast para transformar o valor em float*/  1.0; //Conversao explícita (CAST)
		System.out.println(b); 
		
		int c = 4;
		byte d = (byte) c; //Conversao explícita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f);
	}
}
