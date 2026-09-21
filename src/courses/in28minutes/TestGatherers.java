package courses.in28minutes;

import java.util.stream.Gatherers;
import java.util.stream.IntStream;

public class TestGatherers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var numbers = IntStream.rangeClosed(1,3).boxed();
		numbers.gather(Gatherers.windowSliding(2)).forEach(System.out::println); 
	}

}
