package Capitulo3.ProgrammingExercises.ejercicio12;

public class ShowStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student estudiante = new Student(9999, 3, 12);
		estudiante.setPointAverage();
		System.out.println("ID: " + estudiante.getID());
		System.out.println("CreditHourEarned: " + estudiante.getCreditHoursEarned());
		System.out.println("PointEarned   :" + estudiante.getPointsEarned());
		System.out.println("Promedio   :" + estudiante.getPointAverage());
	}

}
