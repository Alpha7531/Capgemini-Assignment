package OOPS_A2;


public class Assignment2Q1 {
	public static void main(String[] args)
	{
		//creating instancces
		//what if someone allows one instance in then the class is singleton
		SingletonInheritanceCheck obj1=SingletonInheritanceCheck.getSam();
		//even if creat new instance u will get the same instance no matter what
		//SingletonInheritanceCheck obj2=SingletonInheritanceCheck.getSam();
		//thats what it called singleton class.
		
	}
}
class SingletonInheritanceCheck
{
	//creating one instance
	static SingletonInheritanceCheck obj= new SingletonInheritanceCheck();
	
	
	//dont allow user to make default constructor
			//if you give default contructor then it will call the defaoult constructorwhich is by default public
		//put private
	private SingletonInheritanceCheck() {
		int a=25;
		int b=25;
	System.out.println("my name is:"+a*b);
	}
	public static SingletonInheritanceCheck getSam() //u can put any name after get<name>()
	{
		return obj;
	}
}