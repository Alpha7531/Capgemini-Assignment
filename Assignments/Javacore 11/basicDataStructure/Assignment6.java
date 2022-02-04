package sam;
import java.util.*;
public class Assignment6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Username and Password");
		
		String A1="Samuel";
		String B1="1234asdf";
		
		int a=0;
			for(int n=1;n<=3;n++) {
				System.out.println("Username:");
				String Username=s.nextLine();
				System.out.println("Password:");
				String Password=s.nextLine();
				if ((A1.equals(Username))== true &&(B1.equals(Password))==true) 
				{
					System.out.println("Welcome" + Username);
					break;
					}
				
				a++;
				System.out.println("Invalid password and Username");
				
				}
			if(a==3) {
				System.out.println("You reach 3 try");
				System.out.println("Please Conatact Authority");
		}
			
	}
}
	

		
		
		
		
		
