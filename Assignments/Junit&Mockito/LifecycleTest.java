package io.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifecycleTest {
	Lifecycle hook;
	@BeforeAll
	static void beforeall(){
		System.out.println("starting program");
	}
	@AfterAll
	static void afterall(){
		System.out.println("End of the program");	
	}
	@BeforeEach
	void init(){
	hook=new Lifecycle();
	}
	@AfterEach
	void aftereach(){
		System.out.println("code succesfully ran");
	}
	@Test
	void add() {
		int expected=2;
		assertEquals(expected,hook.add(1, 1));
	}
	@Test
	void sub() {
		int expected=150;
		assertEquals(expected,hook.sub(300, 150));
	}
	@Test
	void mul() {
		int expected=72;
		assertEquals(expected,hook.mul(9, 8));
	}
	@Test
	void div() {
		int expected=50;
		assertEquals(expected,hook.div(100, 2));
	}
	

}
