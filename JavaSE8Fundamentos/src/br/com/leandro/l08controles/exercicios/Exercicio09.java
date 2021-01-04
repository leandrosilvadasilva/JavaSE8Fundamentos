package br.com.leandro.l08controles.exercicios;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		/*
		 * 9. Faça um Programa que leia três números e mostre-os em ordem decrescente.
		 */

		System.out.println("MOSTRAR NÚMEROS EM ORDEM DECRESCENTE");
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número ");
		int num1 = scan.nextInt();

		System.out.println("Digite o segundo número ");
		int num2 = scan.nextInt();

		System.out.println("Digite o terceiro número ");
		int num3 = scan.nextInt();



		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			// numero1 é menor
			// num3 é maior
			// num1 < num2 < num3
			System.out.println(num3 + " -- " + num2 + " -- " + num1);
		} else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
			// numero1 é menor
			// num2 é maior
			// num2 < num3 < num1
			System.out.println(num2 + " -- " + num3 + " -- " + num1);
		} else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			// numero2 é menor
			// num3 é maior
			// num2 < num1 < num3
			System.out.println(num2 + " -- " + num1 + " -- " + num3);
		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			// numero2 é menor
			// num1 é maior
			// num1 < num3 < num2
			System.out.println(num1 + " -- " + num3 + " -- " + num2);
		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
			// numero3 é menor
			// num1 é maior
			// num1 < num2 < num3

			System.out.println(num1 + " -- " + num2 + " -- " + num3);
		}else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			// numero3 é menor
			// num2 é maior
			// num2 < num1 < num3

			System.out.println(num2 + " -- " + num1 + " -- " + num3);
		}


	}
}
