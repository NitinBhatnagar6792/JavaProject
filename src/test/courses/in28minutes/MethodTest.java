package test.courses.in28minutes;

public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = '\u00B6';
		System.out.println("ch="+ch+ ",in int="+(int)ch);
		printNumbers(3);
		printSquareOfNumbers(-3);
		printTableOf(5);
	}

	public static void printNumbers(int n) {
		System.out.println("printNumbers:");
		if (n < 1) {
			System.out.println("Please provide positive number");
			return;
		}
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
	
	public static void printSquareOfNumbers(int n) {
		System.out.println("printSquareOfNumbers:");
		if (n < 1) {
			System.out.println("Please provide positive number");
			return;
		}
		for (int i = 1; i <= n; i++) {
			System.out.println(i*i);
		}
	}
	
	public static void printTableOf(int n) {
		System.out.println("printTableOf:");
		if (n < 1) {
			System.out.println("Please provide positive number");
			return;
		}
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n*i);
		}
	}
	
	
}
