package br.com.leandro.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*
		 * 7. Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre o
		 * dobro desta �rea para o usu�rio.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o lado do quadrado: ");
		double lado = scan.nextDouble();
		
//		double areaQuadrado = lado * lado;
		double areaQuadrado = Math.pow(lado, 2);
		
		double dobroDaArea = 2 * areaQuadrado;
		
		System.out.println("A �rea do quadrado �:" + areaQuadrado);
		System.out.println("O dobro da �rea do quadrado �: " + dobroDaArea);
	}
}
