package courses.in28minutes;

import java.util.List;

public class TestTypeInference {

	// var x; // This is not allowed can only be used as locally variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name1 = List.of("A", "B");
		List<String> name2 = List.of("C", "D");
		List<List<String>> nameLists = List.of(name1, name2); // complex left side variable
		var typeInference = List.of(name1, name2); // this is type inference
		// Type Inference is done at compile time
		typeInference.get(0); // all methods are available to use with var
		
		// var can be used in loops also
		for (var i = 0; i<5; i++) {
			System.out.println(i);
		}
		
		// you cannot assign null to a var
		// var x = null; // error => Cannot infer type for local variable initialized to 'null'
	
		var var = "You can have a vaiable name as var";
		System.out.println(var);
	
	}

}
