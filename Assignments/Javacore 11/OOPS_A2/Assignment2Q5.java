package OOPS_A2;


abstract class Shape
{
    abstract public String draw();
}
class Rectangle extends Shape{
  
    public String draw() 
    {
      String a="rectangle(somthing that you can't buy or sell)";
    	return a;
    }
    
}

class Line extends Shape{
  
    public String draw() 
    {
    	String a="chain+first alphabet=?";
    	return a;
    }
}


class Cube extends Shape {
    
      public String draw() {
    	  String a="what do you call nation without a nation=?";
    	  return a;
      }
}


public class Assignment2Q5{
    public static void main(String[] args)
    {
    	Shape s1;
    	s1=new Line();
    	String q=s1.draw();
    	System.out.println(q);
    	
    	s1=new Rectangle();
    	String r=s1.draw();
    	System.out.println(r);
    	
    	s1=new Cube();
    	String d=s1.draw();
    	System.out.println(d);
    	
    }
}
