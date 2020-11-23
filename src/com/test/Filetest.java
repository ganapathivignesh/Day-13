package com.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class Filetest {

	@Test
	 void readWriteOperation() throws IOException {

		String name="done";  //expected value//
		Filetest f=new Filetest();
		String name1=f.readWriteOperation();
		assertEquals(name,name1);
	}
	@Test
	void readOperation() throws IOException()
	{
		String name="done";
		Filetest f=new Filetest();
		String name1=f.readOperation();
		assertEquals(name,name1);
	}
}
