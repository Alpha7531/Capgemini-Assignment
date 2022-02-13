package io.Junit;


@SuppressWarnings("serial")
class  InsufficientFundsExpcetion extends Exception{
	

	public  InsufficientFundsExpcetion(String massage)
	{
		super(massage);
	}
}
public class BankAccount {
	int balance=20000;
	 public void withdraw(int amount) throws InsufficientFundsExpcetion  {
		 if (balance>amount) {
			 System.out.println("thank you for waiting");
		 }
		if (balance<amount) {
			System.out.println("insufficient balance");
			throw new  InsufficientFundsExpcetion("Insufficient ammount");
			
		}
		
	}

}
