package br.com.leandro.l08controles.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*
		 * 7. Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 3 n�meros");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("N�mero 1 � maior: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("N�mero 2 � maior: " + num2);
		}else {
			System.out.println("N�mero 3 � maior: " + num3);
		}
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("N�mero 1 � menor: " + num1);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("N�mero 2 � menor: " + num2);
		}else {
			System.out.println("N�mero 3 � menor: " + num3);
		}
		scan.close();
	}
}
