package OOPS_A2;


abstract /*final/static*/ class Assignment2Q4
{
	abstract void demo();
}

class child extends Assignment2Q4
{
	void demo()
	{
		System.out.println("If you are Happy,you want some advantage and experience of hell then go for java 12 day course ");
	}
	abstract class ABSTRACT
	{
		void display()
		{
		System.out.println("display");
		}
		
	}

}
class ABTRACT1 {

	public static void main(String[] args) {
		
		Assignment2Q4 a1=new child();
		a1.demo();
		
	
	}
}

