package br.com.leandro.controles.exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {

		/*
		 * 8. Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual
		 * produto voc� deve comprar, sabendo que a decis�o � sempre pelo mais barato.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o pre�o do primeiro produto: ");
		double prod1 = scan.nextDouble();

		System.out.println("Informe o pre�o do segundo produto: ");
		double prod2 = scan.nextDouble();

		System.out.println("Informe o pre�o do terceiro produto: ");
		double prod3 = scan.nextDouble();
		
		if (prod1 <= prod2 && prod1 <= prod3) {
			System.out.println("O primeiro produto � o mais barato, compre-o valor: R$" + prod1);
		} else if(prod2 <= prod1 && prod2 <= prod3) {
			System.out.println("O segundo produto � o barato, compre-o valor: R$" + prod2);
		} else 			System.out.println("O terceiro produto � o mais barato, compre-o valor: R$" + prod3);
	}

}
