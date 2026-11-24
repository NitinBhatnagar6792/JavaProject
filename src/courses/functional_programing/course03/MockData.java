package courses.functional_programing.course03;

import java.util.List;

import courses.functional_programing.course03.records.Person;

public class MockData {
	
	public static List<Person> getPersonList() {
		
		return List.of(
				new Person("Jack", 10),
				new Person("Sam", 40),
				new Person("Joe", 21),
				new Person("Frost", 15),
				new Person("Able", 8)
				);
		
	}
}
