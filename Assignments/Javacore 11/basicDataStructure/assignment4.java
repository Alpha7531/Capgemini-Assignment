package sam;

import java.util.Scanner;

public class assignment4 {
 public static void main(String[] args){
	 Scanner s= new Scanner(System.in);
		System.out.println("Subject 1 =");
		double s1=s.nextDouble();
		System.out.println("Subject 2 =");
		double s2=s.nextDouble();
		System.out.println("Subject 3 =");
		double s3=s.nextDouble();
		String result = ((((s1>60 && s2+s3<60) || (s2>60 && s1+s3<60) ||(s3>60 && s1+s2<60))? "failed":(((s1+s2>60 && s3<60) || (s1+s3>60 && s2<60) ||(s2+s3>60 && s1<60)) ? "promoted" :(s1+s2+s3>60)?"passed" : "failed")));
	    System.out.println(result);
		
			
		}
}

