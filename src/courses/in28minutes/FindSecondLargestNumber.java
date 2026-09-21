package courses.in28minutes;

import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		
//		int [] arr = {6, 5, 7, 9, 2, 4, 9};
		int [] arr = {3,2,1, 6,7,8};
		System.out.println("result = "+findSecondLargestElement(arr));
	}

	/**
	 * This method finds and returns the second largest element in the given array.
	 * 
	 * @param array the array in which to find the second largest element
	 * @return the second largest element in the array
	 */

	public static int findSecondLargestElement(int[] array) {
		// TODO: Write your code here
		// [6, 5, 7, 9, 2, 4, 9] [5,5,5, 4, 4 ]
		if (array == null || array.length <= 1)
			return -1;
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		int curr;
		for (int i = 0; i < array.length; i++) {
			curr = array[i];
			if (curr > largest && curr > secondlargest) {
				secondlargest = largest;
				largest = curr;
			} else if (curr > secondlargest && curr < largest) {
				secondlargest = curr;
			}
		}
		//List l;
		
		return secondlargest == Integer.MIN_VALUE ? -1 : secondlargest;
	}
}