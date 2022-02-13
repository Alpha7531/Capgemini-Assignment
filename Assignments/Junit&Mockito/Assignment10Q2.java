package io.Junit;

import java.util.Arrays;

public class Assignment10Q2 {
	public String minmax(int array[]) {
	for (int i = 0; i < array.length; i++) {
		for (int j = i + 1; j < array.length; j++) {
			if (array[i] > array[j]) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
	
}
	int array1[]= {array[0],array[array.length-1]};
	String str=Arrays.toString(array1);
	return str;
}
	

}
