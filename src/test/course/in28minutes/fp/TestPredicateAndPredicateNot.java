package test.course.in28minutes.fp;

import java.util.List;
import java.util.function.Predicate;

public class TestPredicateAndPredicateNot {

	
	public static boolean isEven(Integer number) {
		return number % 2 ==0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(1,2,3,4,5,6);
		// using predicate
		Predicate<Integer> isEvenNumberPredicate = number -> number %2 ==0;
		System.out.println("even numbers");
		numbers.stream().filter(isEvenNumberPredicate).forEach(System.out::println);
		
		// using method reference
		System.out.println("even numbers again");
		numbers.stream().filter(TestPredicateAndPredicateNot::isEven).forEach(System.out::println);
		
		// using negate()
		Predicate<Integer> isOddNumberPredicate = isEvenNumberPredicate.negate();
		System.out.println("odd numbers");
		numbers.stream().filter(isOddNumberPredicate).forEach(System.out::println);
		
		// using method reference + Predicate.not()
		System.out.println("odd numbers again");
		numbers.stream().filter(Predicate.not(TestPredicateAndPredicateNot::isEven)).forEach(System.out::println);
		
	}

}
