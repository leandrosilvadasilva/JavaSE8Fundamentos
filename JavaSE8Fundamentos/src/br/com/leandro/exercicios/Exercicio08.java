package br.com.leandro.exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		/*
		 * 8. Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de
		 * horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido
		 * m�s.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Quanto voce ganha por hora: ");
		double ganhoHora = scan.nextDouble();

		System.out.println("Quantas horas voce trabalha no m�s: ");
		double horasTrabalhadas = scan.nextDouble();

		double salario = ganhoHora * horasTrabalhadas;
		
		System.out.println("Seu sal�rio �: R$ " + salario);
	}
}
