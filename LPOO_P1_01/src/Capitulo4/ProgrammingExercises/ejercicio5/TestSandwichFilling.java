package Capitulo4.ProgrammingExercises.ejercicio5;

public class TestSandwichFilling {

	public static void main(String[] args) {
		SandwichFilling sandwich1 = new SandwichFilling("milanesa y aderezo", 140);
		SandwichFilling sandwich2 = new SandwichFilling("carne y mayonesa", 230);
		SandwichFilling sandwich3 = new SandwichFilling("quesillo y aguacate", 90);

		System.out.println(sandwich1.getTypeFilling());
		System.out.println(sandwich1.getCalorias());

		System.out.println(sandwich2.getTypeFilling());
		System.out.println(sandwich2.getCalorias());

		System.out.println(sandwich3.getTypeFilling());
		System.out.println(sandwich3.getCalorias());

	}

}
