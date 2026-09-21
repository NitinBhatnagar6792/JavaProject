package courses.in28minutes;

import java.util.List;

sealed abstract class Vehicle permits Car, Jeep, Truck {

	abstract public void move();
}

non-sealed class Truck extends Vehicle {
	public void move() {
		System.out.println("Truck is moving");
	}
}

sealed class Car extends Vehicle permits BentlyCar {
	public void move() {
		System.out.println("Car is moving");
	}
}

final class Jeep extends Vehicle {

	public void move() {
		System.out.println("Jeep is moving");
	}
	
}

final class BentlyCar extends Car {

	public void move() {
		System.out.println("Bently Car is moving");
	}
	
}


public class TestSealedClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Vehicle> vehicles = List.of(new Car(), new Jeep(), new BentlyCar(), new Truck());
		for(Vehicle v: vehicles) {
			v.move();
		}
	}

}
