package br.com.leandro.controles.exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {

		/*
		 * 8. Faça um programa que pergunte o preço de três produtos e informe qual
		 * produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o preço do primeiro produto: ");
		double prod1 = scan.nextDouble();

		System.out.println("Informe o preço do segundo produto: ");
		double prod2 = scan.nextDouble();

		System.out.println("Informe o preço do terceiro produto: ");
		double prod3 = scan.nextDouble();
		
		if (prod1 <= prod2 && prod1 <= prod3) {
			System.out.println("O primeiro produto é o mais barato, compre-o valor: R$" + prod1);
		} else if(prod2 <= prod1 && prod2 <= prod3) {
			System.out.println("O segundo produto é o barato, compre-o valor: R$" + prod2);
		} else 			System.out.println("O terceiro produto é o mais barato, compre-o valor: R$" + prod3);
	}

}
