package br.com.leandro.controles.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		/*
		 * 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
		 * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite seu sexo:");
		String sexo = scan.next();

//		switch (sexo) {
//		case "F":
//			System.out.println("Feminino");
//			break;
//		case "M":
//			System.out.println("Masculino");
//			break;
//		default:System.out.println("Sexo inválido");
//			break;
//		}
		
		if (sexo.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		} else if(sexo.equalsIgnoreCase("m")) {
			System.out.println("Masculino");

		}else {
			System.out.println("Sexo inválido");
		}
	}
}
