package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Accounttask {

	@Test
	public void testGetBalance() {

		Account a=new Account("raj",45782637,10000f);
		a.addInterest();
		double bal=10000f+(10000f*0.045f);
		System.out.println("retreived balance");
		assertEquals(bal,a.getBalance(),bal);
		
	}

}
