package courses.in28minutes;

import java.time.LocalDate;

public class TestLocalDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println(localDate.withDayOfYear(1));
		
	}

}
