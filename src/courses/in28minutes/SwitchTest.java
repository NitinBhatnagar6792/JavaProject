package courses.in28minutes;

public class SwitchTest {

	enum WeekDay {
		Sun(0),Mon(1),Tue(2),Wed(3),Thu(4),Fri(5),Sat(6);
		int day;
		WeekDay (int day) {
			this.day = day;
		}
		public static WeekDay valueOf(int dayNum) {
			switch(dayNum) {
			case 0: return Sun;
			case 1: return Mon;
			case 2: return Tue;
			case 3: return Wed;
			case 4: return Thu;
			case 5: return Fri;
			case 6: return Sat;
			}
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		//testIsWeekDay();
		//testDetermineNameOfMonth();
		testDetermineNameOfday();
		
		testSwitchExpression(WeekDay.Tue);
	}

	private static void testSwitchExpression(WeekDay weekDay) {
		String msg= switch(weekDay) {
		case Mon -> "Start of week day";
		case Tue, Wed, Thu -> "Mid of the week";
		case Fri -> "Last day of work week";
		default -> "relax its weekend";
		};
		System.out.println(msg);
	}

	public static void testDetermineNameOfday() {
		System.out.println("determineNameOfday(-1):"+determineNameOfday(-1));
		System.out.println("determineNameOfday(0):"+determineNameOfday(0));
		System.out.println("determineNameOfday(1):"+determineNameOfday(1));
		System.out.println("determineNameOfday(6):"+determineNameOfday(6));
	}
	
	public static String determineNameOfday(int dayNum) {
		WeekDay wd = WeekDay.valueOf(dayNum);
		return wd != null ? wd.name() : "Invalid value";
	}

	public static void testDetermineNameOfMonth() {
		System.out.println("determineNameOfMonth(-1)"+ determineNameOfMonth(-1));
		System.out.println("determineNameOfMonth(0)"+ determineNameOfMonth(0));
		System.out.println("determineNameOfMonth(1)"+ determineNameOfMonth(1));
		System.out.println("determineNameOfMonth(12)"+ determineNameOfMonth(12));
	}
	
	// 1 = jan, 2 = Feb ... 12 = Dec, and rest invalid input
	public static String determineNameOfMonth(int monthNumber) {
	
		switch (monthNumber) {
		case 1: return "Jan";
		case 2: return "Feb";
		case 3: return "Mar";
		case 4: return "Apr";
		case 5: return "May";
		case 6: return "June";
		case 7: return "July";
		case 8: return "Aug";
		case 9: return "Sep";
		case 10: return "Oct";
		case 11: return "Nov";
		case 12: return "Dec";
		}
		return "Invalid Input";
	}
	
	
	public static void testIsWeekDay() {
		System.out.println("isWeekDay(-1)="+isWeekDay(-1));
		System.out.println("isWeekDay(0)="+isWeekDay(0));
		System.out.println("isWeekDay(1)="+isWeekDay(1));
		System.out.println("isWeekDay(5)="+isWeekDay(5));
		System.out.println("isWeekDay(6)="+isWeekDay(6));
		System.out.println("isWeekDay(7)="+isWeekDay(7));
	}
	
	/**
	 * 0 = sunday, 1 = monday ... 6 = Saturday
	 */
	public static boolean isWeekDay(int dayNumber) {
		if (dayNumber < 0 || dayNumber > 6) {
			//System.out.println("Invalid input");
			return false;
		}
		if (dayNumber > 0 && dayNumber < 6) {
			//System.out.println("Is week day");
			return true;
		}
		return false;
	}
}
