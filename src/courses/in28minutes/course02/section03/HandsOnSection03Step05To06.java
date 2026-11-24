package courses.in28minutes.course02.section03;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This Class covers hands on for Section 03 -> points Step 05 to Step 06
 * Mainly related to using stream distinct(), sorted() functions
 * Also making use of Comparator function like reverseOrder(), reversed(), comparing()
 */
public class HandsOnSection03Step05To06 {

	public static void main(String[] args) {
		
		// Input for Exercises
		List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4);
		List<String> courses = List.of("Spring", "Spring Boot", "AWS", "Micoservices", "Azure", "Docker", "Spring Data JPA");
		
		// Exercise 01: print only distinct numbers present in the list
		printDistinctNumbers(numbers);

		// Exercise 02: Use distinct and then sort the numbers both in ascending and then descending order
		sortDistinctNumbers(numbers);

		// Exercise 03: Sort courses by course length
		sortCoursesByCourseLength(courses);
		
	}

	// Exercise 01: print only distinct numbers present in the list
	private static void printDistinctNumbers(List<Integer> numbers) {
		System.out.println("======================================================");
		System.out.println("Exercise 01: print only distinct numbers present in the list");
		System.out.println("Input List = "+ numbers);
		System.out.println("-----------------------Output start--------------------");
		
		numbers.stream().distinct().forEach(System.out::println);
		
		System.out.println("======================================================");
		
	}

	// Exercise 02: Use distinct and then sort the numbers both in ascending and then descending order
	private static void sortDistinctNumbers(List<Integer> numbers) {
		System.out.println("======================================================");
		System.out.println("Exercise 02: Use distinct and then sort the numbers both in ascending and then descending order");
		System.out.println("Input List = "+ numbers);
		System.out.println("-----------------------Output start--------------------");
		
		// old way for creating a list from stream
		List<Integer> distinctNumbersOldWay = numbers.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println("# distinctNumbersOldWay = "+ distinctNumbersOldWay);

		// new way is to use this toList() method
		List<Integer> distinctNumbers = numbers.stream()
				.distinct()
				.toList(); 

		System.out.println("# distinctNumbers = "+ distinctNumbers);
		
		System.out.println("# acending order - built in method");
		distinctNumbers.stream()
			.sorted()
			.forEach(System.out::println);

		System.out.println("# acending order - custom comparator");
		distinctNumbers.stream()
			.sorted( (x,y) -> x.compareTo(y))
			.forEach(System.out::println);
		
		System.out.println("# descending order- built in method");
		distinctNumbers.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);

		System.out.println("# descending order- custom comparator plus using Comparator.reversed()");
		Comparator<Integer> reversedComparator = (x,y) -> x.compareTo(y);
		
		distinctNumbers.stream()
			.sorted(reversedComparator.reversed())
			.forEach(System.out::println);
		
		System.out.println("======================================================");
		
	}

	// Exercise 03: Sort courses by course length
	private static void sortCoursesByCourseLength(List<String> courses) {
		System.out.println("======================================================");
		System.out.println("Exercise 03: Sort courses by course length");
		System.out.println("Input List = "+ courses);
		System.out.println("-----------------------Output start--------------------");

		System.out.println("# using Integer.compare() method");
		courses.stream()
			.sorted((x,y) -> Integer.compare(x.length(), y.length()))
			.forEach(System.out::println);
		
		System.out.println("# using Comparator.comparing method");
		courses.stream()
			.sorted(Comparator.comparing( c -> c.length()))
			.forEach(System.out::println);
		
		System.out.println("======================================================");
		
	}
	
}
