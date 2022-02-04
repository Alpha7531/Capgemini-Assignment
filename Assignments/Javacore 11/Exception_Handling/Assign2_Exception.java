package Exception_Handling;


import java.util.Scanner;

public class Assign2_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a = s.nextInt();
		System.out.println("Enter 2nd number:");
		int b = s.nextInt();
		
		try {
			int divide = a / b;
			System.out.println("Output:"+divide);
		} 
		catch (ArithmeticException e) {
			System.out.println("UnsupportedOperationException");

		} 
		finally {
			s.close();
			}
	}

}