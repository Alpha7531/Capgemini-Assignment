package sam;
import java.util.*;

public class assignment3 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Principle Amount");
		double p=s.nextDouble();
		System.out.println("Enter the Annual rate");
		double r=s.nextDouble();
		System.out.println("Enter the Term of Loan,in Year");
		double n=s.nextDouble();
		System.out.println("Number of years interest is applied");
		double t=s.nextDouble();
		
		double simple_interest=(p*r*n)/100;
		double Compound_interest=(Math.pow((1-r),t))-p;
		System.out.println("Simple interest= "+ simple_interest);
		System.out.println("Compound interest= "+ Compound_interest);
		
		
		
	}

}
