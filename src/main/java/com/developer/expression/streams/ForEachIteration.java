package com.developer.expression.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ForEachIteration {

	public static void main(String args[]) {
		
		List<Student> studentList = Arrays.asList(
				new Student("Sachin","Mishra",21),
				new Student("Karthik","M",21),
				new Student("Adarsh","Tripathi",21),
				new Student("Abhijit","Banerjee",24),
				new Student("Nilkanta","Banerjee",25),
				new Student("Arpan","Mukherjee",26)
				);
		
		//studentList.forEach(s -> System.out.println(s.toString()));
		
		//studentList.forEach(System.out::println);
		
//		List<Student> filteredList = studentList.stream().filter(b -> b.getFirstName().startsWith("A")).collect(Collectors.toList());
//		filteredList.forEach(System.out::println);
		
		Collection<Student> names = studentList.stream().collect(Collectors.toMap(s->s.getRollNumber(),Function.identity(),(a,b)-> a)).values();
		names.stream().forEach(System.out::println);
	}

}
