package sam;
import java.util.*;

public class Assignment {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the armstrong value=");
	int Num=s.nextInt();
			double rem,sum=0;
	int temp=Num;
			
			while (Num>0) {
				rem=Num%10;
				sum=sum+(rem*rem*rem);
				Num=Num/10;
				
			}
			if(sum==temp)
				{
				System.out.println(temp +" is arm");
				}
			else
				{
				System.out.println(temp +" not");
				}
}
}
