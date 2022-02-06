package Generic;
import java.util.HashMap;


public class Assignment2 {
	public static void main(String[] args) {
		//to creat new hashmap
		HashMap<Integer,Double> hash=new HashMap<>();
		//puting keys and values put(keys,values)
		hash.put(00,1.15);
		hash.put(10,2.14);
		hash.put(20,3.14);
		hash.put(30,4.14);
		hash.put(40,5.14);
		hash.put(50,6.14);
		hash.put(60,7.14);
		hash.put(70,8.14);
		hash.put(80,9.14);
		hash.put(90,10.14);
		//Now to get random value from HashMap
		//methode 1
		//for(Map.Entry ma:hash.entrySet()) {
	   // System.out.println(ma.getKey()+":"+ma.getValue());}
				
			
		//methode 2 to get random value from give list
		System.out.println(hash);
		System.out.println(hash.keySet()+"\n"+hash.values());
	 }
	 
}
