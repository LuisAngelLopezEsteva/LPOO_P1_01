package Capitulo2.ProgrammingExercises.ejercicio11;

import java.util.Scanner;

public class FahrenheitToCelsius {
//	Escriba un programa que acepte una temperatura en Fahrenheit de un usuario y la convierta en Celsius 
//	restando 32 del valor de Fahrenheit y multiplicando el resultado por 5/9.
//	Muestra ambos valores. Guarde la clase como FahrenheitToCelsius.java.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("INgrese los grados Fahrenheit:  ");
		double Fahrenheit = input.nextDouble();
		System.out.println(Fahrenheit+"° Fahrenheit es igual a "+ ((double)(Fahrenheit-32)*5/9) + " ° Celcius");
	}

}
