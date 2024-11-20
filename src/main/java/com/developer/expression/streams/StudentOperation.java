package com.developer.expression.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StudentOperation {
	
	
	public static void main(String args[]) {
		
		List<Student> studentList = Arrays.asList(
				new Student("Sachin","Mishra",21),
				new Student("Karthik","M",22),
				new Student("Adarsh","Tripathi",23)
				);
		
		Collections.sort(studentList,(o1,o2) -> o1.getLastName().compareTo(o2.getLastName()));
		
		//printAllLists(studentList);
		
		printWithLastNameC(studentList, s-> true,s -> System.out.println(s.toString()));
		
		printWithLastNameC(studentList, (s)-> s.getLastName().startsWith("M"),s -> System.out.println(s.toString()));
		
		
		
		
	}

	private static void printWithLastNameC(List<Student> studentList, Predicate<Student> condition, Consumer<Student> c) {
		
		for(Student stu : studentList) {
			if(condition.test(stu)) {
				c.accept(stu);
			}
		}
	}

}

//interface Condition{
//	boolean test(Student s);
//}
