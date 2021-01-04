package br.com.leandro.l05operadores.logicos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		// & | ^ || && !
		//Tabela Verdade
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println("Valor1 é 1 AND valor2 é 2 - resultado: " + resultado1);
		
		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println("Valor1 é 1 OR valor2 é 2 - resultado: " + resultado2);
		
		boolean resultado3 = (valor1 == 1) && (valor2 == 2);
		System.out.println("Valor1 é 1 valor2 é 2 - resultado: " + resultado3);
		
		boolean resultado4 = (valor1 == 1) && (valor2 == 2);
		System.out.println("Valor1 é 1 valor2 é 2 - resultado: " + resultado4);
		
		boolean resultado5 = (valor1 == 1) && (valor2 == 2);
		System.out.println("Valor1 é 1 valor2 é 2 - resultado: " + resultado5);
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro && falso);
		
		//
		
	}
}
