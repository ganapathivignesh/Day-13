package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Accounttest {

	@Test
	public void testDeposit() {
	
		Account a=new Account("raj",45782637,10000f);
		System.out.println("deposited amount");
		assertEquals(true,a.deposit(4000f));
	}

}
