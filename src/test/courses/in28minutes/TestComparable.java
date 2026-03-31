package test.courses.in28minutes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons = new ArrayList<>(List.of(new Person(20, "A"), new Person(10, "B"), new Person(30, "C")));
		System.out.println("org:"+persons);
		Collections.sort(persons);
		System.out.println("sorted:"+persons);
	}

}
