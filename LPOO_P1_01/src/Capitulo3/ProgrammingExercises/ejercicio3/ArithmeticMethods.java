package Capitulo3.ProgrammingExercises.ejercicio3;

public class ArithmeticMethods {
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
		Integer num1 = 15;
		Integer num2 = 25;


		displayNumberPlus10(num1, num2);
		displayNumberPlus100(num1, num2);
		displayNumberPlus1000(num1, num2);
	}

}
