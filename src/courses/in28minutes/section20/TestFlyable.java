package courses.in28minutes.section20;

import java.util.List;

public class TestFlyable {

	public static void main(String[] args) {
		
		List<Flyable> flyableObjects = List.of(new Bird(), new Aeroplane());
		flyableObjects.stream().forEach(x-> x.fly());
	}

}
