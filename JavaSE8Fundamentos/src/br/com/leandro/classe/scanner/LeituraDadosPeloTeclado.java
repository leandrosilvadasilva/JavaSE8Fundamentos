package br.com.leandro.classe.scanner;

import java.util.Scanner;

public class LeituraDadosPeloTeclado {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		//Ler uma linha inteira
		
		System.out.println("Digite nome completo: ");
		String nomeCompleto = scan.nextLine();
		
		System.out.println("seu nome: "  + nomeCompleto );
		
		
		// Ler um inteiro
		
		System.out.println("Digite a idade: " );
		int idade = scan.nextInt();
		System.out.println("Sua idade: " + idade );
		
	
		
	}

}
