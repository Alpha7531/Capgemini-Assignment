package io.Junit;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MinMaxFinderTest {
	MinMaxFinder a;
	
	@BeforeEach
	void before(){
	a=new MinMaxFinder();
	}
	
	@Test
	@DisplayName("display minmax 1;")
	void test() {
		
		int exp[]= {3,56};
	    int b[]=new int[]{56, 34, 7,3, 54, 3, 34, 34, 53};

		assertArrayEquals(exp, a.minmax(b),"It will check first and last element");
			
	}
	@Test
	@DisplayName("display minmax 2;")
	void test1() {
		int exp[]= {5,85};
	    int b[]=new int[]{6,5,8,5,8,48,85,9,45,5};

		assertArrayEquals(exp, a.minmax(b),"It will check first and last element");
	}
	
	@Test
	@DisplayName("display minmax 3;")
	void test2() {
		int exp[]= {4,879};
	    int b[]=new int[]{45,879,4,6,96,67,6};

		assertArrayEquals(exp, a.minmax(b),"It will check first and last element");
	}
	
	

}
