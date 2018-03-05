package Capitulo2.ProgrammingExercises.ejercicio10;

import java.util.Scanner;

public class Dollars {
//	Escriba una clase que calcule y muestre la conversión de
	//un número de dólares ingresado en denominaciones de moneda: 20, 10, 5 y 1. 
	//Guarde la clase como Dollars.java.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese una cantidad de dolares sin centavos :");
		int ingreso = in.nextInt();
		int moneda20 = (int)(ingreso/20);
		int moneda10 = (int) ( (ingreso%20) /10);
		int moneda5  = (int)(( (ingreso%20) %10) /5 );
		int moneda1  = (int)(( (ingreso%20) %10) %5 );
		System.out.println("Conversion\n");
		System.out.println("Cantidad de Monedas de 20 :" + moneda20);
		System.out.println("Cantidad de Monedas de 10 :" + moneda10);
		System.out.println("Cantidad de Monedas de 5  :" + moneda5);
		System.out.println("Cantidad de Monedas de 1  :" + moneda1);
		
	}

}
