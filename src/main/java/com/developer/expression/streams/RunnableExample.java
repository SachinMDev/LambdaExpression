package com.developer.expression.streams;

public class RunnableExample {
	
	public static void main(String args[]) {
		
		Thread thread = new Thread(() -> System.out.println("Thread Name : "+ Thread.currentThread().getName()));
		
		thread.start();
	}

}
