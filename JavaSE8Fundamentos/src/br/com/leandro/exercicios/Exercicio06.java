package br.com.leandro.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 * 6. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calcule a Área de um Círculo");
		
		System.out.println("Qual o raio do círculo");
		
		double raio =  scan.nextInt();
		
		
		
		double pi = 3.14; // usar classe Math
		//double area = pi * (raio * raio);
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A área do círculo é: " + area );
	}
}
