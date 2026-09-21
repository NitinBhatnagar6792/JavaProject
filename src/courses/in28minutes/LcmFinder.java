package courses.in28minutes;

public class LcmFinder {

	private int number1;
	private int number2;

	/**
	 * Constructor that initializes the two numbers.
	 * 
	 * @param number1: The first number.
	 * @param number2: The second number.
	 */
	public LcmFinder(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	/**
	 * Getter for the first number.
	 * 
	 * @return the first number.
	 */
	public int getNumber1() {
		return number1;
	}

	/**
	 * Getter for the second number.
	 * 
	 * @return the second number.
	 */
	public int getNumber2() {
		return number2;
	}

	/**
	 * Calculates and returns the least common multiple (LCM) of the two numbers. If
	 * either number is negative, returns -1 as the LCM for negative numbers is
	 * undefined. If either number is zero, returns 0 as the LCM of 0 and any other
	 * number is 0.
	 * 
	 * @return LCM of the two numbers, or -1 if either number is negative, or 0 if
	 *         either number is zero.
	 */
	public int calculateLCM() {
		// TODO: Write your code here
		if (number1 < 0 || number2 < 0)
			return -1;
		if (number1 == 0 || number2 == 0)
			return 0;

		int minNumber = -1;
		int maxNumber = -1;
		if (number1 > number2) {
			maxNumber = number1;
			minNumber = number2;
		} else {
			maxNumber = number2;
			minNumber = number1;
		}
		int lcmCandidate = maxNumber;
		while (true) {
			if (lcmCandidate % minNumber == 0) {
				break;
			}
			lcmCandidate += maxNumber;
		}
		return lcmCandidate;
	}

	private int gdc() {
		int a = number1;
		int b = number2;
		/*
		 * gcd(a, b) = gcd(b, a % b) // This is iterative Euclidean Algorithm a = 48, b
		 * = 18 a = 18, b = 48 % 18 = 12 a = 12, b = 18 % 12 = 0 GDC is a = 12 since now
		 * b = 0
		 */
		while (b > 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	private int gdcByLooping() {

		int min = Math.min(number1, number2);
		for (int i = min; i > 0; i--) {
			boolean isGDC = number1 % i == 0 && number2 % i == 0;
			if (isGDC)
				return i;
		}
		return -1;

	}

	public int calculateLCMUsingGDC() {

		return (number1 / gdc()) * number2;
	}

	public int calculateLCMUsingGDCLooping() {

		return (number1 / gdcByLooping()) * number2;
	}

	public static void main(String[] args) {
		System.out.println("lcm of 3 & 5 is:" + new LcmFinder(3, 5).calculateLCM());
		System.out.println("lcm of 6 & 8 is:" + new LcmFinder(6, 8).calculateLCM());
		System.out.println("lcm of 3 & 5 is:" + new LcmFinder(3, 5).calculateLCMUsingGDC());
		System.out.println("lcm of 6 & 8 is:" + new LcmFinder(6, 8).calculateLCMUsingGDC());
		System.out.println("lcm of 3 & 5 is:" + new LcmFinder(3, 5).calculateLCMUsingGDCLooping());
		System.out.println("lcm of 6 & 8 is:" + new LcmFinder(6, 8).calculateLCMUsingGDCLooping());
	}
}
