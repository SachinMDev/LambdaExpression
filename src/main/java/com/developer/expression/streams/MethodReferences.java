package com.developer.expression.streams;

import java.util.function.Consumer;

public class MethodReferences {
	
	public static void main(String args[]) {
		
		Thread thread = new Thread(() -> printMessage(System.out::println));
		thread.start();
	}
	
	
	public static void printMessage(Consumer consume) {
		consume.accept("Hello World");
	}

}
