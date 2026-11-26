package courses.functional_programing.course03;

import java.util.List;

import courses.functional_programing.course03.records.Car;
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
	
	public static List<Car> getCarList() {
		
		return List.of(
			    new Car("Toyota", "Camry", "White", 28000.00),
			    new Car("Honda", "Civic", "Black", 24500.00),
			    new Car("Ford", "Mustang", "Red", 42000.00),
			    new Car("Toyota", "Camry", "Blue", 65000.00),
			    new Car("Tesla", "Model 3", "White", 39999.00),
			    new Car("Audi", "A4", "Silver", 21500.00),
			    new Car("Audi", "A4", "Black", 41000.00),
			    new Car("Toyota", "Corolla", "Red", 22500.00),
			    new Car("Ford", "Mustang", "Blue", 47000.00),
			    new Car("Honda", "Civic", "Blue", 26000.00)
			);
	}
	
}
