package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Accounttest3 {

	@Test
	public void testGetAccountNumber() {
		
		Account a=new Account("raj",45782637,10000f);
		System.out.println("retrived acount number");
		assertEquals(45782637,a.getAccountNumber());
	}

}
