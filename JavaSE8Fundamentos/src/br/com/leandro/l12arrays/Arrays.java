package br.com.leandro.l12arrays;

import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) {

		double temp001 = 31.3;
		double temp002 = 32;
		double temp003 = 33.;
		double temp004 = 34.3;
		double temp005 = 28.3;
		
		//utlizar vetor
		double[] temperaturas = new double[365];
		
		
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 30;
		temperaturas[2] = 30.3;
		temperaturas[3] = 28.7;
		temperaturas[4] = 29;
		
		System.out.println("A temperatura do dia 1: " + temperaturas[0]);
	
		//saber quantas posições tem o array
		
		System.out.println("O tamanho do array é: " + temperaturas.length);
		
		//Imprimir tods valores
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Dias " + (i+1) + "temp: " + temperaturas[i]);
		}
		for (double d : temperaturas) {
			System.out.println(d);
		}
	}

}
