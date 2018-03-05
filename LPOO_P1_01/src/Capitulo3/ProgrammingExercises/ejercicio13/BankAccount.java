package Capitulo3.ProgrammingExercises.ejercicio13;

public class BankAccount {
	private Integer accountNumber;
	private String name;
	private double accountBalance;
	
	
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", accountBalance=" + accountBalance
				+ "]";
	}

	public BankAccount(Integer accountNumber, String name, double accountBalance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.accountBalance = accountBalance;
	}

	public BankAccount() {
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public void deductMonthlyFee() {
		this.accountBalance = accountBalance -4;
	}
	public static void  explainAccountPolicy() {
		System.out.println(" la tarifa de servicio de $ 4 se deducirá cada mes.");
	}
}
