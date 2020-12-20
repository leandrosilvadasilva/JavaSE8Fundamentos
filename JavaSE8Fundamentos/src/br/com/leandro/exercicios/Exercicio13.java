package br.com.leandro.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		/*
		 * 13. Faça um Programa que pergunte quanto você ganha por hora e o número de
		 * horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido
		 * mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o
		 * INSS e 5% para o sindicato, faça um programa que nos dê: . salário bruto. 
		 * a. quanto pagou ao INSS. 
		 * b. quanto pagou ao sindicato. 
		 * c. o salário líquido. 
		 * d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Quanto voce ganha por hora: ");
		double ganhoHora = scan.nextDouble();

		System.out.println("Quantas horas voce trabalha no mês: ");
		double horasTrabalhadas = scan.nextDouble();

		double salario = ganhoHora * horasTrabalhadas;
		
		System.out.println("Seu salário bruto é: R$ " + salario);
		
		
		double salarioMenosIR = salario * 0.11;
		System.out.println("Valor pago ao IR: R$ " + salarioMenosIR);
		
		double salarioMenosINSS = salario * 0.08;// (salario / 100) * 8
		System.out.println("Valor pago ao INSS: R$ " + salarioMenosINSS);
		
		double salarioMenosSindicato = salario * 0.05;
		System.out.println("Valor pago ao sindicato: R$ " + salarioMenosSindicato);
		
		double descontos = salarioMenosSindicato + salarioMenosINSS
				+ salarioMenosIR;
		double salarioLiquido = salario - descontos;
		System.out.println("Valor do Salário Líquido: R$ " + salarioLiquido);
		
		
		double totalDescontos =  salarioMenosIR
				+ salarioMenosINSS
				+ salarioMenosSindicato;
		System.out.println("Total de descontos: " + totalDescontos);
	}

}
