package collection;
import java.time.LocalDate;
import java.util.LinkedList;

class Dates
{
	LocalDate date;
     boolean leap;
public Dates(LocalDate date, boolean leap) {
	
	this.date = date;
	this.leap = leap;
}	
}
public class Assignment6Q4 {

	public static void main(String[] args) {
		
LocalDate ld1= LocalDate.of(1998,9,26);
boolean b1= ld1.isLeapYear();
LocalDate ld2= LocalDate.of(2006, 9, 26);
boolean b2= ld2.isLeapYear();
LocalDate ld3= LocalDate.of(2012, 9, 26);
boolean b3= ld3.isLeapYear();

Dates d1=new Dates(ld1, b1);
Dates d2=new Dates(ld2, b2);
Dates d3=new Dates(ld3, b3);
LinkedList<Dates> l1=new LinkedList<>();
l1.add(d1);
l1.add(d2);
l1.add(d3);

for (Dates dates : l1) {
	System.out.println("Your date of birth is"+dates.date+"\n"+" leap year:"+dates.leap+"\n");
}
	}

}