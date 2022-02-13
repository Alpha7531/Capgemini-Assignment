package Java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment9Q3 {
  
    public static void main(String[] args)
    {
  
        String str = "A quick brown fox jumps over the lazy dog";
         //spkit use to convert string to char
        String[] strSplit = str.split(" ");
        
        //converting spited char to arraylist
           List<String> strList = new ArrayList<>();
           strList=Arrays.asList(strSplit);
           
         //converting arraylist to arrays
           String[] a = strList.toArray(String[]::new);
           System.out.println(Arrays.toString(a));
         
           
    }
    
}