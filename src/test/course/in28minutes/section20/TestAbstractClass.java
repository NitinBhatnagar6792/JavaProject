package test.course.in28minutes.section20;

public class TestAbstractClass {

	public static void main(String[] args) {
		
		Animal [] animals = {new Cat(), new Dog()};
		for (Animal animal: animals) {
			animal.bark();
		}
	}

}
