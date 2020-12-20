package br.com.leandro.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * 10. Faça um Programa que peça a temperatura em graus Celsius, transforme e
		 * mostre em graus Farenheit.
		 */

		System.out.println("Programa Converte Celsius em Farenreit");

		System.out.println("Digite temperatura Celsius: ");

		Scanner scan = new Scanner(System.in);

		double celsius = scan.nextDouble();

		double fareheint = (celsius * 9 / 5) + 32;

		System.out.println("A temperatura em Farenreit é: " + fareheint);
	}

}
