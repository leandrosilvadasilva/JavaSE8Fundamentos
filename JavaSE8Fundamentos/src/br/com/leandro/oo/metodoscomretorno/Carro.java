package br.com.leandro.oo.metodoscomretorno;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCompustivel;
	double consumoCombustivel;

	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: "
				+ capCompustivel * consumoCombustivel + " km");
	}

	
	double obterAutonomia() {
		System.out.println("M�todo obterAutonomia foi chamado!");
		return capCompustivel * consumoCombustivel;
	}
}
