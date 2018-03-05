package Capitulo3.ProgrammingExercises.ejercicio11;

import java.util.Scanner;

public class Sandwich {
	private static Scanner input = new Scanner(System.in);
	private String mainIngredient;
	private String breadType;
	private double price;

	public String getMainIngredient() {
		return mainIngredient;
	}

	public void setMainIngredient(String mainIngredient) {
		this.mainIngredient = mainIngredient;
	}

	public String getBreadType() {
		return breadType;
	}

	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
