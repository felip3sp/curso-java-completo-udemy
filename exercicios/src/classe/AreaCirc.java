package classe;

public class AreaCirc {

	double raio;
	final static double PI = 3.1415; // membro sendo um atributo 
									// estático pertencente a classe
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) { // método estático pertencente a classe
		return PI * Math.pow(raio, 2);
	}
}
