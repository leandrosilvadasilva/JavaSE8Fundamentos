package br.com.leandro.l07exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/*
		 * 14. Faça um programa que peça o tamanho de um arquivo para download 
		 * (em MB) e
		 * a velocidade de um link de Internet 
		 * (em Mbps), 
		 * calcule e informe o 
		 * tempo aproximado de download do arquivo usando este link (em minutos).
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tamanho do arquivo (em MB): ");
		double tamanho = scan.nextDouble();
		
		System.out.println("Velocidade do link (em Mbps): ");
		double velocidade = scan.nextDouble();
		
		double tempo = tamanho / (velocidade/ 8);
		
		
		System.out.println("Tempo em segundos: " + tempo);
		
		double tempoMinutos = tempo / 60;
		System.out.println("Tempo em minutos: " + tempoMinutos);
			
	}
}
