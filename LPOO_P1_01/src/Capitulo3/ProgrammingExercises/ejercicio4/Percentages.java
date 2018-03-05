package Capitulo3.ProgrammingExercises.ejercicio4;

public class Percentages {
	private static void computePercent(double x, double y) {
		System.out.println(x + "  es " + (x * 100 / y) + " % de " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2;
		double b = 5;
		computePercent(a, b);
		computePercent(b, a);
	}

}
