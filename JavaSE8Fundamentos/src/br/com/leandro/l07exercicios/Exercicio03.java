package br.com.leandro.l07exercicios;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * 3. Fa�a um Programa que pe�a dois n�meros e imprima a soma.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite dois n�meros (dando enter a cada)");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("A soma dos n�mreos �: " + soma);
		

	}
}
