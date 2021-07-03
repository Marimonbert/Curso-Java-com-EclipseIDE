package Primitivos;
import java.util.Scanner;
public class DesafioConversao {

	public static void main(String[] args) {
	Scanner salario = new Scanner (System.in);
	
	
	
	System.out.println("Salario 1: " );
	String s1 = salario.nextLine().replace(",","."); // replace para substituir a virgula pelo ponto
	// entao se o usuário digitar vírgula, será substituído pelo ponto ficando um numero do tipo double
	System.out.println("Salario 2: ");
	String s2 = salario.nextLine().replace(",",".");
	
	System.out.println("Salario 3: ");
	String s3 = salario.nextLine().replace(",",".");
	
	double salario1 = Double.parseDouble(s1);
	double salario2 = Double.parseDouble(s2);
	double salario3 = Double.parseDouble(s3);
	
	double soma = (salario1 + salario2 + salario3) /3;
	//double MediaSalarial = soma;
	
	System.out.println(soma);
	
	salario.close();
	}

}