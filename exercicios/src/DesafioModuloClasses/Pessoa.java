package DesafioModuloClasses;

public class Pessoa {
	
	String nome = "Maria";
	double peso =  65.5;
	
	Pessoa (String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}
	String apresentar () {
		return "Meu nome é " + nome + " eu tenho " + peso + " Kgs";
	}
}
	
    

