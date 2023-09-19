package Cofrinho;

public abstract class Moeda {
	
	double valor;
			
	public Moeda(double valor) {
		this.valor = valor;
	}

	public abstract double converter();

    
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	

}
