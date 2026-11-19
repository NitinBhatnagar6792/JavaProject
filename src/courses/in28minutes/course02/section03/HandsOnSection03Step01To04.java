package courses.in28minutes.course02.section03;

import java.util.List;

/**
 * This Class covers hands on for Section 03 -> points Step 01 to Step 04
 * Mainly related to using stream reduce() function 
 */
public class HandsOnSection03Step01To04 {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2, 3, 4);
		
		// Exercise 01: add all numbers using reduce function
		addNumbers(numbers);

		// Exercise 02: Find the largest number in the list using reduce function
		findLargestNumber(numbers);
		
		// Exercise 03: Square every number in the list and find the sum of squares
		sumOfSquareOfAllNumbers(numbers);

		// Exercise 04: Cube every number in the list and find the sum of cubes
		sumOfCubeOfAllNumbers(numbers);
		
		// Exercise 05: sum of odd numbers
		sumOfOddNumbers(numbers);
		
	}

	// Exercise 01: add all numbers using reduce function
	private static void addNumbers(List<Integer> numbers) {
		System.out.println("======================================================");
		System.out.println("Exercise 01: add all numbers using reduce function");
		System.out.println("Input List = "+ numbers);
		System.out.println("-----------------------Output start--------------------");
		
		Integer sum1 = numbers.stream().reduce((x,y) -> x+y).orElse(0);
		System.out.println("(01) Sum of numbers = "+sum1.intValue());
		
		// Using initial value then we do not need .orElse(0)
		Integer sum2 = numbers.stream().reduce(0, (x,y) -> x+y);
		System.out.println("(02) Sum of numbers = "+sum2.intValue());

		// Using method reference
		Integer sum3 = numbers.stream().reduce(0, HandsOnSection03Step01To04::add);
		System.out.println("(03) Sum of numbers = "+sum3.intValue());
		Integer sum4 = numbers.stream().reduce(HandsOnSection03Step01To04::add).orElse(0);
		System.out.println("(04) Sum of numbers = "+sum4.intValue());
		
		// Using pre-defined Integer::sum() function
		Integer sum5 = numbers.stream().reduce(Integer::sum).orElse(0);
		System.out.println("(05) Sum of numbers = "+sum5.intValue());
		
		System.out.println("======================================================");
		
	}

	/**
	 * @param x is aggregate
	 * @param y is nextNumber
	 * @return sum of input numbers x and y 
	 */
	private static int add(int x, int y) {
		//System.out.printf("%s, %s\n", x, y);
		return x + y;
	}

	// Exercise 02: Find the largest number in the list using reduce function
	private static void findLargestNumber(List<Integer> numbers) {
		System.out.println("======================================================");
		System.out.println("Exercise 02: Find the largest number in the list using reduce function");
		System.out.println("Input List = "+ numbers);
		System.out.println("-----------------------Output start--------------------");
		
		Integer largestNumber = numbers.stream().reduce((x, y) -> x > y ? x : y).orElse(0);
		System.out.println("(01) Largest number = "+largestNumber.intValue());
		
		System.out.println("======================================================");
		
	}

	// Exercise 03: Square every number in the list and find the sum of squares
	private static void sumOfSquareOfAllNumbers(List<Integer> numbers) {
		System.out.println("======================================================");
		System.out.println("// Exercise 03: Square every number in the list and find the sum of squares");
		System.out.println("Input List = "+ numbers);
		System.out.println("-----------------------Output start--------------------");
		
		Integer sumOfSquareOfNumbers = numbers.stream()
				.map(i-> {
					Integer square = i * i;
					System.out.printf("square of %d = %d\n", i, square);
					return square;
				})
				.reduce((x, y) -> x + y)
				.orElse(0);
		System.out.println("(01) Sum of Square of numbers = "+sumOfSquareOfNumbers.intValue());
		
		System.out.println("======================================================");
		
	}

	// Exercise 04: Cube every number in the list and find the sum of cubes
	private static void sumOfCubeOfAllNumbers(List<Integer> numbers) {
		System.out.println("======================================================");
		System.out.println("// Exercise 04: Cube every number in the list and find the sum of cubes");
		System.out.println("Input List = "+ numbers);
		System.out.println("-----------------------Output start--------------------");
		
		Integer sumOfCubeOfNumbers = numbers.stream()
				.map(i-> {
					Integer cube = i * i * i;
					System.out.printf("cube of %d = %d\n", i, cube);
					return cube;
				})
				.reduce((x, y) -> x + y)
				.orElse(0);
		System.out.println("(01) Sum of Cube of numbers = "+sumOfCubeOfNumbers.intValue());
		
		System.out.println("======================================================");
		
	}
	
	// Exercise 05: sum of odd numbers
	private static void sumOfOddNumbers(List<Integer> numbers) {
		System.out.println("======================================================");
		System.out.println("// Exercise 05: sum of odd numbers");
		System.out.println("Input List = "+ numbers);
		System.out.println("-----------------------Output start--------------------");
		
		Integer sumofOddNumbers = numbers.stream()
				.filter( i-> i %2 != 0)
				.reduce((x,y) -> x + y)
				.orElse(0);
		
		System.out.println("(01) Sum of odd numbers = "+sumofOddNumbers.intValue());
		
		System.out.println("======================================================");
		
	}
	
}
