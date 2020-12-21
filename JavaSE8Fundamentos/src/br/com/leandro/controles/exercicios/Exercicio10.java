package br.com.leandro.controles.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		
		/*
		 * '10. Faça um Programa que pergunte em que turno você estuda. 
		 * Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
		 * Imprima amensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" 
		 * ou "Valor Inválido!", conforme o caso.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Que turno voce estuda?");
		String turno = scan.next();
		
		if (turno.equalsIgnoreCase("m")) {
			System.out.println("Bom dia!");
			
		}else if(turno.equalsIgnoreCase("v")){
			System.out.println("Boa tarde!");
		}else if(turno.equalsIgnoreCase("n")) {
			System.out.println("Boa noite");
		}else System.out.println("Valor inválido.");
		
		switch (turno) {
		case "m":
		case "M":
			System.out.println("Bom dia!");
			break;
		case "v":
		case "V":
			System.out.println("Boa tarde!");
			break;
		case "n":
		case "N":
			System.out.println("Boa noite!");
			break;
		default:System.out.println("Valor inválido.");
			break;
		}
	}

}
