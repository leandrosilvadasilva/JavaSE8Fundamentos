package br.com.leandro.l17palavrachavethis;

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
	
	public Carro(String marca, String modelo, int numPassageiros, double capCompustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCompustivel = capCompustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	
	
	
	
	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 parâmetros");
	}

	public Carro(String marca, String modelo) {
		this(marca,modelo, 10);
		System.out.println("Chamando construtor com 2 parâmetros");		
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: "
				+ this.capCompustivel * this.consumoCombustivel + " km");
	}

	
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado!");
		return this.capCompustivel * this.consumoCombustivel;
	}
	
	double calcularCombustivel (double km) {
		
		double qtdCombustivel = km / this.consumoCombustivel;
		
		return qtdCombustivel;
	}

}
