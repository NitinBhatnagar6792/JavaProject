package courses.in28minutes.course01.section20;

public class TestAbstractClass {

	public static void main(String[] args) {
		
		Animal [] animals = {new Cat(), new Dog()};
		for (Animal animal: animals) {
			animal.bark();
		}
	}

}
