package Capitulo4.ProgrammingExercises.ejercicio4;

public class TestPatient {
	
	public static void main(String[] args) {
		
		Patient patient1 = new Patient();
		System.out.println(patient1.getEdad());
		System.out.println(patient1.getId());
		System.out.println(patient1.getBlood().getBloodType());
		System.out.println(patient1.getBlood().getFactorRH());
		
		
		BlooData blood = new BlooData();
		blood.setBloodType("O");
		blood.setFactorRH('-');
		
		Patient patient2 = new Patient(1,20,blood);
		System.out.println(patient2.getEdad());
		System.out.println(patient2.getId());
		System.out.println(patient2.getBlood().getBloodType());
		System.out.println(patient2.getBlood().getFactorRH());
		
	}

}
