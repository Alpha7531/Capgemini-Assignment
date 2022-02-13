package Java11;

public class Assignment9Q2 {
	/*  1)Var Keyword cannot be used for instance variables and global variables as we  can use var only for local variables (in methods). */
	
    /*  you will get error when you put var in global
     * var x=100;
	public static void main(String[] args) {
		System.out.println(x);
		*/
	
	public static void main(String[] args) {
		var x=100;
		System.out.println(x);
		
	}
     /* 2) Var cannot be used for method signatures (in return types and parameters).*/
	  //public static void main(var d) {
		
	}}
     /*3)Var cannot be used in Lambda expressions.
      //ans:Because a lambda expression by itself does not have a type.
    /* 4) Var cannot be used to declare a variable without explicit initialization.*/
       1) var x;
       2) var x = null; //this is also not valid
    /* 5) Var cannot be used as or with a Generic type.*/
	
	 
}
