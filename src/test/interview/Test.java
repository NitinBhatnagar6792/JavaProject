package test.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

record Employee (int id, String dept, String name) {}

interface X {
	static void execute()  {
		System.out.println("Interface X");
	}
	
	default void test() {
		System.out.println("Interface X:test()");
	}
}

interface Y {

	default void test() {
		System.out.println("Interface Y:test()");
	}
}

class C implements X {
	static void execute()  {
		System.out.println("Class C");
	}
	public void test() {
		System.out.println("Class C:test()");
	}
}

class D implements X, Y {

	@Override
	public void test() {
		X.super.test();
	}
	
}



public class Test {

	public static void consumer(List<? extends Number> numbers) {
		
		for (Number n: numbers) {
			System.out.println(n);
		}
	}
	
	public static void producer(List<? super Number> numbers) {
		
		numbers.add(Integer.valueOf(0));
		numbers.add(Long.valueOf(0));
		numbers.add(Double.valueOf(0.0d));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		
		C c = new C();
		c.execute();
		c.test();
		
		X x1 = c;
		x1.test();
		X.execute();
		
		List<Number> numbers  = new ArrayList<>();
		producer(numbers);
		consumer(numbers);
		
		
		
		List<Employee> l = List.of(
				new Employee(1, "IT", "Nitin"),
				new Employee(2, "IT", "ABC"),
				new Employee(3, "Admin", "Alpha"),
				new Employee(4, "IT", "Beta")
				
				);
		String key = "IT";
		List<String> names =  l.stream().map(e -> e.name())
		.toList();
		System.out.println(names);
		
		var x =  l.stream().collect(Collectors.groupingBy(Employee::dept));
		System.out.println(x);

//		SELECT e.* from employee e
//		LEFT JOIN dept d On d.id = e.dept_id
//		where d IS NULL;
		
	}

	
	
	
}
