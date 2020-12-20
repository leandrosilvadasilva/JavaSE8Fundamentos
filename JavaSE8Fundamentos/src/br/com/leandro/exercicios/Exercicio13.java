package br.com.leandro.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/*
		 * 13. Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de
		 * horas trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido
		 * m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda, 8% para o
		 * INSS e 5% para o sindicato, fa�a um programa que nos d�: . sal�rio bruto. 
		 * a. quanto pagou ao INSS. 
		 * b. quanto pagou ao sindicato. 
		 * c. o sal�rio l�quido. 
		 * d. calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Quanto voce ganha por hora: ");
		double ganhoHora = scan.nextDouble();

		System.out.println("Quantas horas voce trabalha no m�s: ");
		double horasTrabalhadas = scan.nextDouble();

		double salario = ganhoHora * horasTrabalhadas;
		
		System.out.println("Seu sal�rio bruto �: R$ " + salario);
		
		
		double salarioMenosIR = salario * 0.11;
		System.out.println("Valor pago ao IR: R$ " + salarioMenosIR);
		
		double salarioMenosINSS = salario * 0.08;// (salario / 100) * 8
		System.out.println("Valor pago ao INSS: R$ " + salarioMenosINSS);
		
		double salarioMenosSindicato = salario * 0.05;
		System.out.println("Valor pago ao sindicato: R$ " + salarioMenosSindicato);
		
		double descontos = salarioMenosSindicato + salarioMenosINSS
				+ salarioMenosIR;
		double salarioLiquido = salario - descontos;
		System.out.println("Valor do Sal�rio L�quido: R$ " + salarioLiquido);
		
		
		double totalDescontos =  salarioMenosIR
				+ salarioMenosINSS
				+ salarioMenosSindicato;
		System.out.println("Total de descontos: " + totalDescontos);
	}

}
