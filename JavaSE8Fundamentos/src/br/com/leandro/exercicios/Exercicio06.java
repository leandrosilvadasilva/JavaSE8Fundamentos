package br.com.leandro.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 * 6. Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calcule a �rea de um C�rculo");
		
		System.out.println("Qual o raio do c�rculo");
		
		double raio =  scan.nextInt();
		
		
		
		double pi = 3.14; // usar classe Math
		//double area = pi * (raio * raio);
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.println("A �rea do c�rculo �: " + area );
	}
}
