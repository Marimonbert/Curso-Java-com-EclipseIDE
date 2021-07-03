package Controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o Dia");
		
		String  dia = entrada.nextLine();
		
		
		String segunda = "segunda";
		String terca = "terça";
		String quarta = "quarta";
		String quinta = "quinta";
		String sexta = "sexta";
		String sabado = "sábado";
		String domingo = "domingo";
		
		if (dia.equalsIgnoreCase(segunda)){
			System.out.println("1");
		} else if (dia.equalsIgnoreCase(terca)) {
			System.out.println("2");
		} else if (dia.equalsIgnoreCase(quarta)) {
			System.out.println("3"); 		
		}else if (dia.equalsIgnoreCase(quinta)) {
			System.out.println("4");
		}else if (dia.equalsIgnoreCase(sexta)) {
			System.out.println("5");
		}else if (dia.equalsIgnoreCase(sabado)) {
			System.out.println("6");
		}else if (dia.equalsIgnoreCase(domingo)) {
			System.out.println("7");
		}
		
		entrada.close();
		
		}
}
