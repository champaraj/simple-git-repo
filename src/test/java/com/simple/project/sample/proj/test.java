package com.simple.project.sample.proj;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class test {

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@Test
	public void Test() {
		System.out.println("in test");

	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
	
}
