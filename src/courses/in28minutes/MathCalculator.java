package courses.in28minutes;

import java.util.Scanner;

public class MathCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean loop = true;
		System.out.println("********** Calculator Welcome ***********");
		int num1 = -1;
		int num2 = -1;
		int operationNumber = -1;
		int result = -1;

		try (Scanner scanner  = new Scanner(System.in)) {
			while(loop) {
				result = -1;
				System.out.println("Enter a number corresponding to operation");
				System.out.println("1 = ADD, 2 = Substract, 3 = Divide, 4 = Multiply, any other number exit loop");
				operationNumber = scanner.nextInt();
				if (operationNumber <1 || operationNumber > 4) {
					loop = false;
					System.out.println("********** Calculator Bye ***********");
					break;
				}
				System.out.println("Enter 1st Number:");
				num1 = scanner.nextInt();
				System.out.println("Enter 2nd Number:");
				num2 = scanner.nextInt();
				if (operationNumber  ==3 && num2 == 0) {
					System.out.println("number2 cannot be zero for Div operation");
					continue;
				}
				switch (operationNumber) {
				case 1: {
					result = num1 + num2;
					break;
				}
				case 2: {
					result = num1 - num2;
					break;
				}
				case 3: {
					result = num1 / num2;
					break;
				}
				case 4: {
					result = num1 * num2;
					break;
				}
				}
				System.out.println("Result is:"+ result);
			}
		} catch (Exception e) {
			System.out.println("Exiting due to error:"+e);
			e.printStackTrace();
		}
		
		
	}

}
