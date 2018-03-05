package Capitulo3.ProgrammingExercises.ejercicio8;

import java.util.Scanner;

public class Insurance {
	private static void calcularPrima(int actual, int nacimiento) {
		int aniosVida = actual - nacimiento;
		int decadas = ((int)aniosVida)/10;
		int prima = (decadas+15)*20;
		System.out.println("La prima es igual a : " + prima);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el anio actual : ");
		int anioActual = in.nextInt();
		System.out.println("Ingrese el anio de su nacimiento");
		int anioNacimiento = in.nextInt();
		
		calcularPrima(anioActual, anioNacimiento);
	}

}
