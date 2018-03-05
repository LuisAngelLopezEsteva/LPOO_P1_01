package Capitulo3.ProgrammingExercises.ejercicio4;

import java.util.Scanner;

public class Percentages2 {

	private static void computePercent(double x, double y) {
		System.out.println(x + "  es " + (x * 100 / y) + " % de " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca dos valores para proporcionj respecto a al otro:   ");
		
		double a = new Scanner(System.in).nextDouble();
		double b = new Scanner(System.in).nextDouble();
		computePercent(a, b);
		computePercent(b, a);
	}

}
