package courses.functional_programing.course03;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Section06Excercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(5,5, 1, 1, 2, 2, 3, 4);
	
		System.out.println("*************** removeDuplicateNumbersUsingDistinct(numbers) *******************************");
		// remove duplicate numbers using distinct()
		removeDuplicateNumbersUsingDistinct(numbers);
		
		System.out.println("*************** removeDuplicateNumbersUsingCollectorsToSet(numbers) *******************************");
		// remove duplicate numbers using Collectors.toSet()
		removeDuplicateNumbersUsingCollectorsToSet(numbers);

		System.out.println("*************** convertListToSpecificSet(numbers) *******************************");
		// remove duplicate numbers by using specific Set class using Collectors.toCollection
		convertListToSpecificSet(numbers);
	
	}

	// remove duplicate numbers using distinct()
	private static void removeDuplicateNumbersUsingDistinct(List<Integer> numbers) {
		
		System.out.println("Input List having duplicates="+ numbers);
		List<Integer> distinctNumbers = numbers.stream()
				.distinct()
				.toList();
		System.out.println("List having unique numbers="+ distinctNumbers);
	}

	// remove duplicate numbers using Collectors.toSet()
	private static void removeDuplicateNumbersUsingCollectorsToSet(List<Integer> numbers) {
		
		System.out.println("Input List having duplicates="+ numbers);
		List<Integer> distinctNumbers = numbers.stream()
				.collect(Collectors.toSet())
				.stream()
				.toList();
		System.out.println("List having unique numbers="+ distinctNumbers);
	
	}

	
	// remove duplicate numbers by using specific Set class using Collectors.toCollection
	private static void convertListToSpecificSet(List<Integer> numbers) {
		
		System.out.println("Input List having duplicates="+ numbers);
		HashSet<Integer> hashSet = numbers.stream()
				.collect(Collectors.toCollection(HashSet::new));
		System.out.println("hashSet(insertion order not maintained)="+ hashSet);
		
		
		LinkedHashSet<Integer> linkedHashSet = numbers.stream()
				.collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println("linkedHashSet(insertion order in maintained)="+ linkedHashSet);
		
		
	}
	
}
