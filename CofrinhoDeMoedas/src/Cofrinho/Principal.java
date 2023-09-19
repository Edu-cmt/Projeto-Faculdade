package Cofrinho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Cofrinho cofre = new Cofrinho();//Instanciação da Classe Cofrinho 
		
		int opcoesMoedas = 0;
		int opcoes;
		//Menu de escolha de operação
		System.out.println("|Cofre Aberto!|");
		System.out.println("** Menu Cofrinho **");
		System.out.println("|1| - Adicionar");
		System.out.println("|2| - Remover");
		System.out.println("|3| - Listar Moedas");
		System.out.println("|4| - Somar total em Reais");
		System.out.println("|0| - Encerrar");
		opcoes = input.nextInt();

		
		while (opcoes != 0) {
			switch (opcoes) {
			case 1://Opção "Adicionar"
				opcoesMoedas = 0;
				while (opcoesMoedas <= 0 || opcoesMoedas > 3) {
					System.out.println("Escolha uma Moeda:"); //Menu de escolha do tipo de moeda
					System.out.println("|1| - Real");
					System.out.println("|2| - Euro");
					System.out.println("|3| - Dolar");
					opcoesMoedas = input.nextInt();
                   
					Moeda moeda = null;//Objeto da SuperClasse Moeda servindo de referência para a instanciação das classes filhas
					if (opcoesMoedas == 1) {
						System.out.println("Digite o valor em Reais:");
						double valor = input.nextDouble();
						moeda = new Real(valor);//Instanciação da subclasse Real
						System.out.printf("%.2f reais adicionados ++ %n", valor);
						System.out.println("----------------------");
					}
					if (opcoesMoedas == 2) {
						System.out.println("Digite o valor em Euros:");
						double valor = input.nextDouble();
						moeda = new Euro(valor);//Instanciação da subclasse Euro
						System.out.printf("%.2f euros adicionados ++ %n", valor);
						System.out.println("----------------------");
					}
					if (opcoesMoedas == 3) {
						System.out.println("Digite o valor em Doalares:");
						double valor = input.nextDouble();
						moeda = new Dolar(valor);//Instanciação da subclasse Dolar
						System.out.printf("%.2f dolares adicionados ++ %n", valor);
						System.out.println("----------------------");
					}
					cofre.adicionar(moeda);//Metodo da classe Confrinho para a adição de objetos  
				}
				break;
			case 2://Opção "Remover"
				opcoesMoedas = 0;
				while (opcoesMoedas <= 0 || opcoesMoedas > 3) {
					System.out.println("|1| - Real");
					System.out.println("|2| - Euro");
					System.out.println("|3| - Dolar");
					opcoesMoedas = input.nextInt();

					Moeda moeda = null;
					if (opcoesMoedas == 1) {
						System.out.println("Digite o valor em Reais:");
						double valor = input.nextDouble();
						moeda = new Real(valor);
						System.out.printf("%.2f reais removidos -- %n", valor);
						System.out.println("----------------------");
					}
					if (opcoesMoedas == 2) {
						System.out.println("Digite o valor em Euros:");
						double valor = input.nextDouble();
						moeda = new Euro(valor);
						System.out.printf("%.2f euros removidos -- %n", valor);
						System.out.println("----------------------");
					}
					if (opcoesMoedas == 3) {
						System.out.println("Digite o valor em Doalares:");
						double valor = input.nextDouble();
						moeda = new Dolar(valor);
						System.out.printf("%.2f dolares removidos -- %n", valor);
						System.out.println("----------------------");
					}
					cofre.remover(moeda);
				}
				break;
			case 3://Opção "Listar Moedas"
				cofre.listagemMoedas();
				System.out.println("------------------------");
				break;
			case 4://Opçao "Somar Total em reais"
				cofre.totalConvertido();
				break;
			default://Mensagem caso o usuario não digite uma opção válida.
				System.out.println("Opção inválida!");
			}
            //Menu para que o usario possa escolher outro digito e nao fique preso no loop do case 1
			System.out.println("*Menu Cofrinho*");
			System.out.println("|1| - Adicionar");
			System.out.println("|2| - Remover");
			System.out.println("|3| - Listar Moedas");
			System.out.println("|4| - Somar total em Reais");
			System.out.println("|0| - Encerrar");
			opcoes = input.nextInt();
		}
		System.out.println("|Cofre fechado!|");

		input.close();
	}

}
