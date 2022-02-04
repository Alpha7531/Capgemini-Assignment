package Exception_Handling;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class IllegalBankTransactionException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalBankTransactionException(String message) {
		super(message);
	}
}

public class Assign3_Exception {
	double balance = 2000;

	void withdraw(double amount) throws InsufficientBalanceException {
		if (balance < amount) {
			throw new InsufficientBalanceException("Amount is greater than acc. balance");

		}
	}

	void deposit(double amount) throws IllegalBankTransactionException {
		if (amount < 0) {
			throw new IllegalBankTransactionException("Amount cannot be negative");
		}
	}

	public static void main(String[] args) throws InsufficientBalanceException, IllegalBankTransactionException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Assign3_Exception a = new Assign3_Exception();

		System.out.println("Enter amount to be withdraw");
		double amount = s.nextInt();
		a.withdraw(amount);
		a.deposit(amount);
		s.close();

	}

}