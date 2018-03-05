package Capitulo2.ProgrammingExercises.ejercicio8;

import java.util.Scanner;

public class Eggs {

//	Meadowdale Dairy Farm vende huevos marrones orgánicos a los clientes locales.
//	Cobran $ 3.25 por una docena de huevos, o 45 centavos por huevos individuales
//	que no son parte de una docena. Escriba una clase que le solicite al usuario 
//	el número de huevos en el pedido y luego muestre la cantidad adeudada con una 
//	explicación completa. Por ejemplo, la salida típica podría ser, 
//	"ordenó 27 huevos. Eso es 2 docenas a $ 3.25 por docena y  3 huevos sueltos a 45.0 centavos cada uno para un total de $ 7.85. "
//	Guarde la clase como Eggs.java.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese cantidad de huevos: ");
		int cantHuevos = in.nextInt();
		System.out.println("ordenó " +cantHuevos + " huevos. Eso es "+Math.floor(cantHuevos/12) + " docenas a $ 3.25 por docena y  "
				+ (cantHuevos%12) +" huevos sueltos a 45.0 centavos cada uno \npara un total de $ "+ ((double)((Math.floor(cantHuevos/12) *3.25) ) + (((cantHuevos%12) * 0.45)) ));
		
	}

}
