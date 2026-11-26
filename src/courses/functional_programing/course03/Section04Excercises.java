package courses.functional_programing.course03;

import java.util.List;
import java.util.stream.IntStream;

import courses.functional_programing.course03.records.Person;

public class Section04Excercises {

	public static void main(String[] args) {

		System.out.println("************** printIntegers(1, 5) ******************************");
		// print integer from startValue to endValue
		printIntegers(1, 5);
		
		System.out.println("*************** printPersonsUsingIntStreamRange()  *****************************");
		// iterate using IntStream::range and print all the persons
		printPersonsUsingIntStreamRange();

		System.out.println("*************** printPersonsUsingIntStreamIterator()  *****************************");
		// iterate using IntStream::iterator and print all the persons
		printPersonsUsingIntStreamIterator();
	
	}
	
	// print integer from startValue to endValue
	private static void printIntegers(int startValue, int endValue) {
		
		System.out.println("print integer from startValue to endValue where endValue is exclusive");
		IntStream.range(startValue, endValue).forEach(System.out::println);

		System.out.println("print integer from startValue to endValue where endValue is inclusive");
		IntStream.rangeClosed(startValue, endValue).forEach(System.out::println);

	}
	
	// iterate using IntStream::range and print all the persons
	private static void printPersonsUsingIntStreamRange() {
		List<Person> persons = MockData.getPersonList();
		System.out.println("** Printing all the persons using IntStream::range **");
		System.out.println("Length of the persons list = "+persons.size());
		IntStream.range(0, persons.size())
			.forEach( i -> System.out.printf("persons[%d] = %s\n", i, persons.get(i)));
	}

	// iterate using IntStream::iterator and print all the persons
	private static void printPersonsUsingIntStreamIterator() {
		List<Person> persons = MockData.getPersonList();
		System.out.println("** Printing all the persons using IntStream::iterator **");
		System.out.println("Length of the persons list = "+persons.size());
		IntStream.iterate(0, i -> i + 1)
			.limit(persons.size())
			.forEach(i -> System.out.printf("persons[%d] = %s\n", i, persons.get(i)));
	}


}
