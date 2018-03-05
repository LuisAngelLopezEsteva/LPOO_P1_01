package Capitulo2.CaseProblems.ejercicio1;

import java.util.Scanner;

public class CarlysEventPrice {

//	Carly's Catering ofrece comidas para fiestas y eventos especiales.
//	Escriba un programa que solicite al usuario la cantidad de invitados
//	que asistirán a un evento y luego calcule el precio total, que es
//	de $ 35 por persona. Muestre el lema de la compañía con el borde que
//	creó en la clase CarlysMotto2 en el Capítulo 1, y 
//	luego muestre el número de invitados, el precio por huésped y
//	el precio total. También muestre un mensaje que indique 
//	verdadero o falso según si el trabajo está clasificado como un evento grande: un evento con 50 o más invitados. 
//	Guarde el archivo como CarlysEventPrice.java.	public static void main(String[] args) {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	boolean x; 
		System.out.println("Introduzca cuantas personas asistiran: ");
		int invitados = in.nextInt();
		
		System.out.println("***********************************************");
		System.out.println("* Carly’s makes the food that makes it  party.* ");
		System.out.println("***********************************************");
		
		System.out.println("Cantidad de inviados: " +invitados);
		System.out.println("Precio por huesped  : $35");
		System.out.println("Precio total :   "+(invitados*35));
		if(invitados>=50) x =true;
		else x= false;
		
		System.out.println("Este evento esta claficado como GRANDE: "+x);
		
	}

}
