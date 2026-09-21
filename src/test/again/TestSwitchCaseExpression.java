package test.again;

public class TestSwitchCaseExpression {

	public static void main(String[] args) {

		int dayCode = 1;
		// below is traditional switch case
		String dayName = "";
		switch (dayCode) {
			case 0: dayName =  "Sunday"; break;
			case 1: dayName =  "Monday"; break;
			default : dayName =  "Invalid";
		}

		// below is new switch case expression for the above code
		dayName = switch(dayCode) {
			case 0 -> "Sunday"; // no need of yield in case on single statement
			case 1 -> {
				yield "Monday"; // use yield in case of multi-line code 
			}
			default -> "Invalid";
		};
		
		System.out.println("dayName="+dayName);
	}

}
