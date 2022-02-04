package String;

public class AssignmentString {
	public static void main(String[] args) {
		//..Assignments on String Class
		System.out.println("Assignments on String Class");
		//....(1)
		String str="Heloo World";
		
		System.out.println("1) lenght of the String:"+str.length());
		
		//....(2)
		String str1="Hello";
		String str2="How are you?";
		 System.out.println("2) "+str1+" "+str2);
		 
		 //...3)

		 String str3="Java String pool refers to collection of Strings which are stored in heap memory";
		//...a)
		 System.out.println("3/a) LowerCase:"+str3.toLowerCase());
		 // ...b)
		 System.out.println("3/b) UpperCase:"+str3.toUpperCase());
		//...c)
		 System.out.println("3/c) Replacing 'a' with '$':"+str3.replace("a","$"));
		 //...d)
		 System.out.println("3/c) Checking 'contain' word :"+str3.contains("collection"));
		 //...e)
		 System.out.println("3/d) comparing string with 'eqaul(object another) "+str3.equals("java string pool refers to collection of strings which are stored in heap memory"));
		 //...f)
		 System.out.println("3/d) comparing string with 'eqaulIgnoreCase() "+str3.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory"));
		
		
		 
		 //Assignments on StringBuffer Class\
		 System.out.println("Assignments on StringBuffer Class");
		 //...1)
		 StringBuffer str4=new StringBuffer("StringBuffer");
		 str4.append(" is a peer class of String");
		 str4.append(" that provides much of");
		 str4.append(" the functionality of strings");
		 System.out.println("1) "+str4);
		 //...2)
		 StringBuffer str5=new StringBuffer("It is used to at the specified index position");
		 str5.insert( 13," insert text");
		 System.out.println("2) "+str5);
		 //...3)
		 StringBuffer str6=new StringBuffer("This method returns the reversed object on which it was called");
		 str6.reverse();
		 System.out.println("3) "+str6);
		 
		 
		 
		 //Assignments on StringBuilder Class
		 System.out.println("Assignments on StringBuilder Class");
		//...1)
		 StringBuilder str7=new StringBuilder("StringBuffer");
		 str7.append(" is a peer class of String");
		 str7.append(" that provides much of");
		 str7.append(" the functionality of strings");
		 System.out.println("1) "+str7);
		 //...2)
		 StringBuilder str8=new StringBuilder("It is used to at the specified index position");
		 str8.insert( 13," insert text");
		 System.out.println("2) "+str8);
		 //...3)
		 StringBuilder str9=new StringBuilder("This method returns the reversed object on which it was called");
		 str9.reverse();
		 System.out.println("3) "+str9);
	}
	

}
