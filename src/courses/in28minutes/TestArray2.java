package courses.in28minutes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thusday", "Friday", "Saturday"};
		String longestDay = "";
		int l = 0;
		for (String day: days) {
			if (l < day.length()) {
				l = day.length();
				longestDay = day;
			}
		}
		
		System.out.println("longestDay is:"+longestDay);
		int count = days.length;
		System.out.println("days in reverse order:");
		for (int i = count -1; i>=0; i-- ) {
			System.out.println(days[i]);
		}
		System.out.println("New List:");
		//String [] arrNew = removeNthElement(days,7);
		//String [] arrNew = removeNthElementUsingArrayList(days,7);
		String [] arrNew = removeNthElementLoop(days,3);
		System.out.println(Arrays.toString(arrNew));
	}

	private static String [] removeNthElement(String [] arr, int nthElement) {
		if (arr == null || nthElement <= 0 || nthElement > arr.length) return null;
		// 0,1,2*,3,4,5
		// nthElement = 3
		String [] newArr = new String[arr.length-1];
		System.arraycopy(arr, 0, newArr, 0, nthElement-1);
		System.arraycopy(arr, nthElement, newArr, nthElement-1, arr.length - nthElement);
		return newArr;
	}

	private static String [] removeNthElementUsingArrayList(String [] arr, int nthElement) {
		if (arr == null || nthElement <= 0 || nthElement > arr.length) return null;
		// 0,1,2*,3,4,5
		// nthElement = 3
		ArrayList<String> newList = new ArrayList<>(Arrays.asList(arr));
		newList.remove(nthElement-1);
		return newList.toArray(new String[0]);
	}

	private static String [] removeNthElementLoop(String [] arr, int nthElement) {
		if (arr == null || nthElement <= 0 || nthElement > arr.length) return null;
		// 0,1,2*,3,4,5
		// nthElement = 3
		String [] newArr = new String[arr.length-1];
		for (int i=0; i< nthElement-1; i++) {
			newArr[i] = arr[i];
		}
		for (int j=nthElement; j< arr.length; j++) {
			newArr[j-1] = arr[j];
		}
		
		return newArr;
	}
	
}
