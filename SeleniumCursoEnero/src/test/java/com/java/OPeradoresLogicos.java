package com.java;

public class OPeradoresLogicos {

	public static void main(String[] args) {

		// * OPERADORES *

		// Operador Aritmetico
		int x = 2;
		int y = 2;

		int suma = x + y;
		int resta = x - y;
		int multi = x * y;
		int division = x / y;

		System.out.println("La suma es " + suma);
		System.out.println("La rest es " + resta);
		System.out.println("La multi es " + multi);
		System.out.println("La division es " + division);

		double z = 2.23;
		double a = 4.34;

		double multi2 = a * z;
		System.out.println("El valor double es " + multi2);

		// Operador Unario
		int unario = 2;
		unario--;
		System.out.println(unario);

//		 Operadopres relacionales
//		 Igual que ==
//		 Diferente a !=
//		 Mayor que   >
//		 Mayor o igua que >=
//		 Menor que <
//		 Menor igual que <=   

		int or = 2;
		int or2 = 3;

		if (or != or2) {
			System.out.println("True");

		} else {
			System.out.println("False");
		}

		String msg = "Hello";
		String msg2 = "Hello";

		if (msg == msg2) {
			System.out.println("String True");

		} else {
			System.out.println("String False");
		}

		// Operadores condicionales
//		AND  &&
//		OR  ||

		int oper1 = 2;
		int oper2 = 2;
		int oper3 = 4;
		int oper4 = 3;

		if (oper1 == oper2 && oper3 == oper4) {
			System.out.println("AND TODOS LOS VALORES SON IGUALES");
		} else {
			System.out.println("AND algun valor es diferente");
		}

		if (oper1 == oper2 || oper3 == oper4) {
			System.out.println("OR TODOS LOS VALORES SON IGUALES");
		} else {
			System.out.println("OR algun valor es diferente");
		}

	}

}
