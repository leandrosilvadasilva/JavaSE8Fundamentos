package br.com.leandro.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * 4. Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.
		 */
		// Farei com int nesse primeira vez.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota do primeiro bimestre: ");
		int nota1 = scan.nextInt();
		System.out.println("Nota do segundo bimestre: ");
		int nota2 = scan.nextInt();
		System.out.println("Nota do terceiro bimestre: ");
		int nota3 = scan.nextInt();
		System.out.println("Nota do quarto bimestre: ");
		int nota4 = scan.nextInt();
		
		int media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A m�dia das notas dos bimestres �: " + "\n" + media);
				
		
		// com double na m�dia 
		
		
		double media2 = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A m�dia das notas dos bimestres �: " + "\n" + media2);
		
		System.out.println("Nota do primeiro bimestre: ");
		double not1 = scan.nextInt();
		System.out.println("Nota do segundo bimestre: ");
		double not2 = scan.nextDouble();
		System.out.println("Nota do terceiro bimestre: ");
		double not3 = scan.nextDouble();
		System.out.println("Nota do quarto bimestre: ");
		double not4 = scan.nextDouble();
		
		double media3 = (not1 + not2 + not3 + not4) / 4;
		
		System.out.println("A m�dia das notas dos bimestres �: " + "\n" + media3);
				
	}
}
