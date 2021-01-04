package br.com.leandro.l03classe.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class EstudoApiDocs {

	public static void main(String[] args) throws FileNotFoundException {
//		Estudo da classe pelo docs do java
		// https://docs.oracle.com/javase/8/docs/api/

		
		Scanner scan = new Scanner(System.in);	
		
		// atribuições feitas a partir de um arquivo
		
//		Scanner sc = new Scanner(new File("myNumbers"));
//		
//		while (sc.hasNextLong()) {
//
//			long along = sc.nextLong();
//		}
		
		// lendo vários itens de uma String
		
		String input  = "1 outro  2 outro red outro blue outro";
		Scanner scanner =  new Scanner(input).useDelimiter("\\s*outro\\s*");
		System.out.println(scanner.nextInt());
		System.out.println(scanner.nextInt());
		System.out.println(scanner.next());
		System.out.println(scanner.next());
		scanner.close();
	// Usando expressões regulares para ler todos os tokens
		

			String input3 = "1 outro 2 outro red outro blue outro";
		     Scanner s = new Scanner(input3);
		     s.findInLine("(\\d+) outro (\\d+) outro (\\w+) outro (\\w+)");
		     MatchResult result2 = s.match();
		     for (int i=1; i<=result2.groupCount(); i++)
		         System.out.println(result2.group(i));
		     s.close();		
	
	}

}
