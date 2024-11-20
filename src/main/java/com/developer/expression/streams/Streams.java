package com.developer.expression.streams;

import org.springframework.stereotype.Component;

@Component
public class Streams {
	
//	public void greet() {
//		System.out.println("Good Morning !");
//	}
//	
	
	public static void main(String args[]) {
//		StreamInterfaceImpl impl = new StreamInterfaceImpl();
//		impl.greeting("Hello World !!!");
		
		StreamInterface greet = () -> System.out.println("Hello World !!");
		greet.greeting();
		
		Add add = (a,b) -> System.out.println(a+b);
		add.addition(5, 5);
		
		
		findLengthOfAString((s1) -> s1.length());
		
		
	}
	
	public static void findLengthOfAString(StringLength l) {
		System.out.println(l.length("Sachin"));
	}

}

 interface Add {
	public void addition(int a, int b);
}
 
 interface StringLength{
	 public int length(String name);
 }
