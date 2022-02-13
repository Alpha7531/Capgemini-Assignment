package io.Junit;



public class MinMaxFinder {
	public int[] minmax(int array[]) {
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
		return array1;
	}
}
	

	
	
