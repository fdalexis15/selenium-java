package com.java;

import org.apache.poi.ss.formula.eval.ConcatEval;

public class DatatTypes {

	public static void main(String[] args) {

		// Datos primitivos
		byte var1 = 1; // Numerico entero
		Short var2 = 1; // Numerico entero
		int var3 = 0; // Numerico entero - automatizacion
		long var4 = 1L; // Numerico entero - automatizacion
		float var5 = 1.2F; // Numerico real
		double var6 = 1.2; // Numerico real - automatizacion
		char var7 = 'a'; // Caracter
		boolean var8 = true; //

		// declarar variables
		int x;
		x = 1;
		int y = 10;

		// Char symbol example
		char symbol = '\u00A9';

		// Cadena de char
		String mesage = "Hola ";

		// Imprimir en consola
		System.out.println(symbol);
		System.out.println(mesage);

		// concatenar variables se representa con el signo +
		System.out.println(mesage + " " + symbol);

		int numero = 1;
		String nombre = "Alexis";

		System.out.println(nombre + numero);
		

	}

}
