package sam;
import java.util.*;
public class Assignment9 {
	public static void main(String[] args){
		
	
		int[][] marks= {{10,20 ,30},{10 ,20 ,30},{10 ,20 ,30}};
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			for(int j=0;j<marks[i].length;j++) 
			{
				sum+=marks[i][j];
				
				
			}
		}
		int ts=marks[0][0]+marks[1][0]+marks[2][0];
		int ts1=marks[0][1]+marks[1][1]+marks[2][1];
		int ts2=marks[0][2]+marks[1][2]+marks[2][2];
		
		
		System.out.println("Total marks of all the students in all subjects:  "  +sum);
		System.out.println("Average marks of all the students in all subjects:  "  + sum/3);
        System.out.println("Total marks scored by students in subject A:  "  + ts); 
		System.out.println("Average marks scored by students in subject A:  "+ts/3);
		System.out.println("Total marks scored by students in subject B:  "+ ts1);
		System.out.println("Average marks scored by students in subject B:  "+ts1/3);
		System.out.println("Total marks scored by students in subject C:  "+ ts2);
		System.out.println("Average marks scored by students in subject C:  "+ts2/3);
		
		
		
	}	
}


