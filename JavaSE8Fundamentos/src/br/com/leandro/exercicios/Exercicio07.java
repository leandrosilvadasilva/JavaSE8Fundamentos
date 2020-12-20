package br.com.leandro.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*
		 * 7. Faça um Programa que calcule a área de um quadrado, em seguida mostre o
		 * dobro desta área para o usuário.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o lado do quadrado: ");
		double lado = scan.nextDouble();
		
//		double areaQuadrado = lado * lado;
		double areaQuadrado = Math.pow(lado, 2);
		
		double dobroDaArea = 2 * areaQuadrado;
		
		System.out.println("A área do quadrado é:" + areaQuadrado);
		System.out.println("O dobro da área do quadrado é: " + dobroDaArea);
	}
}
