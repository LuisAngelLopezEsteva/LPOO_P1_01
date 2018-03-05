package Capitulo3.ProgrammingExercises.ejercicio13;

import java.util.Scanner;

public class TestBankAccount {

	public static BankAccount getData() {
		Integer accountNumber;
		String name;
		double accountBalance;
		Scanner input = new Scanner(System.in);
		BankAccount CuentaBancaria = new BankAccount();
		System.out.println("**************************************************");
		System.out.println("Ingrese el Numero Bancario :  ");
		accountNumber = input.nextInt();
		CuentaBancaria.setAccountNumber(accountNumber);

		System.out.println("Ingrese el nombre: ");
		input.nextLine();
		name = input.nextLine();
		CuentaBancaria.setName(name);

		System.out.println("Ingrese el saldo :");
		accountBalance = input.nextDouble();
		CuentaBancaria.setAccountBalance(accountBalance);
		System.out.println("**************************************************");
		return CuentaBancaria;
	}

	public static void showValues(BankAccount CuentaBancaria) {
		System.out.println("////////////////////////////////////////////////");
		System.out.println(CuentaBancaria.toString());
		System.out.println("////////////////////////////////////////////////");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount CuentaBancaria1 = getData();
		BankAccount CuentaBancaria2 = getData();
		BankAccount CuentaBancaria3 = getData();
		BankAccount CuentaBancaria4;

		showValues(CuentaBancaria1);
		showValues(CuentaBancaria2);
		showValues(CuentaBancaria3);
	}

}
