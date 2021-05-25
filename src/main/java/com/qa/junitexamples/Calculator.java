package com.qa.junitexamples;


public class Calculator {

	public static void main(String[] args) {

		System.out.println(addCalc(3, 25));
		
		System.out.println(subCalc(10, 30));
		
		System.out.println(multiCalc(5, 32));
		
		System.out.println(divCalc(50, 70));

	}

	public static int addCalc(int i, int j) {
		return i + j;
	}

	public static int subCalc(int i, int j) {
		return i - j;

	}

	public static int multiCalc(int i, int j) {
		return i * j;
	}

	public static double divCalc(double i, double j) {
		return i / j;

	}

}