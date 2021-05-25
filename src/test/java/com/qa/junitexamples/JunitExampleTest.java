package com.qa.junitexamples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JunitExampleTest {
	// Assertions
		// =======
		// fail();
		// assetTrue | assertFalse
		// assertEquals| assertNotEquals
		// assertNull | assertNotNull
		// assertSame | assertNotSame
	@BeforeAll
	public static void Start() {
		System.out.println("Testing 1,2,3");
	}
	@Test
	public void test1(){
		assertEquals(28, Calculator.addCalc(3, 25));
		System.out.println("test1");
	}
	@Test
	public void test2(){
		assertEquals(-20, Calculator.subCalc(10, 30));	
		System.out.println("test2");
	}
	@Test
	public void test3(){
		assertEquals(160, Calculator.multiCalc(5, 32));	
		System.out.println("test3");
	}
	@Test
	public void test4(){
		assertEquals(0.7142857142857143, Calculator.divCalc(50, 70));
		System.out.println("test4");
	}
	@AfterAll
	public static void End() {
		System.out.println("Ending 1,2,3");
	}
}
