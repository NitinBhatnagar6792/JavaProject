package test;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
	
	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "a b c 1 2 3 a b c d";
		Stream<String> st = Arrays.stream(input.split(" "));
		long c = st
				.filter(s -> !Character.isDigit(s.charAt(0)))
				.distinct().count();
		System.out.println(c);
	}
	
}
