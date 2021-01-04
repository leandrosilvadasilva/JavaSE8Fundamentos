package br.com.leandro.l04operadores.aritimeticos;

public class OperadoresAritimeticos {
	public static void main(String[] args) {
		
		// + - * / % ++ --
		
		System.out.println( 4 % 3);
		
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado = resultado - 1;
		System.out.println(resultado);

		resultado = resultado * 2;
		System.out.println(resultado);

		resultado = resultado / 2;
		System.out.println(resultado);

		resultado = resultado + 8;
		System.out.println(resultado);

		resultado = resultado % 7;
		System.out.println(resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = " Uma String concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		// = ao ++
		resultado++;
		System.out.println(resultado);
		System.out.println(resultado++);
		System.out.println(++resultado);
		
		resultado--;
		System.out.println(resultado);
		System.out.println(resultado--);
		System.out.println(--resultado);

	}

}
