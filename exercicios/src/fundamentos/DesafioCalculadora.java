package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor");
		String operacao = JOptionPane.showInputDialog("Digite a opera��o");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo valor");
		
	
	
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		
		
		double soma = numero1 + numero2;
		double multiplicacao = numero1 * numero2;
		double subtracao = numero1 - numero2;
		double divisao = numero1 / numero2;

		double mais ="+".equals(operacao) ? soma: 0 ;
		System.out.println("O resultado da divis�o �: " + mais);
		
		double menos ="-".equals(operacao) ? subtracao: mais ;
		System.out.println("O resultado da subtra��o �: " + menos);
		
		double vezes ="/".equals(operacao) ? divisao: mais ;
		System.out.println("O resultado da divis�o �: " + vezes);
		
		double dividido ="*".equals(operacao) ? multiplicacao: mais ;
		System.out.println("O resultado da dmultiplica��o �: " + dividido);

			
	}

}
