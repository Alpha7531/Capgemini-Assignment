package Generic;
import java.util.*;

class Info{
	 private int id;
	 private String name;
	 private int salary;
	 private String department;
		
		 //contructor
		public Info(int id,String name,int salary,String department)  {
			
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.department=department;
		}
		
		public String  DisplayDetails(){
			return "ID:"+id+"\n"+"Name"+name+"\n"+"Salary:"+salary+"\n"+"Department"+department+"\n";
			
		}
		
	}

public class employeemain {


	public static void main(String[] args) {
		Info a=new Info(123654," sam",30000,"mechatronic");
		Info b=new Info(123546," subhas",40000,"computer Science");
		
		
	    HashSet<Info> em=new HashSet<>();
		em.add(a);
		em.add(b);
		
		for(Info i:em) {
		System.out.println(i.DisplayDetails());
		
		}
	}
	
	

}