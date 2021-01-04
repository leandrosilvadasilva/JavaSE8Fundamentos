package br.com.leandro.l08controles.exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {

		/*
		 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra");
		String letra = scan.next();
		
//		if (letra.equalsIgnoreCase("a")) {
//			System.out.println("A letra é uma vogal");
//		} else {
//			System.out.println("A letra é uma consoante");
//
//		}
		
		switch (letra) {
		case "A":
		case "E":
		case "I":
		case "O":
		case "U":
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":System.out.println("É vogal");
			break;

		default:System.out.println("É consoante");
			break;
		}
	}
}
