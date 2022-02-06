package Generic;
import java.util.*;
public class Assignment5Q3 {
	public static <T> void swap(T[] a, int i,int j) {
		T temp=a[i]; //c=a
	    a[i]=a[j];   //a=b
        a[j]=temp;   //b=c 
        
	}  
	public static void main(String[] args) {
		
		
		Integer a[]= {4,5};
		System.out.println("before: "+Arrays.toString(a));
		
		swap(a,0,1);
		System.out.println("after: "+Arrays.toString(a));
		//for(Integer b:a) {
			//System.out.println(b);
		//}
		
				}
		
	}


