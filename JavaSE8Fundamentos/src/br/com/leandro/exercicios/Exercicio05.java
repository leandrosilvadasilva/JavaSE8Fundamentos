package br.com.leandro.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*
		 * 5. Fa�a um Programa que converta metros para cent�metros.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("PROGRAMA CONVERSOR DE METROS PARA CENTIMETROS");
	
		System.out.println("Digite metros:");
		
		double metros = scan.nextDouble();
		
		double conversor = metros * 100;
		
		System.out.println("Cent�metros: " + "\n" + conversor + "cm");
	
	}
}
