package br.com.leandro.oo.metodoscomretorno;


public class Principal {

	public static void main(String[] args) {
		Carro carro1 = new Carro();

		carro1.marca = "Hyundai";
		carro1.modelo = "Hb20";
		carro1.numPassageiros = 5;
		carro1.capCompustivel = 46;
		carro1.consumoCombustivel = 0.3;

		
		double autonomia = carro1.obterAutonomia();
		
		
		System.out.println("a autonomia é: " + autonomia);
		
		System.out.println("a autonomia é: " + carro1.obterAutonomia());
	}

}
