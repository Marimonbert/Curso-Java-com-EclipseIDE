package oo.composicao;

public class Carro {
	
	Motor motor = new Motor();
	
	void acelerar() {
		if (motor.fatorInjecao <2.6) {
			motor.fatorInjecao += 0.4;
		}
	}
	void frear () {
		
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	void portaAberta() {
		motor.fatorInjecao = 0.0;
	}
	void ligar () {
		motor.ligado = true;
	}
	void desligar() {
		motor.ligado = false;
	}
	boolean estaLigado() {
		return motor.ligado;
	}
}


