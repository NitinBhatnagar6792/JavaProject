package test.again;

public class TestVar {

	public static void main(String[] args) {
		
		//var v1 = null; // compilation error as java cannot decide the type of v1
		
		String s = null;
		var v2 = s; // this is valid since the type of v2 can be deducted from type of s 
		
		var var = "This is valid"; // we can have a variable by name as var
	}

}
