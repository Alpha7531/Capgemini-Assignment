package Annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//creating annotation 

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

//making multi variable annotation
@interface Info{
	long AuthorID();
	String Date();
	String Time();
	double Version();
	
	}
	
@Info( AuthorID = 118755, Date = "06/02/2022", Time = "9:00Am", Version = 1.25)
class main{
	
	
	}

public class Assignment7Q2 {
	public static void main(String[] args) {
		
		main obj= new main();
		Class c=obj.getClass();
		Annotation an= (Annotation) c.getAnnotation(Info.class);
		Info i = (Info) an;
		System.out.println(i.AuthorID()+"\n"+i.Date()+"\n"+i.Time()+"\n"+i.Version());

		
		
	}}


