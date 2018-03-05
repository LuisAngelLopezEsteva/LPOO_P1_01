package Capitulo2.CaseProblems.ejercicio2;

import java.util.Scanner;

public class SammysRentalPrice {
//	Sammy's Seashore Supplies alquila equipos de playa como kayaks, canoas, sillas de playa y
	//sombrillas para los turistas. Escriba un programa que le indique al usuario la cantidad 
	//de minutos que alquiló una pieza de equipo deportivo. 
	//Calcule el costo del alquiler en $ 40 por hora más $ 1 por minuto adicional. 
	//(Es posible que haya pensado ya que esta tasa tiene un error lógico, pero por ahora, 
	//calcule las tasas como se describe aquí. Puede solucionar el problema después de leer el 
	//capítulo sobre toma de decisiones.) Muestre el lema de Sammy con el borde que creó en el 
	//Clase SammysMotto2 en el Capítulo 1. A continuación, muestra las horas, los minutos y el 
	//precio total. Guarde el archivo como SammysRentalPrice.java.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de minutos que uso el equipo  :");
		Integer minutos = input.nextInt();
		final int costoAlquiler = 40;
		int costoTotal = ( ((int)(minutos/60)) *costoAlquiler) + (minutos%60);
		System.out.println();
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
		System.out.println("Ss Sammy’s makes it fun in the sun. Ss");
		System.out.println("SsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSsSs");
			System.out.println("Costo Total: "+ costoTotal);
	}

}
