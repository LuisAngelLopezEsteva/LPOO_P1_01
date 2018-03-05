package Capitulo2.ProgrammingExercises.ejercicio4;

import java.util.Scanner;

public class MilesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final int miletofeet = 5280;
		System.out.println("INgrese la distancia en millas:  ");
		double distancia = input.nextDouble() ;
		// TODO Auto-generated method stub
		System.out.println("La distancia hasta la casa de mi tío es de " + distancia + " millas o "
				+ (distancia * miletofeet) + " pies. ");
	}

}
