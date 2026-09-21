package courses.in28minutes.fp;

import java.util.stream.Stream;

public class TestStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//11, 14, 17, 20, 23
		Stream<Integer> intStream = Stream.iterate(11, n -> n+3).limit(5);
		intStream.forEach(System.out::println);
		
		System.out.println("==Fibonacci=");
		// Fibonacci F(n) = F(n-1)+ F(n-2)
		// 0,1,1,2,3,5,8
		Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
	      .limit(5)
	      .map(fib -> fib[0])
	      .forEach(System.out::println);
		
		System.out.println("==Fibonacci using record=");
		// Using record
		Stream.iterate(new Fib(0,1), fib -> new Fib(fib.b(), fib.a() + fib.b())).limit(5)
		  .map(fib -> fib.a())
		  .forEach(System.out::println);
	
	}

	record Fib (int a, int b) {}
	
    public static void fibonacciTraditional (int limit) {
        int a = 0, b = 1;
        for (int i = 0; i < limit; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}
