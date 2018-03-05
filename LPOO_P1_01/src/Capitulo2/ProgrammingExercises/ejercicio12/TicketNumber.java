package Capitulo2.ProgrammingExercises.ejercicio12;

import java.util.Scanner;

public class TicketNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("INgrese el codigo: ");
		String codigo = in.nextLine();
		int Intcodigo = Integer.parseInt(codigo.substring(0, codigo.length()-1));
		int ultDigito = Integer.parseInt(codigo.substring((codigo.length()-1)));
		int resto = Intcodigo%7;
		System.out.println(Intcodigo);
		System.out.println(resto);
		
		if(resto == ultDigito) {
			System.out.println("Ticket Valido");
		}else {
			System.out.println("Ticket Invalido");
		}
	}

}
