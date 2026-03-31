package test.courses.in28minutes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PersonComparaor implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId());
	}
	
}


public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons = new ArrayList<>(List.of(new Person(20, "A"), new Person(10, "B"), new Person(30, "C")));
		System.out.println("org:"+persons);
		//Collections.sort(persons, new PersonComparaor());
		persons.sort(new PersonComparaor());
		System.out.println("sorted:"+persons);

	}

}
