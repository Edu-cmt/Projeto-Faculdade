package Cofrinho;

public class Dolar extends Moeda{


	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public double converter() {
		return valor * 4.8f;
	}

	@Override
	public String toString() {
		return "Dolar valor - " + valor;
	}
	
	

}
