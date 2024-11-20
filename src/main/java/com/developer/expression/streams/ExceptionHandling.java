package com.developer.expression.streams;

import java.util.function.BiConsumer;

public class ExceptionHandling {
	
	
	public static void main(String args[]) {
		
		int numbers[] = {1,2,3,4};
		
		int key =2;
		
		performOperation(numbers,key,wrapperLambda((v,k)-> System.out.println(v/k)));
	}

	private static void performOperation(int[] numbers, int key, BiConsumer<Integer,Integer> consumer) {
		for(int i : numbers) {
			consumer.accept(i, key);
		}
		
	}
	
	private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
		return (v,k)-> {
			try {
				consumer.accept(v, k);
			}catch(ArithmeticException e) {
				System.out.println("Sorry");
			}
		};
		
	}

}
