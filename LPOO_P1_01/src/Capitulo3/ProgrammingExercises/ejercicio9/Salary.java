package Capitulo3.ProgrammingExercises.ejercicio9;

import java.util.Scanner;

public class Salary {
		private static double calcularSalario(int SalarioHora, int horasRegulares, int horasExtras) {
			double pago = (horasRegulares * SalarioHora) + (horasExtras * SalarioHora * 1.5);
			return pago;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el salio por hora : ");
		int salarioporhora = input.nextInt();
		System.out.println("Ingrese la cantidad de horas regulares trabajadas esta semana: ");
		int horasRegulares = input.nextInt();
		System.out.println("Ingrese la cantidad de horas Extras trabajadas esta semana: ");
		int horasExtras= input.nextInt();
		double pago = calcularSalario(salarioporhora, horasRegulares, horasExtras);
		System.out.println("El pago por sus servicios es de : $ "+pago);
		
		
	}

}
