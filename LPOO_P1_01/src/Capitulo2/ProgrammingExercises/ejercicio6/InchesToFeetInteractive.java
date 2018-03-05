package Capitulo2.ProgrammingExercises.ejercicio6;

import java.util.Scanner;

public class InchesToFeetInteractive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ingre la cantidad de puladas:  ");
		double pulgadas=  input.nextDouble();
		double pies=0.0833333;
		double resultado = ((pulgadas*pies)  )-((int)(pulgadas*pies))  ;
		System.out.println(pulgadas+" Pulgadas = "+((int)(pulgadas*pies)) + " y "+ Math.ceil(resultado /pies) +" Pulgadas");
	}
}
