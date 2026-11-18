package courses.in28minutes.fp.course02;

import java.util.List;

public class HandsOnSection02Step05 {

	public static void main(String[] args) {
		
		// Input for Exercises
		List<Integer> numbers  = List.of(11,3, 20, 10, 5, 2, 17);
		List<String> courses = List.of("Spring", "Spring Boot", "AWS", "Micoservices", "Azure", "Docker", "Spring Data JPA");
		
		// Exercise 01: print only odd numbers
		printOddNumbers(numbers);
		
		// Exercise 02: print all the courses
		printAllTheCouses(courses);

		// Exercise 03: print course containing word Spring
		printAllTheCousesContainingWord(courses, "Spring");
		
		// Exercise 04: print course whose length is atleast 5
		printAllTheCousesHavingLength(courses, 5);
		
	}
	
	// Exercise 01: print only odd numbers
	private static void printOddNumbers(List<Integer> numbers) {
		System.out.println("======================================================");
		System.out.println("Exercise 01: print only odd numbers");
		System.out.println("Input List = "+ numbers);
		System.out.println("-----------------------Output start--------------------");
		
		numbers.stream()
		.filter( i-> i % 2 != 0)
		.forEach(System.out::println);
		
		System.out.println("-----------------------Output end--------------------");
	}
	
	// Exercise 02: print all the courses
	private static void printAllTheCouses(List<String> courses) {
		System.out.println("======================================================");
		System.out.println("Exercise 02: print all the courses");
		System.out.println("Input List = "+ courses);
		System.out.println("-----------------------Output start--------------------");

		courses.stream()
		.forEach(System.out::println);
		
		System.out.println("======================================================");
	}

	
	// Exercise 03: print course containing word Spring
	private static void printAllTheCousesContainingWord(List<String> courses, String word) {
		System.out.println("======================================================");
		System.out.println("Exercise 03: print course containing word "+ word);
		System.out.println("Input List = "+ courses);
		System.out.println("Containing word = "+ word);
		System.out.println("-----------------------Output start--------------------");

		courses.stream()
		.filter(c-> c.contains(word))
		.forEach(System.out::println);
		
		System.out.println("======================================================");
	}

	// Exercise 04: print course whose length is atleast 5
	private static void printAllTheCousesHavingLength(List<String> courses, int wordLength) {
		System.out.println("======================================================");
		System.out.println("Exercise 04: print course whose length is atleast "+wordLength);
		System.out.println("Input List = "+ courses);
		System.out.println("Word length is atleast = "+ wordLength);
		System.out.println("-----------------------Output start--------------------");

		courses.stream()
		.filter(c-> c.length() >= wordLength)
		.forEach(System.out::println);
		
		System.out.println("======================================================");
	}
	
}
