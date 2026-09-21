package courses.in28minutes;

public class BiNumber {
	
	private int number1;
	private int number2;
	
	public BiNumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public int add () {
		return this.number1 + this.number2;
	}

	public int multiply () {
		return this.number1 * this.number2;
	}
	
	public void doubleIt () {
		this.number1 *= 2;
		this.number2 *= 2;
	}
	
	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2,3);
		System.out.println("add:"+numbers.add());
		System.out.println("multiply:"+numbers.multiply());
		numbers.doubleIt();
		System.out.println("number1="+numbers.getNumber1());
		System.out.println("number2="+numbers.getNumber2());
	}
}
