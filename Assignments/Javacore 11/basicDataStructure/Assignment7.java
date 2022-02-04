package sam;
import java.util.*;

public class Assignment7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the search value");
		int key=s.nextInt();
		
	
		int arr[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		Arrays.sort(arr);
		System.out.println(key + " found at index = "+ Arrays.binarySearch(arr, key));
		
	}
	

}
