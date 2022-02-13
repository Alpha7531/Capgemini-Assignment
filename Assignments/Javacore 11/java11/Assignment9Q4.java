package Java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment9Q4 {
	public static void main(String[] args) {
		var path="C:\\Users\\samuel\\eclipse-workspace\\practice java d structure\\src\\Java11\\StudentList.txt";
       
			
			String data;
			try {
				data = Files.readString(Path.of(path));
				
				int count=0;
				//puting all the data into list
				List<String> list=data.lines().collect(Collectors.toList());
				 
		          
				for(String i:list) {
					if(i.isBlank()==true) {
						
					}
					else {
						count=count+1;
						System.out.println(count+")"+i);
						
					}
					
				}
				System.out.println("Total number of student:"+count);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		
		}
		
	}


