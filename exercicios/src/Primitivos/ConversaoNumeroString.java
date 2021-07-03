package Primitivos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 10000; // usando a classe Integer que pertece a inteiros
		System.out.println(num1.toString().length()); // passando o metodo toString para transformar o inteiro em string e usar os metodos 
		// disponiveis para string, nesse caso contar quantos caracters tem
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length()); // outra maneira de efetuar o mesmo processo
		

        //A conversão pode ser feita para qualquer outro tipo primitivo numerico
	}

}
