package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Accounttest1 {

	@Test
	public void testWithdraw() {
	
		Account a=new Account("raj",45782637,10000f);
		a.deposit(4000f);
		System.out.println("amount withdrawn");
		assertEquals(true,a.withdraw(1000f, 10f));
	}

}
