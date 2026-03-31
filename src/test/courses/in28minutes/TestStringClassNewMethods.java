package test.courses.in28minutes;

import java.util.stream.Stream;

class Sample {
	
	String str = null;
	
}
public class TestStringClassNewMethods {

	public static void main(String[] args) {
		// java 11
		String str = " LB ";
		System.out.println("original  string:"+str);
		System.out.println("use strip instead of trip:"+str.strip());
		
		String multiLines = "Line1\nLine2\r\nLine3";
		Stream<String> stream = multiLines.lines();
		System.out.println("string tokenized into lines:");
		stream.forEach(System.out::println);

		// Java 12
		String word = "UPPER";
		String transformedWord = word.transform( s-> s.substring(0,1).toUpperCase() +  s.substring(1).toLowerCase());
		System.out.println("original word:"+word);
		System.out.println("transformed word:"+transformedWord);
		
		// Java 13
		System.out.println("My name is %s and age is %d".formatted("Nitin", 48));
		
		// Java 14 more context was added when str is null, not it tell which object is null in x.y.str i.e x or y or str is null 
		//String nullString = null;
		//nullString.isBlank(); 
		/*
		 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "nullString" is null
			at JavaProject/test.course.in28minutes.TestStringClassNewMethods.main(TestStringClassNewMethods.java:29)
		 */
		//Sample sample23 = new Sample();
		//sample23.str.isBlank();
		/*
		 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isBlank()" because "sample23.str" is null
			at JavaProject/test.course.in28minutes.TestStringClassNewMethods.main(TestStringClassNewMethods.java:40) 
		 */
		//Sample sample23 = null;
		//sample23.str.isBlank();
		/*
		 * Exception in thread "main" java.lang.NullPointerException: Cannot read field "str" because "sample23" is null
			at JavaProject/test.course.in28minutes.TestStringClassNewMethods.main(TestStringClassNewMethods.java:40)
		 */

	}

}
