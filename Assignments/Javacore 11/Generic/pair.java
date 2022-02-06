package Generic;

public class pair<K,V> {
	K key;
	V value;
	public pair(K key,V value) {
		this.key=key;
		this.value=value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
public static void main(String[] args) {
	//Q1
	pair<String,String> a1=new pair<>("sam","1");
	System.out.println(a1.getKey()+" "+a1.getValue());
	//Q2
	pair<String,java.util.Date> a2=new pair<>("Today",new java.util.Date());
	System.out.println(a2.getKey()+" "+a2.getValue());
	
	
}
}
