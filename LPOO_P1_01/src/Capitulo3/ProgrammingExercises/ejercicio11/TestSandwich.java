package Capitulo3.ProgrammingExercises.ejercicio11;

public class TestSandwich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sandwich emparedado = new Sandwich();
		emparedado.setBreadType("trigo");
		emparedado.setMainIngredient("atun");
		emparedado.setPrice(4.99);
		String mainIngredient = emparedado.getMainIngredient(); 
		String breadType = emparedado.getBreadType();
		double price  = emparedado.getPrice(); 
		System.out.println( "Ingrediente principal: "+mainIngredient);
		System.out.println( "Tipo de pan: "+ breadType);
		System.out.println( "Precio :"+price);
	}

}
