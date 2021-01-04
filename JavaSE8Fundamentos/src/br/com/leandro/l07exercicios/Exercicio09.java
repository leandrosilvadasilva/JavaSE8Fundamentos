package br.com.leandro.l07exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * 9. Faça um Programa que peça a temperatura em graus Farenheit, transforme e
		 * mostre a temperatura em graus Celsius. o C = (5 * (F-32) / 9).
		 */
		
		System.out.println("Programa Converte Farenreit em Celsius");
		
		System.out.println("Digite temperatura Farenheit: ");
		
		Scanner scan = new Scanner(System.in);
		
		double fareheint = scan.nextDouble();
		
		double celsius =  (fareheint - 32) * 5 / 9;
		
		System.out.println("A temperatura em Celsius é: " + celsius);
	}
}
