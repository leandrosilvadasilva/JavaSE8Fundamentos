package br.com.leandro.classe.loops;

public class ComandoDoWhile {

	public static void main(String[] args) {
		

		int i = 1;
		
		int max = 10;
		
		while (i <= max) {
			System.out.println("valor de i � " + i);
			i++;
		}
		System.out.println(i);
		do {
			i++;
			System.out.println("O valor de i " + i);
			
		}while(i < 15 );{
			System.out.println(i);
		}
		
	}
}
