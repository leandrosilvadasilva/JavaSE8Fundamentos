package br.com.leandro.l18construtores;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCompustivel;
	double consumoCombustivel;

	
	//Contrutores
	Carro(){
		super();
		System.out.println("Classe foi instanciada");
		numPassageiros = 4;
	}
	Carro(String marca){
		marca = marca;
	}

	
	
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: "
				+ capCompustivel * consumoCombustivel + " km");
	}

	
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado!");
		return capCompustivel * consumoCombustivel;
	}
	
	double calcularCombustivel (double km) {
		
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;
	}
}
