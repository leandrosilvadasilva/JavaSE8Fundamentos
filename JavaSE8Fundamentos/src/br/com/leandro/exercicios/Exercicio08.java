package br.com.leandro.exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		/*
		 * 8. Faça um Programa que pergunte quanto você ganha por hora e o número de
		 * horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
		 * mês.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Quanto voce ganha por hora: ");
		double ganhoHora = scan.nextDouble();

		System.out.println("Quantas horas voce trabalha no mês: ");
		double horasTrabalhadas = scan.nextDouble();

		double salario = ganhoHora * horasTrabalhadas;
		
		System.out.println("Seu salário é: R$ " + salario);
	}
}
