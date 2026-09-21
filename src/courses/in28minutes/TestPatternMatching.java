package courses.in28minutes;

public class TestPatternMatching {

	// Java 14 
	public static void instanceofImprovment() {
		Object objStr = "Some string object";
		
		// old way
		if (objStr instanceof String) {
			String str = (String)objStr;
			System.out.println("to upper string:"+str.toUpperCase());
		}
		
		// new way java 14: here we do not need extra line => String str1 = (String)objStr;
		if (objStr instanceof String str1) {
			System.out.println("to lower string:"+str1.toLowerCase());
		}
		
	}

	record Transation (String sender, String receiver, int amount) {}
	record Customer (String name, String email) {}
	record Product (String name, int price) {}
	record Order (Customer customer, Product product) {}
	
	// Pattern Matching for Records
	public static void recordsPatternMatching() {
		
		Object objTransaction = new Transation("senderA", "receiverB", 100);
		
		if (objTransaction instanceof Transation transaction) {
			String sender = transaction.sender();
			String receiver = transaction.receiver();
			int amount = transaction.amount();
			System.out.printf("old way sender=%s, receiver=%s, amount=%d\n", sender, receiver, amount);
		}
		// Java 21 allows de-construction in instanceof
		if (objTransaction instanceof Transation (String sender, String receiver, int amount)) {
			System.out.printf("new way sender=%s, receiver=%s, amount=%d\n", sender, receiver, amount);
		}
	
		Object objOrder = new Order(new Customer("customerA", "a@gmail.com"), new Product("productB", 100));
		
		// nested de-construction of recored in instanceof
		if (objOrder instanceof Order (Customer(var custName, var custEmail), Product(var prodName, var prodPrice)) ) {
			System.out.println("custName="+custName);
			System.out.println("custEmail="+custEmail);
			System.out.println("prodName="+prodName);
			System.out.println("prodPrice="+prodPrice);
		}
	}
	
	
	public static void main(String[] args) {
		//instanceofImprovment();
		recordsPatternMatching();
	}

}
