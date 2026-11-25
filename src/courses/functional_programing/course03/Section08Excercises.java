package courses.functional_programing.course03;

import java.util.Arrays;

public class Section08Excercises {

	public static void main(String[] args) {
		
		int[] numbers = {3, 1, 7, 5, 9 };

		System.out.println("*************** findAnyNumberLessThan() *******************************");
		// filter car list by color
		findAnyNumberLessThan(numbers, 7);
		
		System.out.println("*************** findFirstGreaterThan() *******************************");
		// find 1st number greater than provided value
		findFirstGreaterThan(numbers, 4);
	}
	
	// find any number less than cutoff
	private static void findAnyNumberLessThan(int[] numbers, int cutoff) {
		
		System.out.println("input numbers="+Arrays.toString(numbers));
		System.out.println("cutOff="+cutoff);
		int anyNumber = Arrays.stream(numbers)
			.filter( i -> i <= cutoff)
			.findAny()
			.orElse(-1);
		System.out.println("anyNumber = "+anyNumber);
		
	}
	
	// find 1st number greater than provided value
	private static void findFirstGreaterThan(int[] numbers, int providedValue) {

		System.out.println("input numbers="+Arrays.toString(numbers));
		System.out.println("providedValue="+providedValue);
		int result = Arrays.stream(numbers)
			.filter( i -> i >=providedValue)
			.findFirst()
			.orElse(-1);
		System.out.println("result = "+result);
		
	}
	
}
