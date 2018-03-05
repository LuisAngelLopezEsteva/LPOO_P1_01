package Capitulo2.ProgrammingExercises.ejercicio6;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pulgadas=86;
		double pies=0.0833333;
		double resultado = ((pulgadas*pies)  )-((int)(pulgadas*pies))  ;
		System.out.println(pulgadas+" Pulgadas = "+((int)(pulgadas*pies)) + " y "+ Math.ceil(resultado /pies) +" Pulgadas");
	}

}
