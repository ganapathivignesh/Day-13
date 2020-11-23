package com.test;

import static org.junit.Assert.*;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.Test;

public class Maintest {

	public static void main(String[]args)
	{
		Result result=JUnitCore.runClasses(AllTests.class);
		
		for(Failure failure:result.getFailures())
		{
			System.out.println(result.wasSuccessful());
		}
		System.out.println(result.wasSuccessful());
	}
	


}
