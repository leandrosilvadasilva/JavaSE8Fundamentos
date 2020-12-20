package br.com.leandro.controles.exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		/*
		 * 2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo
		 * ou negativo.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor");
		double valor = scan.nextDouble();
		
		if (valor >= 0) {
			System.out.println("O valor digitado é positivo");
		}else {
			System.out.println("O valor digitado é negativo");
		}
	}
}
