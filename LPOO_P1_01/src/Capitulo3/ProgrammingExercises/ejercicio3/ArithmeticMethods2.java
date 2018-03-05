package Capitulo3.ProgrammingExercises.ejercicio3;

import java.util.Scanner;

public class ArithmeticMethods2 {
	private static void displayNumberPlus10(Integer num1, Integer num2) {
		Integer resultado = num1 + num2 + 10;
		System.out.println("El resultado de la suma es: "+ resultado);
	}
	
	private static void displayNumberPlus100(Integer num1, Integer num2) {
		Integer resultado = num1 + num2 + 100;
		System.out.println("El resultado de la suma es: "+ resultado);
	}
	
	private static void displayNumberPlus1000(Integer num1, Integer num2) {
		Integer resultado = num1 + num2 + 1000;
		System.out.println("El resultado de la suma es: "+ resultado);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese dos numeros a sumar:  ");
		Integer num1 = input.nextInt();
		Integer num2 = input.nextInt();

		displayNumberPlus10(num1, num2);
		displayNumberPlus100(num1, num2);
		displayNumberPlus1000(num1, num2);
	}

}
