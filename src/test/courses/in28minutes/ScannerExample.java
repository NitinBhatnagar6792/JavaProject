package test.courses.in28minutes;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a number from 1 to 20 to calculate its square, or any other value to exit");
		String currLine = null;

		try {
			while (scanner.hasNext()) {
				currLine = scanner.nextLine();
				int number = Integer.parseInt(currLine);
				if (number <= 0 || number > 20) {
					System.out.println("exiting bye");
					break;
				}
				System.out.printf("Square of %d is %d\n", number, number * number);
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Invalid input exiting");
		} finally {
			scanner.close();
		}
	}

}
