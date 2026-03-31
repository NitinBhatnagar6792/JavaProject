package test.courses.in28minutes.fp;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestSumReduce {

	public static void main(String[] args) {
	
		printSquareofFirstNNumbers(10);
		List<String> strList = List.of("Apple", "Orange", "Banana");
		printToLower(strList);
		printLength(strList);
		System.out.println("1st 5 square:");
		getSquareofFirstNNumbers(5).forEach(e -> System.out.println(e));
		
		System.out.println("-3 %2="+(-3 %2));
	}

	public static List<Integer> getSquareofFirstNNumbers(int n) {
//		return IntStream.range(1, n+1).map( e -> e*e)
//				.boxed()
//				.collect(Collectors.toList());
		return IntStream.range(1, n+1).map( e -> e*e)
				.boxed()
				.toList();
	}
	
	public static void printLength(List<String> strList) {
		strList.stream().map(s-> s.length()).forEach( e -> System.out.println(e));
	}
	
	public static void printToLower(List<String> strList) {
		strList.stream().map(s-> s.toLowerCase()).forEach( e -> System.out.println(e));
	}

	public static void printSquareofFirstNNumbers(int n) {
		IntStream.range(1, n+1).map( e -> e*e).forEach(sq -> System.out.println(sq));
	}
	
	public static void sumofOddNumbers() {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(1,2,3,4,5);
		int sum = list.stream()
		.filter(e -> e%2 == 1)
		.reduce(0, (e1, e2) -> e1 + e2);
	
		System.out.println("sum of odd numbers = "+sum);
		
	}

}
