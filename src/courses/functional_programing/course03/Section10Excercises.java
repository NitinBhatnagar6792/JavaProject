package courses.functional_programing.course03;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import courses.functional_programing.course03.records.Car;

public class Section10Excercises {

	public static void main(String[] args) {

		List<Car> cars = MockData.getCarList();
		List<String> basketofFruits = List.of("Apple", "Orange", "Apple", "Kiwi", "Grapes", "Kiwi", "Apple");
		
		System.out.println("*************** groupCarsByMake() *******************************");
		// group cars by make
		groupCarsByMake(cars);
				
		System.out.println("*************** groupCarsByMakeAndCountThem() *******************************");
		// group cars my make and count them
		groupCarsByMakeAndCountThem(cars);

		System.out.println("*************** countFruits() *******************************");
		// count number of each fruit in a basketofFruits
		countFruits(basketofFruits);

	}
	
	// group cars by make
	private static void groupCarsByMake(List<Car> cars) {
		
		System.out.println("Input list="+cars);
		Map<String, List<Car>> carsGroupedbyMake = cars.stream()
			.collect(Collectors.groupingBy(Car::make));

		System.out.println("grouped cars="+carsGroupedbyMake);
		
		System.out.println("** Iteration over carsGroupedbyMake map**");
		carsGroupedbyMake.entrySet().forEach(e -> {
			System.out.println("Key="+e.getKey());
			System.out.println("listOfcars="+ e.getValue());
		});
	}

	// group cars my make and count them
	private static void groupCarsByMakeAndCountThem(List<Car> cars) {
		
		System.out.println("Input list="+cars);
		Map<String, Long> countOfCarsGroupedbyMake = cars.stream()
			.collect(Collectors.groupingBy(Car::make, Collectors.counting()));

		System.out.println("countOfCarsGroupedbyMake="+countOfCarsGroupedbyMake);
		
	}
	
	// count number of each fruit in a basketofFruits
	private static void countFruits(List<String> basketofFruits) {
		
		System.out.println("basketofFruits="+basketofFruits);
		Map<String, Long> fruitsMap = basketofFruits.stream()
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("fruitsMap="+fruitsMap);
	}
}
