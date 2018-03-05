package Capitulo4.ProgrammingExercises.ejercicio2;

public class Billing {
	public static double computeBill(double price) {
		double reallyPrice = (price * 0.08) + price;
		return reallyPrice;
	}

	public static double computeBill(double price, Integer cantidad) {
		double reallyPrice = (price * cantidad) + (((price * cantidad) * 0.08));
		return reallyPrice;
	}

	public static double computeBill(double price, Integer cantidad, double valorCupon) {
		double reallyPrice = (price * cantidad) - (((price * cantidad) * (valorCupon / 100)))
				+ (((price * cantidad) - (((price * cantidad) * (valorCupon / 100)))) * 0.08);
		return reallyPrice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 1000;
		Integer cantidad = 1;
		double valorCupon = 10;
		System.out.println( "Metodo1 : Precio obtenido= " + computeBill(price) );
		System.out.println( "Metodo2 : Precio obtenido= " + computeBill(price, cantidad) );
		System.out.println( "Metodo3 : Precio obtenido= " + computeBill(price, cantidad , valorCupon) );
	}

}
