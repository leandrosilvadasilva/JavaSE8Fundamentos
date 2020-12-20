package br.com.leandro.controles;

import java.util.Scanner;

public class ControleDeDecisaoIf {

	public static void main(String[] args) {

		
		//Comando IF
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade");
		}else {
			System.out.println("É menor de idade");
		}
		
		//item barato <=10
		//10 > valor < 15 - desconto
		//15 <= valor 17 - pesquisar mais
		// > 17 - muito caro
		
		System.out.println("Entre com o valor do item: ");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("está barato, pode comprar");
			
		} else if(valor > 10 && valor < 15){
			System.out.println("Pode pedir um desconto");
		}else if(valor >= 15 && valor < 17) {
			System.out.println("Pesquisar mais.");
		}else {
			System.out.println("Item muito caro!");
		}
	}

}
