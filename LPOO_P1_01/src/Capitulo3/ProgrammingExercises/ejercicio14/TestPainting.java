package Capitulo3.ProgrammingExercises.ejercicio14;

import java.util.Scanner;

public class TestPainting {
	public static Painting entradaDatos() {

		Scanner in = new Scanner(System.in);
		Painting pinta = new Painting(0);

		
		System.out.println("Ingrese el titulo: ");
		String title = in.nextLine();
		pinta.setTitle(title);

		System.out.println("Ingrese el nombre del Artista: ");
		String artist = in.nextLine();
		pinta.setArtist(artist);

		System.out.println("Ingrese el color : ");
		String medium = in.nextLine();
		pinta.setMedium(medium);

		System.out.println("Ingrese el precio: ");
		Integer price = in.nextInt();
		pinta.setPrice(price);	
		pinta.setGalleryCommission(price);
		return pinta;
	}
	
	public static void main(String[] args) {

		Painting pintar =  entradaDatos();
		Painting pintar2 = entradaDatos();
		Painting pintar3 = new Painting();
		System.out.println("**********************************************************************");
		System.out.println(pintar.toString());
		System.out.println("**********************************************************************");
		System.out.println(pintar2.toString());
		System.out.println("**********************************************************************");
		System.out.println(pintar3.toString());
		System.out.println("**********************************************************************");
		System.out.println("El campo de comisión de la galería se calcula como el 20 por ciento del precio cada vez que se establece el precio.");
		System.out.println("**********************************************************************");
	}
}
