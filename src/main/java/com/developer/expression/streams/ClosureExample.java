package com.developer.expression.streams;

public class ClosureExample {
	
	
	public static void main(String args[]) {
		
		int a =10;
		int b=20;
		
		addition(a, k-> System.out.println(k+b));
	}

	private static void addition(int a, Perform perform) {
		
		perform.add(a);
	}

}

interface Perform{
	public abstract void add(int a);
}
