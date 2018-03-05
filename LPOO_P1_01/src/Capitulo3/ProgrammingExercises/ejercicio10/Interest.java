package Capitulo3.ProgrammingExercises.ejercicio10;

import java.util.Scanner;

public class Interest {
		
	private static Scanner input = new Scanner(System.in);;
	
	public static double getInversion() {
	double inversion;
	System.out.println("Ingrese el monto de inversion: ");
	inversion = input.nextDouble();
	return inversion;
	}
	
	public static double resultado(double inversion) {
		double result = inversion * 1.05;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inversion = getInversion();
		double resultadoo = resultado( inversion );
			System.out.println("El monto con ganancias es de :"+ resultadoo);
		
	}

}
