package br.com.leandro.l07exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * 2. Faça um Programa que peça um número e então mostre a mensagem O número
		 * informado foi [número].
		 */
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int numero = scan.nextInt();
		
		System.out.println("O número digitado foi: " + numero);
	
	}
}
