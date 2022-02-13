package collection;
import collection.Contact.Gender;
import java.util.Map.Entry;
import java.util.*;
class Contact
{
	//instance variable
		String Name;
		long PhoneNumber;
		String Email;
		enum Gender{
			Male,Female;
		}
		Gender gender;
		
		
		//constructor
		public Contact(String Name,String Email,Gender gender)
		{
			this.Name=Name;
			//this.PhoneNumber=PhoneNumber;
			this.Email=Email;
			this.gender=gender;
		}
		
		
		
		//methode
		long phone(long PhoneNumber){
			this.PhoneNumber=PhoneNumber;
			return PhoneNumber;
		}
		
		
	}
public class Assignment6Q1 {
	public static void main(String[] args) {
		Gender M=Gender.Male;
		Gender F=Gender.Female;
		//Object for treeMap
		TreeMap<Long,Contact> n1=new TreeMap<>();
		
		//Object for Contact class
		Contact c1=new Contact("Sudhnit","sudhnit@gmail.com",F);
		Contact c2=new Contact("Subhas","subhas@gmail.com",M);
		Contact c3=new Contact("Sanket","sanket@gmail.com",M);
		
		//adding phonnumber to list + calling "c"
		n1.put(c1.phone(74356879),c1);
		n1.put(c2.phone(65458548),c2);
		n1.put(c3.phone(49548438),c3);
		
		//get all entries
		Set<Map.Entry<Long,Contact> > en=n1.descendingMap().entrySet();
        
		//printing keys and values using for loop
		for(Map.Entry<Long,Contact> m:en)
		{
			Long key=m.getKey();
			Contact v=m.getValue();
			 System.out.println(key+" "+v.Name+" "+v.Email+" "+v.gender);  
		}
		

	/*	for(Entry<Long, Contact> entry:n1.descendingMap().entrySet()){    
		    Long key=entry.getKey();  
		    Contact v=entry.getValue();  
		    
		    System.out.println(key+" "+v.Name+" "+v.Email+" "+v.gender);   
		}
		*/
		}
		
	}
	

	
	
	
	
	
	
	
	
	
	
