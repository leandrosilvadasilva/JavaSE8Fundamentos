package br.com.leandro.l08controles.exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {

		/*
		 * Fa�a um Programa que verifique se uma letra digitada � vogal ou consoante.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra");
		String letra = scan.next();
		
//		if (letra.equalsIgnoreCase("a")) {
//			System.out.println("A letra � uma vogal");
//		} else {
//			System.out.println("A letra � uma consoante");
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
		case "u":System.out.println("� vogal");
			break;

		default:System.out.println("� consoante");
			break;
		}
	}
}
