package br.com.leandro.l08controles;

import java.util.Scanner;

public class ControleDeDecisaoSwitch {
	
	public static void main(String[] args) {
		
		//Entrar com o dia da semana e imprimir
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com dia da semana");
		int diaSemana = scan.nextInt();
		
		switch(diaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		default: System.out.println("N�o � um dia v�lido");
		}
	
		//verificar se dia �til
		switch(diaSemana) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println("E � dia �til");
			break;
		case 1:
		case 7:
			System.out.println("E � final de semana");
			break;
		default: System.out.println("N�o � um dia v�lido");
		}
	
	}

}
