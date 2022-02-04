package sam;
import java.util.*;
public class Assignment5 {
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter CTC");
		double CTC=s.nextDouble();
		 String tax=((CTC<=18e4)? "NIll" :(CTC>181001 && CTC<3e5)? "10%" :(CTC>300001 && CTC<5e5)? "20%" : (CTC>500001 && CTC<1e6)?"30%" : null);
		 System.out.println("Tax Payable ="+ tax);
	}

}
