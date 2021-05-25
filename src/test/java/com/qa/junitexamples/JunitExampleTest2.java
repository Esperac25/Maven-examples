package com.qa.junitexamples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;


public class JunitExampleTest2 {
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
	public void test() {
		assertEquals(0, BlackJack.play(22, 23));
		System.out.println("Test1");
		assertEquals(20, BlackJack.play(22, 20));
		System.out.println("Test2");
		assertEquals(20, BlackJack.play(20, 23));
		System.out.println("Test3");
		assertEquals(19, BlackJack.play(18, 19));
		System.out.println("Test4");
	}
	@AfterAll
	public static void End() {
		System.out.println("Ending 1,2,3");
	}
}
