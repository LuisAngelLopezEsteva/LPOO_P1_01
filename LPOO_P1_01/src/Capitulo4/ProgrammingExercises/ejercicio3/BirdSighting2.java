package Capitulo4.ProgrammingExercises.ejercicio3;

public class BirdSighting2 {

	private String birdSpecies;
	private int numberSeen;
	private int numerDay;

	public BirdSighting2(String birdSpecies, int numberSeen, int numerDay) {
		this.birdSpecies = birdSpecies;
		this.numberSeen = numberSeen;
		this.numerDay = numerDay;
	}

	public String getBirdSpecies() {
		return birdSpecies;
	}

	public void setBirdSpecies(String birdSpecies) {
		this.birdSpecies = birdSpecies;
	}

	public int getNumberSeen() {
		return numberSeen;
	}

	public void setNumberSeen(int numberSeen) {
		this.numberSeen = numberSeen;
	}

	public int getNumerDay() {
		return numerDay;
	}

	public void setNumerDay(int numerDay) {
		this.numerDay = numerDay;
	}

}