package Capitulo3.ProgrammingExercises.ejercicio12;

public class ShowStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student estudiante = new Student();
		estudiante.setID(123456);
		estudiante.setCreditHoursEarned(8);
		estudiante.setPointsEarned(80);
		estudiante.setPointAverage();
		
		Integer ID = estudiante.getID();
		Integer CreditHourEarned = estudiante.getCreditHoursEarned();
		Integer PointEarned = estudiante.getPointsEarned();
		double Promedio = estudiante.getPointAverage();
		
		System.out.println("ID: " + ID);
		System.out.println("CreditHourEarned: " + CreditHourEarned);
		System.out.println("PointEarned   :" + PointEarned);
		System.out.println("Promedio   :" + Promedio);
	}

}
