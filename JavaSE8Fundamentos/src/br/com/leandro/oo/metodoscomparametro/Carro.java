package br.com.leandro.oo.metodoscomparametro;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCompustivel;
	double consumoCombustivel;

	
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
