package Capitulo2.ProgrammingExercises.ejercicio9;

import java.util.Scanner;

public class DogBoarding {
//	El Happy Yappy Kennel junta perros a un costo de 50 centavos 
//	por libra por día. Escriba una clase que acepte el 
//	peso de un perro y el número de días que debe abordarse y que 
//	muestre el precio total del embarque. Guarde la clase como DogBoarding.java.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float cost = 0.5F;
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese el peso de su perro en libras:  ");
		double peso = in.nextDouble();
		System.out.println("INgrese número de días que debe abordarse: ");
		int dias= in.nextInt();
		double costoTotal = (peso * cost) * dias;
		System.out.println("Precio Total : $ "+costoTotal );
	}

}
