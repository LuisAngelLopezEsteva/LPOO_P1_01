package Capitulo4.ProgrammingExercises.ejercicio6;

public class TestCircle {

	public static void main(String[] args) {

		Circle circulo = new Circle();
		circulo.setRadius(13.5);
		Circle circulo2 = new Circle();
		circulo2.setRadius(20.5);
		Circle circulo3 = new Circle();

		System.out.println("El radio del circulo 1 es: " + circulo.getRadius());
		System.out.println("El radio del circulo 2 es: " + circulo2.getRadius());
		System.out.println("El radio del circulo 3 es: " + circulo3.getRadius());

	}

}
