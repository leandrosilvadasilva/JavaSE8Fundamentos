package br.com.leandro.l08controles.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * 1. Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um n�mero");
		double num1 = scan.nextDouble();

		System.out.println("Digite outro n�mero");
		double num2 = scan.nextDouble();

		if (num1 > num2) {
			System.out.println("O primeiro n�mero digitado � maior! ");
		} else if (num2 > num1) {
			System.out.println("O segundo n�mero digitado � maior! ");
		} else {
			System.out.println("Os n�meros s�o iguais");
		}
	}

}
