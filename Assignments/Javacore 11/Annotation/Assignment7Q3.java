package Annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) 
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	
	int Sequence(); 
	
}


class sequence{
	@Execute(Sequence=2)
	void method1() {
		method2();
		
	}
	
	@Execute(Sequence=1)
	void method2() {
		method3();
		
	}
	
	
	
	@Execute(Sequence=3)
	void method3() {
		System.out.println("Knock the door it will be opened,ask anything you will be given ,if you try succes will bow,if You Are Lazy you get nothing ");
	}
	
	
}
public class Assignment7Q3 {
	
	public static void main(String[] args) {
		sequence s=new sequence();
		s.method1();
	}
	

}
