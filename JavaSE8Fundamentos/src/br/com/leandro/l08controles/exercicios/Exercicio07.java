package br.com.leandro.l08controles.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*
		 * 7. Faça um Programa que leia três números e mostre o maior e o menor deles.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 3 números");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Número 1 é maior: " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Número 2 é maior: " + num2);
		}else {
			System.out.println("Número 3 é maior: " + num3);
		}
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("Número 1 é menor: " + num1);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("Número 2 é menor: " + num2);
		}else {
			System.out.println("Número 3 é menor: " + num3);
		}
		scan.close();
	}
}
