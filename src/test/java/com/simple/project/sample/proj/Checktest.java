package com.simple.project.sample.proj;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Checktest {

	@BeforeTest
	public void beforeTest() {
		System.out.println("before checktest");
	}
	
	@Test
	public void Test() {
		System.out.println("in checktest");

	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after checktest");
	}
}
