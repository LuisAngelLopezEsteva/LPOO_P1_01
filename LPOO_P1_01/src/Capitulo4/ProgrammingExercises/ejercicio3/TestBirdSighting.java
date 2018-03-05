package Capitulo4.ProgrammingExercises.ejercicio3;

public class TestBirdSighting {

	public static void main(String[] args) {

		BirdSighting bird = new BirdSighting();
		System.out.println("Especie: " + bird.getBirdSpecies());
		System.out.println("Numero de vistas: " + bird.getNumberSeen());
		System.out.println("Numero de día: " + bird.getNumerDay());

		BirdSighting bird2 = new BirdSighting("Nico", 10, 24);
		System.out.println("Especie: " + bird2.getBirdSpecies());
		System.out.println("Numero de vistas: " + bird2.getNumberSeen());
		System.out.println("Numero de día: " + bird2.getNumerDay());
	}

}
