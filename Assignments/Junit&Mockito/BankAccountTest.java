package io.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BankAccountTest {
	BankAccount b;
	
	@BeforeEach
	void object() {
		b=new BankAccount();
		
	}

	@Test
	void test1() {assertThrows(InsufficientFundsExpcetion.class,()->b.withdraw(21000));}
	
	@Test
	void test2() {assertThrows(InsufficientFundsExpcetion.class,()->b.withdraw(3000));}
	
	@Test
	void test3() {assertThrows(InsufficientFundsExpcetion.class,()->b.withdraw(20000));}

}
