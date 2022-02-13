package Java11;

import java.util.Scanner;

public class Assignment9Q1 {
	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		
		System.out.print("Principle:");
		 int c=b.nextInt();
		 System.out.print("Rate of Interest:");
		 int d=b.nextInt();
		 System.out.print("Time Period:");
		 int e=b.nextInt();
		 
		 SimpleInterest a=(int P,int R,int T)->P*R*T/100;
		 int obj=a.simple(c, d, e);
		 System.out.print("Simple Interest:"+obj);
	}

}
interface SimpleInterest{
	
	
	 int simple(int P,int R,int T);
}