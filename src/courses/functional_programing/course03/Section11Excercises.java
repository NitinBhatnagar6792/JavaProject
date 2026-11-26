package courses.functional_programing.course03;

import java.util.Arrays;
import java.util.List;

public class Section11Excercises {

	public static void main(String[] args) {
	
		List<Integer> numbers = Arrays.asList(1, 3, 5, null);
		List<List<String>> listOfFruitBaskets= List.of(
				List.of("Apple", "Orange", "Apple"),
				List.of("Kiwi" , "Mango", "Orange"),
				List.of("Grapes", "Pineapple", "Kiwi")
				);
	
		System.out.println("*************** findSumOfNumbers() *******************************");
		// find the sum of input numbers
		findSumOfNumbers(numbers);

		System.out.println("*************** flatFruitBasketList() *******************************");
		// combine all the list of fruits into one common list
		flatFruitBasketList(listOfFruitBaskets);

	}
	
	// find the sum of input numbers
	private static void findSumOfNumbers(List<Integer> numbers) {

		System.out.println("Input numbers="+numbers);

		// using reduce method with custom lambda
		Integer sum1 = numbers.stream()
				.filter(i -> i != null)
				.reduce((x,y)-> x+y)
				.orElse(0);
		System.out.println("sum of numbers = "+sum1);

		// using reduce method with Integer::sum
		Integer sum2 = numbers.stream()
				.filter(i -> i != null)
				.reduce(Integer::sum)
				.orElse(0);
		System.out.println("sum of numbers = "+sum2);
	
		// using mapToInt and using sum()
		// This is consider a better approach since un-boxing is done once 
		int sum3 = numbers.stream()
				.filter(i -> i != null)
				.mapToInt( i -> i.intValue())
				.sum();
		System.out.println("sum of numbers = "+sum3);
	}

	// combine all the list of fruits into one common list
	private static void flatFruitBasketList(List<List<String>> listOfFruitBaskets) {
		
		System.out.println("listOfFruitBaskets="+listOfFruitBaskets);
		List<String> fruits = listOfFruitBaskets.stream().flatMap(f -> f.stream()).toList();
		System.out.println("fruits="+fruits);
		
	}

}


