package br.com.leandro.oo.metodossimples;

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
}
