package br.com.leandro.controles.exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {

		/*
		 * 5. Fa�a um programa para a leitura de duas notas parciais de um aluno. 
		 * O programa deve calcular a m�dia alcan�ada por aluno e apresentar: 
		 * o A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete; 
		 * o A mensagem "Reprovado", se a m�dia for menor do que sete; 
		 * o A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a primeira nota do aluno: ");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota do aluno: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7 && media < 10) {
			System.out.println("Aluno APROVADO");
		} else if(media < 7){
			System.out.println("Aluno REPROVADO");
		}else {
			System.out.println("Aluno APROVADO COM DISTIN��O");
		}
		scan.close();
	}
}
