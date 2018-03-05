package Capitulo4.ProgrammingExercises.ejercicio5;

public class Sandwich {

	static final int NUM_SLIDE_SANDWICH = 2;

	private Bread bread;
	private SandwichFilling sandwichFill;

	public Sandwich(Bread bread, SandwichFilling sandwichFill) {

		this.bread = bread;
		this.sandwichFill = sandwichFill;

	}

	public Bread getBread() {
		return bread;
	}

	public SandwichFilling getSandwichFill() {
		return sandwichFill;
	}

}
