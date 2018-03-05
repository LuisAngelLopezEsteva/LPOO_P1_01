package Capitulo3.ProgrammingExercises.ejercicio6;

import java.util.Scanner;

public class MetricConversion {
	private static void MetricConversion(Integer x) {
		System.out.println(x+" Pulgadas es igual a " + ((double)( 2.54 * x)) + " Centimetros");
	}
	private static void VolumenConversion(Integer x) {
		System.out.println(x+" Galones es igual a " + ((double)( 3.7854  * x)) + " Litros");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el valor a convertir : ");
		Integer x = input.nextInt();
		MetricConversion(x);
		VolumenConversion(x);
	}

}
