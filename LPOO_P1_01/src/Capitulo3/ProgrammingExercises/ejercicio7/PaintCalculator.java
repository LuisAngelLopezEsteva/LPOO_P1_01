package Capitulo3.ProgrammingExercises.ejercicio7;

import java.util.Scanner;

public class PaintCalculator {
	private static double calcularArea(double longitud, double ancho, double altura) {
		double areaParedGrande = longitud * altura;
		double areaParedChica = ancho * altura;
		double AreaTotal = (areaParedChica + areaParedGrande) * 2;
		
		return AreaTotal;
	}

	private static double calcularGalones(double AreaTotal) {
		double galones= AreaTotal/350;
		return galones;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese la longitud del cuarto: ");
		double longitud = in.nextDouble();
		System.out.println("Ingrese el ancho del cuarto: ");
		double ancho = in.nextDouble();
		System.out.println("Ingrese la altura del cuarto: ");
		double altura = in.nextDouble();

		double Area = calcularArea(longitud, ancho, altura);
		double galones =Math.ceil( calcularGalones(Area) );
		System.out.println("Galones necesario: ");
		System.out.println("La habitación de " + longitud + " por " + ancho + " pies con una altura de " + altura
				+ " pies cuesta $ " + (galones*32));

	}

}
