package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		
		String valor1 = JOptionPane.showInputDialog("digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo valor");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		
		String s = new String ("2");
		System.out.println("2".equals(s));
		
		
	}

}
