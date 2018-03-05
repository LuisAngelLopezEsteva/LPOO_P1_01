package Capitulo4.ProgrammingExercises.ejercicio3;

public class TestBirdSighting2 {

	public static void main(String[] args) {

		BirdSighting2 bird2 = new BirdSighting2("Nico", 10, 24);
		System.out.println("Especie: " + bird2.getBirdSpecies());
		System.out.println("Numero de vistas: " + bird2.getNumberSeen());
		System.out.println("Numero de día: " + bird2.getNumerDay());
	}

}
