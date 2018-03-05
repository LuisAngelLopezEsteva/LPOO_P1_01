package Capitulo4.ProgrammingExercises.ejercicio4;

public class Patient {

	private int id;
	private int edad;
	private BlooData blood;

	public Patient() {
		this.edad = 0;
		this.id = 0;
		BlooData blood = new BlooData();
		blood.setBloodType("O");
		blood.setFactorRH('+');
		this.blood = blood;
	}

	public Patient(int id, int edad, BlooData blood) {
		this.edad = 0;
		this.id = 0;
		this.blood = blood;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public BlooData getBlood() {
		return blood;
	}

	public void setBlood(BlooData blood) {
		this.blood = blood;
	}

}
