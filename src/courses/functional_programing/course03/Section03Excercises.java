package courses.functional_programing.course03;

import java.util.ArrayList;
import java.util.List;

import courses.functional_programing.course03.records.Person;

public class Section03Excercises {

	// Find people having age upto 18 and limit them to 3
	public static void main(String[] args) {
		
		List<Person> persons = MockData.getPersonList();
		
		System.out.println("** java7ImperativeStyle(persons) **");
		java7ImperativeStyle(persons);
		System.out.println("************************************");

		System.out.println("** java8DeclarativeStyle(persons) **");
		java8DeclarativeStyle(persons);
		System.out.println("************************************");
	}
	
	
	private static void java7ImperativeStyle(List<Person> persons) {

		List<Person> youngPeople = new ArrayList<>();
		for (Person p: persons) {
			if( p.age()<=18) youngPeople.add(p);
			if (youngPeople.size() >= 3) break;
		}

		System.out.println("List of youngPeople limited to max 3");
		for (Person p : youngPeople) {
			System.out.println(p);
		}
	}
	
	private static void java8DeclarativeStyle(List<Person> persons) {

		List<Person> youngPeople = persons.stream()
				.filter(p -> p.age() <= 18)
				.limit(3)
				.toList();

		System.out.println("List of youngPeople limited to max 3");
		youngPeople.forEach(System.out::println);
	}
	
	
}
