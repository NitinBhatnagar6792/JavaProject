package test.again;

import java.util.Objects;

public class TestRecords {

	record Person(String name, int age) {
		Person {
			if (name == null) throw new IllegalArgumentException();
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, age);
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Jack", 50);
		System.out.println(p);
	}

}
