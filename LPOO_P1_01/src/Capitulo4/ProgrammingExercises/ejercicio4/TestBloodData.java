package Capitulo4.ProgrammingExercises.ejercicio4;

public class TestBloodData {

	public static void main(String[] args) {

		BlooData blood = new BlooData();
		System.out.println("Tipo de sangre: " + blood.getBloodType());
		System.out.println("Factor RH: " + blood.getFactorRH());

		BlooData blood2 = new BlooData("O", '-');
		System.out.println("Tipo de sangre: " + blood2.getBloodType());
		System.out.println("Factor RH: " + blood2.getFactorRH());

	}

}
