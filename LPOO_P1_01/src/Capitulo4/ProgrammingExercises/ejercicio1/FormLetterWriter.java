package Capitulo4.ProgrammingExercises.ejercicio1;

public class FormLetterWriter {
	public static void displaySalutation(String lastName) {
		System.out.println("Dear Mr. " + lastName);
		System.out.println(
				"Me contacto con usted para anunciarle sobre la charla que se realizará el día 21 de junio de 2003, a las 15 hs. en nuestro auditórium, que brindará el reconocido autor de varios libros sobre managment, el señor Tom Peters.\n"
						+ "\n"
						+ "La charla consistirá en los siguientes tópicos: \"el saber escuchar\", \"escuchar no es oír\", \"¿en qué consiste escuchar?\" y \"saber escuchar = más productividad\".\n"
						+ "\n"
						+ "Esta invitación es sólo para nuestros más exclusivos clientes, es por ello, que esperamos contar con su presencia.\n"
						+ "\n" + "Saludo a usted atentamente\n" + "\n" + "");
	}

	public static void displaySalutation(String name, String lastName) {
		System.out.println("Dear " + name + " " + lastName);
		System.out.println(
				"Me contacto con usted para anunciarle sobre la charla que se realizará el día 21 de junio de 2003, a las 15 hs. en nuestro auditórium, que brindará el reconocido autor de varios libros sobre managment, el señor Tom Peters.\n"
						+ "\n"
						+ "La charla consistirá en los siguientes tópicos: \"el saber escuchar\", \"escuchar no es oír\", \"¿en qué consiste escuchar?\" y \"saber escuchar = más productividad\".\n"
						+ "\n"
						+ "Esta invitación es sólo para nuestros más exclusivos clientes, es por ello, que esperamos contar con su presencia.\n"
						+ "\n" + "Saludo a usted atentamente\n" + "\n" + "");
	}

	public static void main(String[] args) {
		String name = "Luis Angel ";
		String lastName = "Esteva";
		displaySalutation(lastName);
		System.out.println();
		displaySalutation(name, lastName);
	}

}
