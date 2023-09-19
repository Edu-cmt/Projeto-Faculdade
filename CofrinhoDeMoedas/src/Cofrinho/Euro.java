package Cofrinho;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public String toString() {
		return "Euro valor - " + valor;
	}

	@Override
	public double converter() {
		return valor * 5.3f ;
	}



}
