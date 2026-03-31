package test;

/*
Move all zeros to end of array
 
Input: arr[] = {1, 2, 0, 4, 3, 0, 5, 0}
Output: arr[] = {1, 2, 4, 3, 5, 0, 0, 0}

 */
public class TestAbc {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
		int count = arr.length;
		int i = 0;
		int availablePos = 0;
		for (i = 0; i< count; i++) {
			if (arr[i] != 0) {
				arr[availablePos++] = arr[i];
			}
		}
		for (int j = availablePos; j< count; j++) {
			arr[j] = 0;
		}
		for (int k=0; k< count; k++) {
			System.out.print(arr[k]+",");
		}
		System.out.println();
	}

	public static void sol1() {
		
		
		int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
		int count = arr.length;
		int [] outArr = new int [count];
		
		// Arrays.fill(outArr, 0);
		
		int i = 0;
		int l = 0;
		for (i = 0; i< count; i++) {
			if (arr[i] != 0) {
				outArr[l++] = arr[i];
			}
		}
//		for (int j = l; j< count; j++) {
//			outArr[j] = 0;
//		}
		for (int k=0; k< count; k++) {
			System.out.print(outArr[k]+",");
		}
		System.out.println();
	}

}
