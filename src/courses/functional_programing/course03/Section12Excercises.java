package courses.functional_programing.course03;

import java.util.List;
import java.util.stream.Collectors;

public class Section12Excercises {

	public static void main(String[] args) {
	
		List<String> fruits = List.of("Apple", "Banana", "Kiwi");

		System.out.println("*************** joinListOfStrings() *******************************");
		// join list of string into one comma separated string
		joinListOfStrings(fruits);
		
	}

	// join list of string into one comma separated string
	private static void joinListOfStrings(List<String> fruits) {
		
		System.out.println("Input list="+fruits);
		
		// using String.join()
		String joinedString1 = String.join(",", fruits);
		System.out.println("Using String.join() joined String = "+joinedString1);
		
		// Using Streams
		String joinedString2 = fruits.stream().collect(Collectors.joining(","));
		System.out.println("Using Streams joined String = "+joinedString2);
	}
	
}
