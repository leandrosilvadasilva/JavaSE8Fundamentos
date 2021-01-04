package br.com.leandro.l13oo.metodossimples;

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
}
