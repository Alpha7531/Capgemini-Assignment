package OOPS_A2;
import java.util.ArrayList;

/*class Employee{
	
}*/
class Manager extends Assignment2Q2
{ public int getSalary(int salary)
	{ int incentive =5000;
	int totals=incentive+salary;
	return totals;
	}}

class Labour extends Assignment2Q2
{
	public int getSalary(int salary)
	{ int overtime=500;
	int totals=salary+overtime;
		return totals;
	}
}
	

public class Assignment2Q2 {
	int salary = 10000;
    public int getSalary(int salary){
   	this.salary=salary;
   	return salary;
   }
  public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries)
   {
		int totals=0;
		for(int i:employeeSalaries)
		{
			totals+=i;
		}
		return totals;
   }
	public static void main(String[] args) {
		
		Assignment2Q2 a=new Assignment2Q2 ();
		Manager m=new Manager();
		int ms=m.getSalary(a.salary);
		Labour l=new Labour();
		int ls=l.getSalary(a.salary);
		ArrayList<Integer> employeesalariesList=new ArrayList<>();
		employeesalariesList.add(ms);
		employeesalariesList.add(ls);
		int total=a.totalEmployeesSalary(employeesalariesList);
		System.out.println(total);
	}

}
