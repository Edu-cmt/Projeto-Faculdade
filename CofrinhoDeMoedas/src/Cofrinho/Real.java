package Cofrinho;

public class Real extends Moeda {
	

	
	public Real(double valor) {
		super(valor);
	}
    @Override
	public double converter() {
		return valor;
	}
	

	@Override
	public String toString() {
		return "Real valor - " + valor;
	}
}
