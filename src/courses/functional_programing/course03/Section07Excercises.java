package courses.functional_programing.course03;

import java.util.List;
import java.util.stream.Collectors;

import courses.functional_programing.course03.records.Car;

public class Section07Excercises {

	public static void main(String[] args) {
		
		List<Car> cars = MockData.getCarList();

		System.out.println("*************** filterCarsByColor() *******************************");
		// filter car list by color
		filterCarsByColor(cars, "Blue");

		System.out.println("*************** printAllTheCarMaker() *******************************");
		// find and pring all the car make
		printAllTheCarMake(cars);
		
		System.out.println("*************** printAverageCarPrice() *******************************");
		// calculate average car price for a car make
		printAverageCarPrice(cars, "Toyota");
		
	}
	
	// filter car list by color
	private static void filterCarsByColor(List<Car> cars, String color) {
		
		System.out.println("Total Input cars count="+cars.size());
		System.out.println("Input cars list="+cars);
		System.out.println("** Filtered list by color="+color);
		cars.stream()
			.filter( c-> c.color().equalsIgnoreCase("Blue"))
			.forEach(System.out::println);
	}

	// find and pring all the car make
	private static void printAllTheCarMake(List<Car> cars) {
		
		System.out.println("Total Input cars count="+cars.size());
		System.out.println("Input cars list="+cars);
		System.out.println("** listing all the distinct car make");
		cars.stream()
			.map( c-> c.make())
			.distinct()
			.forEach(System.out::println);
	}
	
	// calculate average car price for a car make
	private static void printAverageCarPrice(List<Car> cars, String make) {
		
		System.out.println("Total Input cars count="+cars.size());
		System.out.println("Input cars list="+cars);
		Double average1 = cars.stream()
				.filter(c-> c.make().equalsIgnoreCase(make))
				.mapToDouble( c -> c.price())
				.average()
				.orElse(0d);
		System.out.printf("** Approach1: average car price for car having make '%s' is %s \n", make, average1);

		Double average2 = cars.stream()
				.filter(c-> c.make().equalsIgnoreCase(make))
				.collect(Collectors.averagingDouble( c-> c.price()));
		System.out.printf("** Approach2: average car price for car having make '%s' is %s \n", make, average2);
	
	}
	
}
