package br.com.leandro.l08controles.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * 1. Faça um Programa que peça dois números e imprima o maior deles.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número");
		double num1 = scan.nextDouble();

		System.out.println("Digite outro número");
		double num2 = scan.nextDouble();

		if (num1 > num2) {
			System.out.println("O primeiro número digitado é maior! ");
		} else if (num2 > num1) {
			System.out.println("O segundo número digitado é maior! ");
		} else {
			System.out.println("Os números são iguais");
		}
	}

}
