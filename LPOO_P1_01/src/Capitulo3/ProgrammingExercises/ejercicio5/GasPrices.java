package Capitulo3.ProgrammingExercises.ejercicio5;

import java.util.Scanner;

public class GasPrices {
	private static void range(double x) {
		System.out.println(" El precio en la bomba esta entre $ "+ (x*0.035)+ " y $ "+(x*0.04));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("Ingrese el valor del pricePerBarrel: ");
		double pricePerBarrel= in.nextDouble();
		range(pricePerBarrel);
	}

}
