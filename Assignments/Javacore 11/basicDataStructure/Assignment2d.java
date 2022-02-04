package sam;

public class Assignment2d {
public static void main(String[] args) {
	
			int num,temp,rem,sum=0;
			System.out.println("arm n f 100 t 999:");
	
	  for( num=100;num<1000;num++)
	  {
		   temp=num;
			while (temp>0) {
				rem=temp%10;
				sum=sum+(rem*rem*rem);
				temp=temp/10;
				
			}
			if(sum==num)
			{
			System.out.println(num +" ");
			}
		sum=0;
	  }
			
			
}
}
