package br.com.leandro.l07exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * 11. Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real. Calcule e
		 * mostre: a. o produto do dobro do primeiro com metade do segundo . b. a soma
		 * do triplo do primeiro com o terceiro. c. o terceiro elevado ao cubo.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro");
		int num1 = scan.nextInt();
		
		System.out.println("Digite um n�mero inteiro");
		int num2 = scan.nextInt();
		
		System.out.println("Digite um n�mero real");
		double num3 = scan.nextDouble();
		
		double produto = (2 * num1) * (num2 / 2);
		System.out.println("O produto do dobro do primeiro com metade do segundo: " 
				+ produto);
		double somaDoTriplo = (3 * num1) + num3;
		System.out.println("A soma do triplo do primeiro com o terceiro: " 
				+ somaDoTriplo);
		
		double elevadoAoCubo = Math.pow(num3, 3);//num3 * num3 * num3;
		System.out.println("O terceiro elevado ao cubo: " 
				+ elevadoAoCubo);
	}
}
