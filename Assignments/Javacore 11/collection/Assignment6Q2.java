package collection;
import java.util.HashSet;
import java.util.Iterator;

public class Assignment6Q2 {
	public static void main(String[] args) {
		//to creat new hashSet
		HashSet<String> h=new HashSet<>();
		 //adding 
		h.add("Apple");
		h.add("Guava");
		h.add("PineApple");
		h.add("Apple");
		h.add("Guava");
		h.add("BlueBerry");
		h.add("Cerry");
		h.add("Dandelines");
		h.add("Apricon");
		h.add("Berry");
		
	Iterator<String> i=h.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
		
	 
}
}