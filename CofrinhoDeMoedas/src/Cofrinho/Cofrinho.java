package Cofrinho;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();


	public void adicionar(Moeda m) {
		listaMoedas.add(m);
	}
	
	public void remover(Moeda m) {
		listaMoedas.remove(m);
	}		
	public void listagemMoedas() {

		for(Moeda m : listaMoedas) {
			System.out.println(m);
		}
	}
	
	public void totalConvertido() {
		double total = 0;
		for(Moeda m : listaMoedas) {
			total+= (m.converter());
		} 
		System.out.printf("Total em reais R$%.2f%n", total);
		}
	}


