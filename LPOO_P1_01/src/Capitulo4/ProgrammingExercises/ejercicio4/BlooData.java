package Capitulo4.ProgrammingExercises.ejercicio4;

public class BlooData {

	private String bloodType;
	private char factorRH;

	public BlooData() {
		this.bloodType = "O";
		this.factorRH = '+';
	}

	public BlooData(String bloodType, char factorRH) {
		this.bloodType = bloodType;
		this.factorRH = factorRH;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public char getFactorRH() {
		return factorRH;
	}

	public void setFactorRH(char factorRH) {
		this.factorRH = factorRH;
	}

}
