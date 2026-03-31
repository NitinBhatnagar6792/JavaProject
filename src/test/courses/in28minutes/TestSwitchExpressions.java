package test.courses.in28minutes;

public class TestSwitchExpressions {

	public static String getDayOfWeekTraditionalSwitch(int day) {

		String dayName = "Invalid";
		switch (day) {
		case 0:
			dayName = "Sun";
			break;
		case 1:
			dayName = "Mon";
			break;
		case 2:
			dayName = "Tue";
			break;
		case 3:
			dayName = "Wed";
			break;
		case 4:
			dayName = "Thu";
			break;
		case 5:
			dayName = "Fri";
			break;
		case 6:
			dayName = "Sat";
			break;
		}
		return dayName;
	}

	public static String getDayOfWeekSwitchExpression(int day) {
		// unlike traditional switch there is no fall through in case of switch expression
		// so not break keyword is needed
		String dayName = switch (day) {
		case 0 -> "Sun";
		case 1 -> "Mon";
		case 2 -> "Tue";
		case 3 -> "Wed";
		case 4 -> "Thu";
		case 5 -> "Fri";
		case 6 -> "Sat";
		default -> "Invalid";
		};
		return dayName;
	}

	public static String getDayOfWeekSwitchExpressionYield(int day) {

		String dayName = switch (day) {
		case 0 -> {
			System.out.println("some multiline complex coding here");
			yield "Sun";
		}
		case 1 -> {
			System.out.println("day =1, so mon");
			yield "Mon";
		}
		case 2 -> "Tue";
		case 3 -> "Wed";
		case 4 -> "Thu";
		case 5 -> "Fri";
		case 6 -> "Sat";
		default -> "Invalid";
		};
		return dayName;
	}
	
	public static void main(String[] args) {

		System.out.println("TraditionalSwitch:"+getDayOfWeekTraditionalSwitch(1));
		System.out.println("SwitchExpression:"+getDayOfWeekSwitchExpression(1));
		System.out.println("SwitchExpressionYield:"+getDayOfWeekSwitchExpressionYield(1));
	}
}
