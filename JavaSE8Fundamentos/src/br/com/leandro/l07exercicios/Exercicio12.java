package br.com.leandro.l07exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*
		 * 12. Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo
		 * que calcule seu peso ideal, usando a seguinte f�rmula: (72.7*altura) - 58
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua altura");
		
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("Seu peso ideal �: " + pesoIdeal);
	}
}
