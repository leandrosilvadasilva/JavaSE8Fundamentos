package br.com.leandro.l08controles.exercicios;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		/*
		 * 9. Fa�a um Programa que leia tr�s n�meros e mostre-os em ordem decrescente.
		 */

		System.out.println("MOSTRAR N�MEROS EM ORDEM DECRESCENTE");
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero ");
		int num1 = scan.nextInt();

		System.out.println("Digite o segundo n�mero ");
		int num2 = scan.nextInt();

		System.out.println("Digite o terceiro n�mero ");
		int num3 = scan.nextInt();



		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			// numero1 � menor
			// num3 � maior
			// num1 < num2 < num3
			System.out.println(num3 + " -- " + num2 + " -- " + num1);
		} else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
			// numero1 � menor
			// num2 � maior
			// num2 < num3 < num1
			System.out.println(num2 + " -- " + num3 + " -- " + num1);
		} else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			// numero2 � menor
			// num3 � maior
			// num2 < num1 < num3
			System.out.println(num2 + " -- " + num1 + " -- " + num3);
		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			// numero2 � menor
			// num1 � maior
			// num1 < num3 < num2
			System.out.println(num1 + " -- " + num3 + " -- " + num2);
		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
			// numero3 � menor
			// num1 � maior
			// num1 < num2 < num3

			System.out.println(num1 + " -- " + num2 + " -- " + num3);
		}else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			// numero3 � menor
			// num2 � maior
			// num2 < num1 < num3

			System.out.println(num2 + " -- " + num1 + " -- " + num3);
		}


	}
}
