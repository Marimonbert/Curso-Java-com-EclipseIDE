package classe;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.1415;
	
	AreaCirc(double raioInicial){
	//	pi = 3.14;
		raio = raioInicial;
	}
	double area() {
		return PI * Math.pow(raio, 2);
	}

}
