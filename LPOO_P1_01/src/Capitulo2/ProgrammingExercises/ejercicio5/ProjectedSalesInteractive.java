package Capitulo2.ProgrammingExercises.ejercicio5;

import java.util.Scanner;

public class ProjectedSalesInteractive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double incremento = 1.1;
		System.out.println("Ingrese la renumeracion monetaria por las ventas del Norte ");
		double norte= input.nextDouble();
		System.out.println("Ingrese la renumeracion monetaria por las ventas del Sur ");
		double sur= input.nextDouble();
		
		System.out.println("las ventas proyectadas del próximo año para división Norte: "+ (norte*incremento));
		System.out.println("las ventas proyectadas del próximo año para división Sur:  "+(sur*incremento));
	
	}

}
