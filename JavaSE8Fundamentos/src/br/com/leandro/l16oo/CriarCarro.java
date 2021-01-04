package br.com.leandro.l16oo;

public class CriarCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();

		carro1.marca = "Hyundai";
		carro1.modelo = "Hb20";
		carro1.numPassageiros = 5;
		carro1.capCompustivel = 46;
		carro1.consumoCombustivel = 0.3;
		
		System.out.println(carro1);
	}

}
