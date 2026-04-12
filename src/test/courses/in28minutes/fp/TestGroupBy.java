package test.courses.in28minutes.fp;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

record Course(
	    String name, String category, 
	    int reviewScore, int students) {}


public class TestGroupBy {

	static List<Course> courses = List.of(
	        new Course("AWS", "Cloud", 95, 200000),
	        new Course("Azure", "Cloud", 90, 150000),
	        new Course("Docker", "Cloud", 85, 180000),
	        new Course("Kubernetes", "Cloud", 88, 170000),
	        new Course("Spring", "Framework", 97, 220000),
	        new Course("Spring Boot", "Framework", 93, 210000),
	        new Course("Microservices", "Microservices", 98, 250000),
	        new Course("FullStack", "FullStack", 96, 230000)
	    );

	public static void main(String[] args) {
		
				
		
		Map<String, List<Course>> mapOf =  courses.stream()
				.collect(Collectors.groupingBy(Course::category));
		
		System.out.println(mapOf);
		
		Map<String, List<String>> mapOfCatogoryByNames =  courses
				.stream()
				.collect(Collectors.groupingBy(Course::category, Collectors.mapping(Course::name, Collectors.toList())));
		
		System.out.println(mapOfCatogoryByNames);
		
		Map<String, Long> mapOfCatogoryCount =  courses
				.stream()
				.collect(Collectors.groupingBy(Course::category, Collectors.counting()));
		
		System.out.println(mapOfCatogoryCount);
		
		Map<String, Optional<Course>> mapOfCatogoryHigest =  courses
				.stream()
				.collect(Collectors.groupingBy(Course::category,
						Collectors.maxBy(Comparator.comparing(Course::reviewScore))
						));
		System.out.println(mapOfCatogoryHigest);
	}
}
