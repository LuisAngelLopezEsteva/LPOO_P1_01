package Capitulo3.ProgrammingExercises.ejercicio12;

public class Student {
	private Integer ID;
	private Integer creditHoursEarned;
	private Integer pointsEarned;
	private double pointAverage;
	
	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getCreditHoursEarned() {
		return creditHoursEarned;
	}

	public void setCreditHoursEarned(Integer creditHoursEarned) {
		this.creditHoursEarned = creditHoursEarned;
	}

	public Integer getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(Integer pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public double getPointAverage() {
		return pointAverage;
	}

	public void setPointAverage() {
		this.pointAverage = (double)(pointsEarned / creditHoursEarned);
	}
//Borrar o cometar este constructor para ejecutar ShowStudent.java
	public Student(Integer iD, Integer creditHoursEarned, Integer pointsEarned) {

		this.ID = iD;
		this.creditHoursEarned = creditHoursEarned;
		this.pointsEarned = pointsEarned;
	}

	public Student(){
		
	}

}
