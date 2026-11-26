package courses.functional_programing.course03;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import courses.functional_programing.course03.records.Car;

public class Section09Excercises {

	public static void main(String[] args) {

		List<Car> cars = MockData.getCarList();

		System.out.println("*************** countNumberOfCarsHavingColor() *******************************");
		// count number of car having same color
		countNumberOfCarsHavingColor(cars, "Red");
	
		System.out.println("*************** minPriceOfCarHavingColor() *******************************");
		// minimum price of car having some color
		minPriceOfCarHavingColor(cars, "Blue");

		System.out.println("*************** maxPriceOfCarHavingMake() *******************************");
		// maximum price of car having some make
		maxPriceOfCarHavingMake(cars, "Toyota");

		System.out.println("*************** sumOfPriceOfCarHavingModel() *******************************");
		// sum of price of car having some model
		sumOfPriceOfCarHavingModel(cars, "Mustang");
	
		System.out.println("*************** summaryStatisticsOnCarPrice() *******************************");
		// sum of price of car having some model
		summaryStatisticsOnCarPrice(cars);
	
	}

	// count number of car having same color
	private static void countNumberOfCarsHavingColor(List<Car> cars, String color) {
		
		System.out.println("Input list="+cars);
		long count = cars.stream()
				.filter(c-> c.color().equalsIgnoreCase(color))
				.count();
		System.out.printf("number of cars having '%s' color is %s\n", color, count);
	}

	// minimum price of car having some color
	private static void minPriceOfCarHavingColor(List<Car> cars, String color) {
		
		System.out.println("Input list="+cars);
		// recommended approach by using mapToDouble() & min()
		double minPrice1 = cars.stream()
			.filter(c-> c.color().equalsIgnoreCase(color))
			.mapToDouble(c -> c.price())
			.min()
			.orElse(0d);
		System.out.printf("Approach1: minimum price of '%s' colored car is %s\n", color, minPrice1);

		// using Collectors.minBy() & Comparator.comparingDouble()		
		Car minPricedCar2 = cars.stream()
				.filter(c-> c.color().equalsIgnoreCase(color))
				.collect(Collectors.minBy(Comparator.comparingDouble(c -> c.price())))
				.orElse(null);
		System.out.printf("Approach2: '%s' colored car having miminum price is : %s\n", color, minPricedCar2);
	
		// using Collectors.minBy() & Comparator.comparing()
		Car minPricedCar3 = cars.stream()
				.filter(c-> c.color().equalsIgnoreCase(color))
				.collect(Collectors.minBy(Comparator.comparing(c -> c.price())))
				.orElse(null);
		System.out.printf("Approach3: '%s' colored car having miminum price is : %s\n", color, minPricedCar3);
	}

	// maximum price of car having some make
	private static void maxPriceOfCarHavingMake(List<Car> cars, String make) {

		System.out.println("Input list="+cars);
		double maxCarPrice1 = cars.stream()
			.filter(c-> c.make().equalsIgnoreCase(make))
			.mapToDouble(c -> c.price())
			.max()
			.orElse(0d);
		System.out.printf("Approach1: maximum price of '%s' cars is %s\n", make, maxCarPrice1);
		
		Car maxPricedCar2 = cars.stream()
			.filter(c -> c.make().equalsIgnoreCase(make))
			.collect(Collectors.maxBy(Comparator.comparingDouble( c-> c.price())))
			.orElse(null);
		System.out.printf("Approach2: maximum priced '%s' cars is %s\n", make, maxPricedCar2);
		
		Car maxPricedCar3 =  cars.stream()
			.filter(c -> c.make().equalsIgnoreCase(make))
			.collect(Collectors.maxBy(Comparator.comparing(c -> c.price())))
			.orElse(null);
		System.out.printf("Approach3: maximum priced '%s' cars is %s\n", make, maxPricedCar3);
		
	}
	
	// sum of price of car having some model
	private static void sumOfPriceOfCarHavingModel(List<Car> cars, String model) {

		System.out.println("Input list="+cars);
		double sum1 = cars.stream()
			.filter(c -> c.model().equalsIgnoreCase(model))
			.mapToDouble(c-> c.price())
			.sum();
		System.out.printf("Approach1: sum of prices for cars having model '%s' is %s\n", model, sum1);
		
		double sum2 = cars.stream()
			.filter(c -> c.model().equalsIgnoreCase(model))
			.map(c-> c.price())
			.reduce(Double::sum)
			.orElse(0.d);
		System.out.printf("Approach2: sum of prices for cars having model '%s' is %s\n", model, sum2);
		
		// below is not a good Approach, however it is good for understanding reduce() method
		Car sum3 = cars.stream()
				.filter(c -> c.model().equalsIgnoreCase(model))
				.reduce((c1, c2) -> {
					return new Car(null, null, null, Double.sum(c1.price(), c2.price()));
				})
				.orElse(null);
		System.out.printf("Approach3: sum of prices for cars having model '%s' is %s\n", model, sum3.price());
		
	}
	
	// use summaryStatistics to get min, max and average car price
	private static void summaryStatisticsOnCarPrice(List<Car> cars) {
		
		DoubleSummaryStatistics stats = cars.stream()
				.mapToDouble(c -> c.price())
				.summaryStatistics();
		
		System.out.println("Input list="+cars);
		System.out.println("stats="+stats);
	}
}
