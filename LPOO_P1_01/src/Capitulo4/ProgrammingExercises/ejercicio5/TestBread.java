package Capitulo4.ProgrammingExercises.ejercicio5;

public class TestBread {

	public static void main(String[] args) {
		Bread bread1 = new Bread("cebolla", 50);
		Bread bread2 = new Bread("tomate", 30);
		Bread bread3 = new Bread("trigo", 60);

		System.out.println(bread1.getType());
		System.out.println(bread1.getCalories());
		System.out.println(bread1.getMessage());
		System.out.println(bread2.getType());
		System.out.println(bread2.getCalories());
		System.out.println(bread1.getMessage());
		System.out.println(bread3.getType());
		System.out.println(bread3.getCalories());
		System.out.println(bread1.getMessage());

	}

}
