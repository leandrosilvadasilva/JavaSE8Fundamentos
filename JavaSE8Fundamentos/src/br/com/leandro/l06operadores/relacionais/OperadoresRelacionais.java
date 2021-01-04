package br.com.leandro.l06operadores.relacionais;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		System.out.println();
		
		String primeiroNome = "leandro";
		String segundoNome = "silva";
		System.out.println(primeiroNome == segundoNome);
		
		if (primeiroNome != segundoNome) {
			System.out.println("diferente");
		}else {
		System.out.println("não é igual");
		}
		
		
		int valor1 = 1;
		int valor2 = 2;
		
		System.out.println("Valor1 == valor2: " + (valor1 == valor2));
		System.out.println("Valor1 != valor2: " + (valor1 != valor2));
		System.out.println("Valor1 > valor2: " + (valor1 > valor2));
		System.out.println("Valor1 >= valor2: " + (valor1 >= valor2));
		System.out.println("Valor1 < valor2: " + (valor1 < valor2));
		System.out.println("Valor1 <= valor2: " + (valor1 <= valor2));
		
	}

}
