package courses.in28minutes.fp.course02;

import java.util.List;

public class HandsOnSection02Step6 {

	public static void main(String[] args) {
		
		// Input for Exercises
		List<Integer> numbers = List.of(2, 3, 8, 6, 5);
		List<String> courses = List.of("Spring", "Spring Boot", "AWS", "Micoservices", "Azure", "Docker", "Spring Data JPA");
		
		// Exercise 01: print square of even numbers
		printSquareOfEvenNumbers(numbers);
		
		// Exercise 02: print the cubes of numbers
		printCubeOfNumbers(numbers);
		
		// Exercise 03: print the number of characters in course
		printNumberOfCharectersInCourse(courses);

		}
	
	// Exercise 01: print square of even numbers
	private static void printSquareOfEvenNumbers(List<Integer> numbers) {
		System.out.println("======================================================");
		System.out.println("Exercise 01: print square of even numbers");
		System.out.println("Input List = "+ numbers);
		System.out.println("-----------------------Output start--------------------");
		
		numbers.stream()
		.filter(i -> i %2 == 0)
		.map(i -> "Square of %s \t= %s".formatted(i, i*i))
		.forEach(System.out::println);
		
		System.out.println("-----------------------Output end--------------------");
	}
	

	// Exercise 02: print the cubes of numbers
	private static void printCubeOfNumbers(List<Integer> numbers) {
		System.out.println("======================================================");
		System.out.println("Exercise 02: print the cubes of numbers");
		System.out.println("Input List = "+ numbers);
		System.out.println("-----------------------Output start--------------------");
		
		numbers.stream()
		.map(i -> "Cube of %s \t= %s".formatted(i, i*i*i))
		.forEach(System.out::println);
		
		System.out.println("-----------------------Output end--------------------");
	}
	
	// Exercise 03: print the number of characters in course
	private static void printNumberOfCharectersInCourse(List<String> courses) {
		System.out.println("======================================================");
		System.out.println("Exercise 03: print the number of characters in course");
		System.out.println("Input List = "+ courses);
		System.out.println("-----------------------Output start--------------------");
		
		courses.stream()
		.map(c -> "%s \t= Length of course '%s'".formatted(c.length(),c))
		.forEach(System.out::println);
		
		System.out.println("-----------------------Output end--------------------");
		
	}
	
}
