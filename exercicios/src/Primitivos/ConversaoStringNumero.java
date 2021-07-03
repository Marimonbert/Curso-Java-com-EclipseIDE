package Primitivos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		
		String valor1 = JOptionPane.showInputDialog("digite o primeiro número"); //captura valor de entrada teclado
		String valor2 = JOptionPane.showInputDialog("Digite o segundo valor");
		
	
		
		double numero1 = Double.parseDouble(valor1); //converte string para double
		double numero2 = Double.parseDouble(valor2); //converte string para double
		
		
		System.out.println(numero1 + numero2); // soma os dois numeros de entrada
		
		String s = new String ("8");
		System.out.println("2".equals(s)); // compara o valor de uma string
		
		
	}

}
