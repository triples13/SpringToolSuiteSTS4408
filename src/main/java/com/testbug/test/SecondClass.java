package com.testbug.test;

public class SecondClass {

	// reference declaration without using @Autowired annotation and without instantiation
	ClassImplements reference;
	
	public void test(){
		reference.sum();//compile time error should show here
	}
	
}
