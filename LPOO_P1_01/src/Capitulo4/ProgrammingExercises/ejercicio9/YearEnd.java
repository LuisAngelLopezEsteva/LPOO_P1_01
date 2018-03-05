package Capitulo4.ProgrammingExercises.ejercicio9;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class YearEnd {
	
	public static void main(String[] args) {
		
		final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000;  
		Date hoy = new Date(); 
		     
		int año = 2018;
		int mes = 12;
		int dia = 31;
		
		Calendar calendar = new GregorianCalendar(año, mes-1, dia); 
		Date fecha = new java.sql.Date(calendar.getTimeInMillis());

		long diferencia = (  fecha.getTime()-hoy.getTime() )/MILLSECS_PER_DAY; 
		System.out.println("Dias que faltan para terminar el año 2018: "+diferencia);
	}

}
