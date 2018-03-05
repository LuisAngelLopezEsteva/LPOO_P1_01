package Capitulo4.ProgrammingExercises.ejercicio8;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class NextMonth {
	
	public static void main(String[] args) {
		
		final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000; //Milisegundos al día 
		Date hoy = new Date(); //Fecha de hoy 
		     
		int año = 2018;
		int mes = 3;
		int dia = 1;
		
		Calendar calendar = new GregorianCalendar(año, mes-1, dia); 
		Date fecha = new java.sql.Date(calendar.getTimeInMillis());

		long diferencia = (  fecha.getTime()-hoy.getTime() )/MILLSECS_PER_DAY; 
		System.out.println("Dias que faltan para iniciar el siguiente mes: "+diferencia);
		
	}

}
