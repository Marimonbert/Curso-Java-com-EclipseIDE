package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor");
		String operacao = JOptionPane.showInputDialog("Digite a operação");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo valor");
		
	
	
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		
		
		double soma = numero1 + numero2;
		double multiplicacao = numero1 * numero2;
		double subtracao = numero1 - numero2;
		double divisao = numero1 / numero2;

		double mais ="+".equals(operacao) ? soma: 0 ;
		System.out.println("O resultado da divisão é: " + mais);
		
		double menos ="-".equals(operacao) ? subtracao: mais ;
		System.out.println("O resultado da subtração é: " + menos);
		
		double vezes ="/".equals(operacao) ? divisao: mais ;
		System.out.println("O resultado da divisão é: " + vezes);
		
		double dividido ="*".equals(operacao) ? multiplicacao: mais ;
		System.out.println("O resultado da dmultiplicação é: " + dividido);

			
	}

}
