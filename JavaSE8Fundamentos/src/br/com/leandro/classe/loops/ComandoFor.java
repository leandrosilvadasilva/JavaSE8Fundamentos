package br.com.leandro.classe.loops;


public class ComandoFor {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Valor de i:   " + i);
		}
		System.out.println();
		
		for (int i = 5; i > 0; i--) {
			System.out.println("Valor de i:   " + i);
		}
		System.out.println();
		
		
		for(int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i: " + i +  "; j: " + j );
		}
		System.out.println();
		
		for (int i = 0; i < 10; i+= 2) {
			System.out.println("Valor de i:   " + i);
		}
		
		System.out.println();
		
		int soma = 0;
		for (int i = 1; i < 5; soma += i++);
			System.out.println("Valor da soma é :   " + soma);
		
	}
}
