package OOPS_A2;

abstract class Persistence {
    abstract public String persist();
}

class FilePersistence extends Persistence{
   
    public String persist()
    {
    	String a="File";
    			return a;
    }
}
class DatabasePersistence extends Persistence{
    
    public String persist() 
    {
    	String b="Database";
    			return b;
    }
}
class client{
	Persistence p1=new FilePersistence();
	String f=p1.persist();
	Persistence p2=new DatabasePersistence();
	String g=p2.persist();
}

public class Assignment2Q6 {
    public static void main(String[] args) 
    {
   client cc=new client();
   System.out.println(cc.g);
    }
}

