package Capitulo4.ProgrammingExercises.ejercicio5;

public class TestSandwich {

	public static void main(String[] args) {

		Bread bread = new Bread("cebolla", 100);
		SandwichFilling sandwichFill = new SandwichFilling("milanesa ensalada", 230);
		Sandwich sandwich = new Sandwich(bread, sandwichFill);

		System.out.println("Tipo de pan: " + sandwich.getBread().getType());
		System.out.println("Calorias por rebanada: " + sandwich.getBread().getCalories());
		System.out.println("Relleno de sandwich: " + sandwich.getSandwichFill().getTypeFilling());
		System.out.println("Calorias relleno: " + sandwich.getSandwichFill().getCalorias());
		int totalCalorias = (sandwich.getBread().getCalories() * Sandwich.NUM_SLIDE_SANDWICH)
				+ sandwich.getSandwichFill().getCalorias();
		System.out.println("Total de calorias en el sandwich: " + totalCalorias);

		Bread bread2 = new Bread("cebolla", 30);
		SandwichFilling sandwichFill2 = new SandwichFilling("Milanesa y aderezo", 400);
		Sandwich sandwich2 = new Sandwich(bread2, sandwichFill2);

		System.out.println("Tipo de pan: " + sandwich2.getBread().getType());
		System.out.println("Calorias por rebanada: " + sandwich2.getBread().getCalories());
		System.out.println("Relleno de sandwich: " + sandwich2.getSandwichFill().getTypeFilling());
		System.out.println("Calorias relleno: " + sandwich2.getSandwichFill().getCalorias());
		totalCalorias = (sandwich2.getBread().getCalories() * Sandwich.NUM_SLIDE_SANDWICH)
				+ sandwich2.getSandwichFill().getCalorias();
		System.out.println("Total de calorias en el sandwich: " + totalCalorias);

		Bread bread3 = new Bread("Trigo", 100);
		SandwichFilling sandwichFill3 = new SandwichFilling("milanesa", 500);
		Sandwich sandwich3 = new Sandwich(bread3, sandwichFill3);

		System.out.println("Tipo de pan: " + sandwich3.getBread().getType());
		System.out.println("Calorias por rebanada: " + sandwich3.getBread().getCalories());
		System.out.println("Relleno de sandwich: " + sandwich3.getSandwichFill().getTypeFilling());
		System.out.println("Calorias relleno: " + sandwich3.getSandwichFill().getCalorias());
		totalCalorias = (sandwich3.getBread().getCalories() * Sandwich.NUM_SLIDE_SANDWICH)
				+ sandwich3.getSandwichFill().getCalorias();
		System.out.println("Total de calorias en el sandwich: " + totalCalorias);

	}

}
