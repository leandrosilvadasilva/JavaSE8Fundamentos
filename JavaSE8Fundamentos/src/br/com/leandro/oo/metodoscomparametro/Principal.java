package br.com.leandro.oo.metodoscomparametro;

import java.util.Scanner;

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
		
		System.out.println("Digite a quilometragem: ");
		Scanner scan = new Scanner(System.in);
		double km = scan.nextDouble();
		
		double combustivel = carro1.calcularCombustivel(km);
		
		System.out.println(combustivel);
	}

}
