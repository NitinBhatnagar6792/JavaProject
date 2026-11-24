package courses.functional_programing.course03;

import java.util.Comparator;
import java.util.List;

public class Section05Excercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(3, -6, 10, 7, 6);
		
		System.out.println("*************** findMinNumber(numbers) *******************************");
		findMinNumber(numbers);
		
		System.out.println("*************** findMaxNumber(numbers) *******************************");
		findMaxNumber(numbers);
	}

	// find minimum number in the list
	private static void findMinNumber(List<Integer> numbers) {
		System.out.println("List of number:"+numbers);
		
		Integer minNumber1 = numbers.stream()
				.min((x,y) -> x < y ? -1 : 1)
				.orElse(-1);
		System.out.println("min is="+minNumber1);

		Integer minNumber2 = numbers.stream()
				.min(Integer::compareTo)
				.orElse(-1);
		System.out.println("min is="+minNumber2);

		Integer minNumber3 = numbers.stream()
				.min(Comparator.naturalOrder())
				.orElse(-1);
		System.out.println("min is="+minNumber3);
		
	}

	// find maximum number in the list
	private static void findMaxNumber(List<Integer> numbers) {
		System.out.println("List of number:"+numbers);
		Integer maxNumber1 = numbers.stream()
				.max((x,y) -> x < y ? -1 : 1)
				.orElse(-1);
		System.out.println("max is="+maxNumber1);

		Integer maxNumber2 = numbers.stream()
				.max(Integer::compareTo)
				.orElse(-1);
		System.out.println("max is="+maxNumber2);
	
		Integer maxNumber3 = numbers.stream()
				.max(Comparator.naturalOrder())
				.orElse(-1);
		System.out.println("max is="+maxNumber3);

	}


}
